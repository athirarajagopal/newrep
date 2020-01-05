package projectw;

import java.util.Scanner;

public class testw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      /*   Scanner user_input = new Scanner( System.in ); 
	    String variable;
	    System.out.print("Enter Variable:");
	      variable = user_input.next();
	          Separate(variable);
	   }

	   public static void Separate(String str) {
	   */
		String str = "abc d 1234567890pqr 54897";
	         String number = "";
	          String letter = "";
	      String symbol = "";
	          for (int i = 0; i < str.length(); i++) {
	                 char a = str.charAt(i);
	                 if (Character.isDigit(a)) {
	                      number = number + a;
	                	 //System.out.println("Numbers in String:"+a); 
	                 } else {
	                      letter = letter + a;
	                       //System.out.println("Alphabets in string:"+a);


	         }
	          }
	          System.out.println("Alphabets in string:"+letter);
	         System.out.println("Numbers in String:"+number);   
	   }
	}


