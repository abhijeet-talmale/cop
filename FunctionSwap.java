import java.util.Scanner;

/*3:Write function to swap two numbers.*/

public class FunctionSwap {

	public static void swap(int x,int y) {
		
		int temp;
		temp = x;
		x=y;
		y=temp;
		
		System.out.println("Value of A and B After Swap"+" "+ x +" "+y);
		
	}
	
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number Number1 and Number2");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Numbers Before Swap"+" "+a+" "+b);
		swap( a, b);
		
	}

}
