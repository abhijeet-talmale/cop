import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements in Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(+arr[i] + "  ");
		}
		int large=arr[0];
		int small=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
			else if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("\nLargest Element In Array"+" "+large);
		System.out.println("Smallest Element In Array"+" "+small);
				

	}

}
