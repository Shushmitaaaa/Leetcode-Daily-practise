class bfs {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfss=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean vis[] =new boolean[adj.size()];
        
        q.add(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfss.add(node);
        
        
            for(Integer it:adj.get(node)){
                if(vis[it]=false){
                    vis[it]=true;
                    q.add(it);
                }
                
            }
        }
        return bfss;
    }
}