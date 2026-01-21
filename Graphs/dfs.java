class Solution {
    
    
    public static void dfsofGraph(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ls){
        vis[node]=true;
        ls.add(node);
        for(Integer it:adj.get(node)){
            if(vis[it]==false){
                vis[it]=true;
                dfsofGraph(it,vis,adj,ls);
            }
        }
    }
    

    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ls=new ArrayList<>();//dfs
        boolean vis[]=new boolean[adj.size()];
        vis[0]=true;
        dfsofGraph(0,vis,adj,ls);
        return ls;
    }
    
    
    
    
}