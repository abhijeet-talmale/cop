import java.util.Scanner;

/*4:Write functions for making addition of diffrent types(use FunctionOverloading);*/
public class OverloadingAddtion {
	
	public static void add() {
		int a,b;
		System.out.println("Enter Two Numbers");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int res=a+b;
		System.out.println("Result"+" "+res);
		
	}
	public static void add(int x,int y) {
		int res = x+y;
		System.out.println("Result"+" "+res);
	}
	public static void add(String x,String  y) {
		String res = x+y;
		System.out.println("Result"+" "+res);
	}
	public static void main(String[] args) {
		int num1,num2;
		System.out.println("Enter Two Number");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		num2=sc.nextInt();
		add();
		add(num1,num2);
		add("sss","uuu");

	}

}
