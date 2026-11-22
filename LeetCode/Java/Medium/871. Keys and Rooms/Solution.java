class Solution {
    void fun(List<List<Integer>> rooms,boolean vis[],ArrayList<Integer> al,int start){
        if(vis[start]) return;
        vis[start]=true;
        al.add(start);
        for(int i:rooms.get(start)){
            fun(rooms,vis,al,i);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        ArrayList<Integer> al=new ArrayList<>();
        if(rooms.size()==0) return true;
        boolean vis[]=new boolean[rooms.size()];
        fun(rooms,vis,al,0);
        int c=0;
        for(int i=0;i<vis.length;i++){
            if(vis[i]==true) c++;
        }
        if(c==vis.length) return true;
        return false;
    }
}