package projectw;

public class pyramidalphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char last='E',alphabet='A';
	
	for(int i=1;i<=(last-'A'+1);i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(alphabet+"");
		}
		alphabet++;
		System.out.println();
	}
		

	}
	
    }


