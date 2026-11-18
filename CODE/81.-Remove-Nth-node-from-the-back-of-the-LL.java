
/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(len==n){
            return head.next;
        }
        int ind=len-n;
        temp=head;
        //int i=0;
        for(int i=0;i<ind-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}