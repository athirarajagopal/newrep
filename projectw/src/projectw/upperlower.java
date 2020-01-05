package projectw;

import java.util.ArrayList;
import java.util.List;

public class upperlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "#abcABC345@#$";
		int upper = 0, lower = 0, number = 0, special = 0;
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		List<Character> list3 = new ArrayList<Character>();
		List<Character> list4 = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper++;
				list1.add(ch);

			} else if (ch >= 'a' && ch <= 'z') {
				list2.add(ch);
				lower++;

			} else if (ch >= '0' && ch <= '9') {
				list3.add(ch);
				number++;

			} else {
				list4.add(ch);
				special++;

			}
		}

		System.out.println("Lower case letters are : " + list2 + " and count is " + lower);
		System.out.println("Upper case letters :  " + list1 + " and count is " + upper);
		System.out.println("Number : " + list3 + " and count is " + number);
		System.out.println("Special characters : " + list4 + " and count is " + special);
	}

}
