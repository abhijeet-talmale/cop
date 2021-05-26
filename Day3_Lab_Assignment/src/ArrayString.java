import java.util.Scanner;
/*1:Write a function to accept array of string.Display all elements in uppercase.*/
public class ArrayString {

	public static void main(String[] args) {
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 String");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.next();
		}
		System.out.println("Your String is");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        System.out.println("----------------------");
        System.out.println("Now String is:-");
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toUpperCase());
		}
	}

}
