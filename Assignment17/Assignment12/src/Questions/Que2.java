
//Given a linked list of N nodes. The task is to check if the linked list has a loop. 
//Linked list can contain self loop.

package Questions;



public class Que2{
	
	static class ListNode {
        ListNode next;
    }
 
	public boolean detectCycle(ListNode head) {
		if(head==null)
			return false;
        ListNode first = head;
        ListNode second = head;
        while(second!=null && second.next!=null){
            first =first.next;
            second = second.next.next;
            if(first == second){
                return true;
            }
        } 
        return false;
	}
        public static void main(String[] args) {
        	
        }
}
