/*
Design a queue that supports `push` and `pop` operations in the front, middle, and back.
Implement the `FrontMiddleBack` class:
- `FrontMiddleBack()` Initializes the queue.
- `void pushFront(int val)` Adds `val` to the **front** of the queue.
- `void pushMiddle(int val)` Adds `val` to the **middle** of the queue.
- `void pushBack(int val)` Adds `val` to the **back** of the queue.
- `int popFront()` Removes the **front** element of the queue and returns it. If the queue is empty, return `1`.
- `int popMiddle()` Removes the **middle** element of the queue and returns it. If the queue is empty, return `1`.
- `int popBack()` Removes the **back** element of the queue and returns it. If the queue is empty, return `1`.
**Notice** that when there are **two** middle position choices, the operation is performed
* on the **frontmost** middle position choice. For example:
- Pushing `6` into the middle of `[1, 2, 3, 4, 5]` results in `[1, 2, 6, 3, 4, 5]`.
- Popping the middle from `[1, 2, 3, 4, 5, 6]` returns `3` and results in `[1, 2, 4, 5, 6]`.
*/

package Question7;
import java.util.LinkedList;

public class Que7 {
	LinkedList<Integer> q;

	public void FrontMiddleBack(){
			q= new LinkedList<>();
	}
	public void pushFront(int val) {
		q.add(0,val);
	}
	public void pushMiddle(int val) {
		q.add((q.size()-1)/2, val);
	}
	public void pushBack(int val) {
		q.add(q.size()-1,val);
		
	}public int popFront() {
		if(q.isEmpty())
			return 1;
		else
			return q.pop();
	}
	public int popMiddle() {
		if(q.isEmpty())
			return 1;
		else
			return q.remove((q.size()-1)/2);
	}
	public int popEnd() {
		if(q.isEmpty())
			return 1;
		else
			return q.removeLast();
	}
	

	public static void main(String[] args) {
		

	}
}