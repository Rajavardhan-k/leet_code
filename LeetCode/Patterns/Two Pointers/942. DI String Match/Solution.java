class Solution {
    public int[] diStringMatch(String s) {
        int i=0;int j=s.length();
        int k=0;
        int[] arr=new int[j+1];
        while(k<s.length()){
            if(s.charAt(k)=='I'){
                arr[k]=i;
                i++;
            }
            else{
                arr[k]=j;
                j--;
            }
            k++;
        }
        arr[s.length()] = i;
        return arr;
    }
}