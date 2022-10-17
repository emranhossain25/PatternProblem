package pattern;

public class solidrecangle {
	public static void main(String args[]) {
		int n=4;// rows
		int m=5;//. columns
//		you can take any acconding to user
		for(int i=1; i<=n; i++) {
			//inner loop
			for(int j=1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
