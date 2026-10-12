class Solution {
    public int countGoodSubstrings(String s) {
        int i=1;
        int count=0;
        while(i<s.length()-1){
            if(s.charAt(i-1)!=s.charAt(i) && s.charAt(i)!=s.charAt(i+1) && s.charAt(i-1)!=s.charAt(i+1)){
                count++;
            }
            i++;
        }
        return count;
    }
}