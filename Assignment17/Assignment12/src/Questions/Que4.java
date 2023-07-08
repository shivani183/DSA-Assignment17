
//Given a singly linked list of characters, write a function that returns true if the given list is a palindrome, else false.

package Questions;
import java.util.*;
public class Que4 {
	
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int d)
	    {
	        next = null;
	        val = d;
	    }

		}

	public static void main(String args[])
    {
    }
    static boolean isPalindrome(ListNode head)
    {
 
    	ListNode curr = head;
        boolean flag = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }
 
        while (head != null) {
 
            int i = stack.pop();
            if (head.val == i) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }
            head = head.next;
        }
        return flag;
    }
}
