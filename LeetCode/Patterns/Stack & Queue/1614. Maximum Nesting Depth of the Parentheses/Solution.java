class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int count=0;
        char[] a = s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='('){
                count++;
            }
            else if(a[i]==')'){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}