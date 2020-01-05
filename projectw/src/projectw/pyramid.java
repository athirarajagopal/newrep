package projectw;

public class pyramid {
	
public static void main(String[] args) {

int row=6;
for(int i=1;i<=row;i++)
{
	
	for(int j = row; j>=i ; j--) {
        System.out.print(" ");
    }
	
	for(int j=1;j<=i;j++)
	{
		System.out.print("* ");
		
	}
	
	System.out.println();
}
//}


for (int i = 1; i <= row; i++) { 
	  
    // loop to print the number of spaces before the star 
    for (int j = row; j >= i; j--) { 
        System.out.print(" "); 
    } 

    // loop to print the number of stars in each row 
    for (int j = 1; j <= i; j++) { 
        System.out.print("* "); 
    } 

    // for new line after printing each row 
    System.out.println(); 
}
    
}
}