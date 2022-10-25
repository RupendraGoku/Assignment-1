public class QuestionOne{
	public static void main(String[] args) {
	
	int n=6;
	
	for (int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) {
			if(i==0&&j<n-1||i==n&&j<n-1||j==(n/2)-1) {
				System.out.print("*");
				
			}	
			else {
				System.out.print(" ");
			}
		}

		for(int j=0;j<n;j++) {
			if(j==0||i==j||j==n-1) {
				System.out.print("*");
				
			}	
			else {
				System.out.print(" ");
			}
		}
		for(int j=0;j<n;j++) {
			if(j==0) {
				System.out.print(" ");	
			}	
			
		}
		for(int j=0;j<=n;j++) {
			if(i==0&&j<n-1||j==0||i==(n/2)&&j<n-1||i==n&&j<n-1) {
				System.out.print("*");
				
			}	
			else {
				System.out.print(" ");
			}
		}
		for(int j=0;j<=n;j++) {
			if((j<=n/8 &&i>=n/8 && i<=n-1)||
					i>(7*n)/8 && j>n/8 &&j<(7*n)/8||
					j==(7*n)/8 && i>=n/8 && i<=n-1) {
				System.out.print("*");
				
			}	
			else {
				System.out.print(" ");
			}
		}
		for(int j=0;j<=n;j++) {
			if(j==0&&i>n/8  ||
					i==0&&j>n/8&&j<3*n/4||
					j==(n/2)+1&&i>n/8 && i<3*n/4-1||
					i-j==(n-1)/2||
					i==n/2&&j<=n/2
					) {
				System.out.print("*");
				
			}	
			else {
				System.out.print(" ");
			}
			
		}
		for(int j=0;j<=n;j++) {
			if((i==n/8 &&j>n/8 && j<(7*n)/8) ||
					(j==n/8 &&i>n/8 && i<7*n/8)||
					i==(7*n)/8 && j>n/8 &&j<(7*n)/8||
					j==(7*n)/8 && i>n/8 && i<(7*n)/8) {
				System.out.print("*");
				
			}	
			else {
				System.out.print(" ");
			}
		}
		for(int j=0;j<n;j++) {
			if(j==0||i==j||j==n-1) {
				System.out.print("*");
				
			}	
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
 }
}