package pattern;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; // now of row you can take any your choice
		
		for(int i=1; i<=n; i++) {
			// inner loop
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
