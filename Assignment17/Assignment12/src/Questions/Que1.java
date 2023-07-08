
/*Given a singly linked list, delete middle of the linked list. For example, if given linked list is 1->2->3->4->5 then linked 
list should be modified to 1->2->4->5.If there are even nodes, then there would be two middle nodes, we need to delete the 
second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
If the input linked list is NULL or has 1 node, then it should return NULL.*/

package Questions;


class Solution {
	static class ListNode {
        ListNode next;
    }
	
	public ListNode deleteMiddle(ListNode head) {
        if(head==null && head.next==null)
            return head;
        ListNode curr= head;
        ListNode previous= null;
        int count=0;
        while(curr!=null){
            count++;
            curr= curr.next;
        }
        int mid= count/2;
        mid=mid-1;
        curr=head;
        while(mid!=0){
            ListNode temp =curr.next;
            curr=temp;
            mid=mid-1;
        }
        curr.next=curr.next.next;
        return head;
    }
}

