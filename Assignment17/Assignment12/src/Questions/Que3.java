package Questions;

import Questions.Que2.ListNode;

public class Que3 {
	
	static class ListNode {
        ListNode next;
    }
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        ListNode curr=head;
        ListNode previous =null;
        int count=1;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=previous;
            curr=temp;
            count++;
        }
        if(count<n)
        	return null;
        
        head=previous;
        curr=head;
        while(--n!=0){
            curr=curr.next;
        }
        return curr;   
    }

	public static void main(String[] args) {
		
		

	}

}
