package Question1;

/*Given a string s, find the first non-repeating character in it and return
its index. If it does not exist, return -1.*/

import java.util.Queue;
import java.util.LinkedList;

public class Que1 {
	public static int nonRepeated(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		String disp="loveleetcode";
		System.out.println(nonRepeated(disp));

	}

}
