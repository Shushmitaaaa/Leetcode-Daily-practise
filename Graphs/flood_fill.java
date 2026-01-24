class Solution {
    private static void dfs(int[][] mat,int sr,int sc,int original,int color,int row,int col){
        
        if(sr<0 || sr>=row || sc<0 || sc>=col || mat[sr][sc]!=original){
            return;
        }
        mat[sr][sc]=color;
        dfs(mat,sr,sc-1,original,color,row,col);
        dfs(mat,sr,sc+1,original,color,row,col);
        dfs(mat,sr-1,sc,original,color,row,col);
        dfs(mat,sr+1,sc,original,color,row,col);
            
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row=image.length;
        int col=image[0].length;
        int[][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=image[i][j];
            }
        }
        int original=mat[sr][sc];//1
        if (original == color) return mat;
        //mat[sr][sc]=color;
        dfs(mat,sr,sc,original,color,row,col);
        // dfs(mat,sr,sc+1,original,color,row,col);
        // dfs(mat,sr-1,sc,original,color,row,col);
        // dfs(mat,sr+1,sc,original,color,row,col);
        return mat; 

    }
}







class Solution {

    private void findCombinations(int ind,int[] arr,int target,List<List<Integer>> ans, List<Integer> ds){
        //base case
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));

            
            }
            return;
        }
        //recursion
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            findCombinations(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);

        }
        findCombinations(ind+1,arr,target,ans,ds);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target)  
    {
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
    
}