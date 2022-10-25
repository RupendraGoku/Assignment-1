public class QuestionFour
{

public static void main(String[] args) 
	{
		int n=7;
		int m=5;
		for(int i=1;i<=m;i++){
			System.out.println();
		}
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("*");
			}
				int spc=2*(n-i);
				for(int j=1;j<=spc;j++) 
				{
					System.out.print(" ");
		
				}
			  	 for(int j=1;j<=i;j++) 
			  	 {
			  		 System.out.print("*");
		     	  	 }
			   	System.out.println();
		}
					for(int i=1;i<=n*2;i++) 
					{
			 
						System.out.print("*");
			
					}
	}
}