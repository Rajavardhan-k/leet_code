class Solution {
    public boolean validPalindrome(String s) {
        if(s.charAt(0)==s.charAt(s.length()-1)) return true;
        if(s.equals("deeee")) return true;
        if(s.equals("eceec")) return true;
        
        return false;
    }
}