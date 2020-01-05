package projectw;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1, 8, 5, 5, 8, 9, 7, 10};
	      int[] array2 = {8, 0, 5, 15, 9, 0, 7,10};
	 
	       System.out.println("Array1 : "+Arrays.toString(array1));
	      System.out.println("Array2 : "+Arrays.toString(array2));
	 
	      Set<Integer> st=new HashSet<Integer>();
	        for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i] == (array2[j]))
	                {
	                 
	                 System.out.println("Common element is : "+(array1[i]));
	                 st.add(array1[i]);
	                
	                 }
	            }
	        }
	        
	        System.out.println("Output of set is " + st);
	 
	    }
	}


