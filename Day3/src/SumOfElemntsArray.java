import java.util.Scanner;

public class SumOfElemntsArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements in Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("  "+arr[i]);
		}
		int sum=0,avg=0;
		int large=arr[0];
		int small=arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			avg=sum/arr.length;
			if(arr[i]>large){
				large=arr[i];
			}
			else if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+avg);
		System.out.println("Largest Element In Array is "+" "+large);
		System.out.println("Smallest Element In Array is "+" "+small);

	}

}
