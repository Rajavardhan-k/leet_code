class Solution {
    public int findJudge(int n, int[][] trust) {
        int indegree[]=new int [n+1];
        int outdegree[]=new int [n+1];
        for(int i=0;i<trust.length;i++){
            outdegree[trust[i][0]]++;
            indegree[trust[i][1]]++;
        }
        for(int j=1;j<=n;j++){
            if(indegree[j]==n-1&&outdegree[j]==0){
                return j;
            }
        }
        return -1;
    }
}