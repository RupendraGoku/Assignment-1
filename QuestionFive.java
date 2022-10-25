public class QuestionFive
{

public static void main(String[] args) 
	{
		int n=7;
		int m=14;
		for(int k=n+1;k<=m;k++) {
			System.out.print("*");
		}
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--) {
				
				System.out.print("*");
				}
			System.out.println();
			
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				}	
			System.out.println();
			}
		for(int k=1;k<=m;k++) {
			System.out.print("*");
		}
		
	}
}
