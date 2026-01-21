class Solution {

    private static void dfs(int node,int[][] isConnected,int n,boolean vis[]){
        vis[node]=true;
        for(int i=0;i<n;i++){
            if(isConnected[node][i]==1 && !vis[i]){
                dfs(i,isConnected,n,vis);
               
            }
        }
    }

    //every dfs call is a new province
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis=new boolean[n];
        int province=0;

        for (int i=0;i<n;i++){
            if(!vis[i]){
                dfs(i,isConnected,n,vis);
                province++;
            }
        }
        return province;
        
    }
}