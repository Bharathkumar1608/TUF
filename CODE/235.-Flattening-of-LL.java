/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {
    public ListNode flattenLinkedList(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ListNode dum=temp;
            while(dum!=null){
                list.add(dum.val);
                dum=dum.child;
            }
            temp=temp.next;
        }
        Collections.sort(list);
        ListNode dum=new ListNode(0);
        temp=dum;
        for(int i=0;i<list.size();i++){
            temp.child=new ListNode(list.get(i));
            temp=temp.child;
        }
        return dum.child;
    }
}