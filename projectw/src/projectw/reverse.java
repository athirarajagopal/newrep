package projectw;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string");

		Scanner reader = new Scanner(System.in);

		String str = reader.nextLine();
		String reverse = "";

		StringBuffer stbuff = new StringBuffer();
		stbuff.append(str);

		System.out.println("Reverse using stringbuffer function = " + stbuff.reverse());
	
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("reverse string is = " + reverse);
		reader.close();
	}

}
