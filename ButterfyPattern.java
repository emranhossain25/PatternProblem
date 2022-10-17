package pattern;

public class ButterfyPattern {
	public static void main(String args[]) {
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			// now print the spaces
			
			int spaces = 2*(n-i);
			for (int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			// last start
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// now print the second part
		for(int i=n; i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			// now print the spaces
			
			int spaces = 2*(n-i);
			for (int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			
			// last start
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
