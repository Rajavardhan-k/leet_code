class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=Integer.MAX_VALUE;
        String str="";
        String ans="";
        for(String s : strs){
            if(s.length()<min) {min=s.length();str = s;}
        }
        for(int i=0;i<min;i++){
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=str.charAt(i)) return ans;
            }
            ans+=str.charAt(i);
        }
        return ans;
    }
}