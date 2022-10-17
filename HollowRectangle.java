package pattern;

public class HollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;//rows
		int m=5;// columns
		
		for(int i=1; i<=n; i++) {
			// inner loop
			for(int j=1; j<=n; j++) {
				// now check the condition for hollow rectangle
				if(i==1 || i==n || j==1 || j==n ) {
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
