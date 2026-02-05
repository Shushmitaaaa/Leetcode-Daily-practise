class Solution {
    private static void combsum(int ind,int[] candidates,int target,List<List<Integer>> ans,List<Integer> ds){
        //base condition
        if(ind==candidates.length){
            if(target==0 ){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(candidates[ind]<=target){
            ds.add(candidates[ind]);
            combsum(ind+1,candidates,target-candidates[ind],ans,ds);
            ds.remove(ds.size()-1);//when you add something an dit exceeds the target you remove it and then call the fuction again otherwise!!
            
        }
        //to avoid duplicates
        int nextindex=ind+1;

        while(nextindex<candidates.length && candidates[ind]==candidates[nextindex]){
            nextindex++;
        }
        
        combsum(nextindex,candidates,target,ans,ds);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        combsum(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
}