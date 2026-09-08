class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length - 1);
        return nums;
    }
    void divide(int arr[],int start,int end){
        if(start<end){
            int mid = start+(end-start)/2;
            divide(arr,start,mid);
            divide(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    void merge(int arr[],int start,int mid,int end){
        int s1 = mid-start+1;
        int s2 = end-mid;
        int arr1[] = new int[s1];
        int arr2[] = new int[s2];
        for(int i=0;i<s1;i++){
            arr1[i]=arr[i+start];
        }
        for(int i=0;i<s2;i++){
            arr2[i]=arr[mid+i+1];
        }
        int i=0,j=0,k=start;
        while(i<s1 && j<s2){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                k++;
                i++;
            }
            else{
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<s1){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<s2){
            arr[k]=arr2[j];
            k++;
            j++;
        }
    }
}