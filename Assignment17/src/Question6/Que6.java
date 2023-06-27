
/*You are given an integer array `deck`. There is a deck of cards where every card has a unique integer. 
 * The integer on the `ith` card is `deck[i]`.
You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.
You will do the following steps repeatedly until all cards are revealed:
1. Take the top card of the deck, reveal it, and take it out of the deck.
2. If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.
3. If there are still unrevealed cards, go back to step 1. Otherwise, stop.
Return *an ordering of the deck that would reveal the cards in increasing order*.
**Note** that the first entry in the answer is considered to be the top of the deck.*/

package Question6;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class Que6 {
	public static int[] cards(int[] deck) {
		Arrays.sort(deck);
		Queue<Integer> q = new LinkedList<>();

        for(int i = 0 ; i < deck.length ; i++){
            q.offer(i);
        }

		int ans[] = new int[deck.length];
		boolean flag = true;
		int i = 0;
		while (q.size() > 0) {
			if (flag) {
				int n = q.poll();
				ans[n] = deck[i];
				flag = false;
				i++;
			} else {
				q.offer(q.poll());
				flag = true;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] deck = { 17, 13, 11, 2, 3, 5, 7 };
		int ans[]=cards(deck);
		for(int  i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}
}