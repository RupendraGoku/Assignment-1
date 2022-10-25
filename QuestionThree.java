public class QuestionThree
{

public static void main(String[] args) 
	{
		int n=7;
		int m=14;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spaces=2*(n-i);
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");

			}	
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int k=1;k<=n;k++) {
			for (int j=1;j<=m;j++) {
				if(j==1&&k<=3*n/4||k==3*n/4||j==m&&k<=3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}System.out.println();
	}
	}

}
