import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		char[] arr = new char[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 Charecters");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.next().charAt(0);
		}
		System.out.println("Character Array is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		String str = String.valueOf(arr);
		System.out.println("Char Array To String is "+str);

	}

}
