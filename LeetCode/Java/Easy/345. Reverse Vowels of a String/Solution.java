class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        while(i<=j){
            if (vowels.indexOf(arr[i]) == -1) {
                i++;
                continue;
            } 
            else if (vowels.indexOf(arr[j]) == -1) {
                j--;
                continue;
            }
            else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}