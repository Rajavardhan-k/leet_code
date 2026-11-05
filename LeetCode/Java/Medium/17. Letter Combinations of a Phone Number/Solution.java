class Solution {
    String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void fun(String digits,int idx,String s,List<String> al){
        if(digits==null) return;
        if(idx>=digits.length()){
            al.add(s);
            return;
        }
        int j=digits.charAt(idx)-'0';
        String k=arr[j];
        for(int i=0;i<k.length();i++){
            fun(digits,idx+1,s+k.charAt(i),al);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> al= new ArrayList<>();
        fun(digits,0,"",al);
        return al;
    }
}