package Questions;

/*Given a linked list of **N** nodes such that it may contain a loop.
A loop here means that the last node of the link list is connected to the node at position X(1-based index). 
If the link list does not have any loop, X=0.
Remove the loop from the linked list, if it is present, i.e. unlink the last node which is forming the loop.*/

import java.util.*;
public class Que5 {
	  class ListNode 
	  { int val; ListNode next; ListNode(int d) { 
		  next = null; 
		  val =d; }
	  }
	 
	public static void main(String args[])
    {
    }
    static ListNode removeLoop(ListNode head)
    {
    	ListNode slow = head;
    	ListNode fast = head;
        boolean flag = false;
 
        while (slow !=null && fast!=null && fast.next!=null) {
        	slow = slow.next;
        	fast = fast.next.next;
        	if(slow==fast)
        	{
        		ListNode N1 = slow;
                ListNode N2 = slow;
         
                ListNode previous = null;
                while (N1.next != N2) {
                    previous = N1;
                    N1 = N1.next;
                }
                previous.next = null;
            }
        	
        }
		return head;
    }
}
