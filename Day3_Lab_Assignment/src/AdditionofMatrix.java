import java.util.Scanner;

public class AdditionofMatrix {

	public static void main(String[] args) {
       
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First 3x3 matrix");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Second 3x3 matrix");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Addition of two matrix is");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
