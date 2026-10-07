/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        int count=0;
        ListNode temp1=head;
        ListNode temp2=head;
        int k=0;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        int arr[]=new int[count];
        while(temp2!=null){
            arr[k]=temp2.val;
            temp2=temp2.next;
            k++;
        }
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}