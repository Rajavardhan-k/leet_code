class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        char[] arr1 = name.toCharArray();
        char[] arr2 = typed.toCharArray();
        if(arr1.length>arr2.length) return false;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }
            else if(j>0 &&arr2[j]==arr2[j-1]){
                j++;
            }
            else return false;
        }
        if(arr1[arr1.length-1]!=arr2[arr2.length-1]) return false;
        while(j<arr2.length){
            if(arr2[j]!=arr2[j-1]){
                return false;
            }
            j++;
        }
        return true;
    }
}