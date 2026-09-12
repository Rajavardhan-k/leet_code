class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int k=0;
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        char[] arr3=new char[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            arr3[k]=arr1[i];
            i++;k++;
            arr3[k]=arr2[j];
            j++;k++;
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;k++;
        }
        return new String(arr3);
    }
}