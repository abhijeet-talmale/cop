import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int[] arr1 = new int[5];
		int[] arr3 = new int[10];
		System.out.println("Enter 5 Element in Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter 5 Element in Array");
		for (int j = 0; j < arr1.length; j++) {
			arr1[j]=sc.nextInt();
		}
		System.out.println("Merged Array: ");
		int k;
		for ( k = 0; k < arr.length; k++) {
			arr3[k]=arr[k];
		}
		for (int j=0; j < arr1.length; j++,k++) {
			arr3[k]=arr1[j];
		}
		for (k=0; k < arr3.length; k++) {
			System.out.print("\t"+arr3[k]);
		}
	}

}
