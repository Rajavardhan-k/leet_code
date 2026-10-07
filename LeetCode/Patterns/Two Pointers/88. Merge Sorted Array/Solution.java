class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for (int i=m;i<nums1.length;i++) {
            nums1[i]=nums2[j++];
        }
        divide(nums1,0,nums1.length-1);
    }
    void divide(int arr[],int start,int end) {
        if (start<end) {
            int mid=start+(end - start)/ 2;
            divide(arr,start,mid);
            divide(arr,mid+1,end);
            mergeSort(arr,start,mid,end);
        }
    }
    void mergeSort(int arr[],int start,int mid,int end) {
        int s1=mid-start+1;
        int s2=end-mid;
        int arr1[]=new int[s1];
        int arr2[]=new int[s2];
        for (int i=0;i<s1;i++) arr1[i]=arr[start+i];
        for (int i=0;i<s2;i++) arr2[i] = arr[mid+1+i];
        int i=0,j=0,k=start;
        while (i<s1&&j<s2) {
            if (arr1[i]<=arr2[j]) arr[k++]=arr1[i++];
            else arr[k++]=arr2[j++];
        }
        while (i<s1) arr[k++]=arr1[i++];
        while (j<s2) arr[k++]=arr2[j++];
    }
}