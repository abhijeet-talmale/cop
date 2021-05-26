import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = new int[15];
		Scanner sc= new Scanner(System.in);
		System.out.println("Range of Array");
		int len=sc.nextInt();
		System.out.println("Enter Elements in Array");
		for (int i = 0; i < len; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array is");
		for (int i = 0; i <len; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int temp;
       for (int i = 0; i < len; i++) {
    	   
    	   for (int j = i; j < len; j++) {
    		 if (arr[i]>arr[j]) {
				
    			    temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
			}  
			
		}
		
	}
       System.out.println("---------Sorted Array is---------");
       for (int i = 0; i <len; i++) {
		System.out.print(arr[i]+" ");
	 }
       System.out.println();
       System.out.println("----Array in Discending Order-----");
     for (int i = 0; i < len; i++) {
    	   
    	   for (int j = i; j < len; j++) {
    		 if (arr[i]<arr[j]) {
				
    			    temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
			}  
			
		}
		
	}
     for (int i = 0; i <len; i++) {
 		System.out.print(arr[i]+" ");
 	 }
	}

}
