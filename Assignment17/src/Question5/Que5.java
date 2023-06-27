
/*There are `n` friends that are playing a game. The friends are sitting in a circle and are numbered from 
`1` to `n` in **clockwise order**. More formally, moving clockwise from the `ith` friend brings you to the 
`(i+1)th` friend for `1 <= i < n`, and moving clockwise from the `nth` friend brings you to the `1st` friend.
The rules of the game are as follows:
1. **Start** at the `1st` friend.
2. Count the next `k` friends in the clockwise direction **including** the friend you started at. The counting 
wraps around the circle and may count some friends more than once.
3. The last friend you counted leaves the circle and loses the game.
4. If there is still more than one friend in the circle, go back to step `2` **starting** from the friend
 **immediately clockwise** of the friend who just lost and repeat.
5. Else, the last friend in the circle wins the game.
Given the number of friends, `n`, and an integer `k`, return *the winner of the game*.*/


package Question5;

import java.util.Queue;
import java.util.LinkedList;

public class Que5 {
	public static int winner(int n , int k) {
		
		Queue<Integer> std = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			std.add(i);
		}
		int start=0;
		int temp=k;
		while(std.size()!=1) {
			start=std.poll();
            temp--;
            if(temp==0)
                temp=k;
            else
                std.add(start);
            
        }
        return std.poll();
		}


	public static void main(String[] args) {
		int n=5;
		int k=2;
		System.out.println(winner(n,k));

	}
}