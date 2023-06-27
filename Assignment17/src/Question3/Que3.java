/*
The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers `0` and `1` 
respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.
The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a **stack**.
At each step:
- If the student at the front of the queue **prefers** the sandwich on the top of the stack, they will **take it** and
leave the queue.
- Otherwise, they will **leave it** and go to the queue's end.
This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
You are given two integer arrays `students` and `sandwiches` where `sandwiches[i]` is the type of the `ith` sandwich 
in the stack (`i = 0` is the top of the stack) and `students[j]` is the preference of the `jth` student in the initial 
queue (`j = 0` is the front of the queue). Return *the number of students that are unable to eat.**/

package Question3;

import java.util.Queue;
import java.util.LinkedList;

public class Que3 {
	public static int studentLeft(int[] students, int[] sandwiches) {
		
		
		  Queue<Integer> stdQueue = new LinkedList<>();
		  
		  for (int n :students) { 
			  stdQueue.add(n); } 
		  int ans = 0;
		  int i = 0; 
		  while (!stdQueue.isEmpty()) { 
		  int std = stdQueue.poll();
		  
		  if (ans > stdQueue.size()) 
			  return stdQueue.size();
		  
		  if (std == sandwiches[i]) { 
			  ans = 0; 
			  i++; } 
		  else { 
			  
			  stdQueue.add(std); 
			  ans++;
		  } } 
		  return 0;
		 
	}

	public static void main(String[] args) {
		int[] students = { 1, 1, 0, 0 };
		int[] sandwiches = { 0, 1,0, 1 };
		System.out.println(studentLeft(students, sandwiches));

	}
}