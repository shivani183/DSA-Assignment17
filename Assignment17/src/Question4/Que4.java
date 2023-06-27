/*
You have a `RecentCounter` class which counts the number of recent requests within a certain time frame.
Implement the `RecentCounter` class:
- `RecentCounter()` Initializes the counter with zero recent requests.
- `int ping(int t)` Adds a new request at time `t`, where `t` represents some time in milliseconds, and 
returns the number of requests that has happened in the past `3000` milliseconds (including the new request). 
Specifically, return the number of requests that have happened in the inclusive range `[t - 3000, t]`.
It is **guaranteed** that every call to `ping` uses a strictly larger value of `t` than the previous call.*/


package Question4;

import java.util.Queue;
import java.util.LinkedList;

public class Que4 {
	Queue<Integer> recentRequests = new LinkedList<Integer>();

	public int ping(int t) {
		recentRequests.offer(t);
		while (recentRequests.peek() < t - 3000) {
			recentRequests.poll();
		}
		return recentRequests.size();
	}

	public static void main(String[] args) {

	}
}