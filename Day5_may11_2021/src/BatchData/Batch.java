package BatchData;

import java.util.Scanner;

public class Batch {
     private String batchname;
     Scanner sc = new Scanner(System.in);
     
     public void acceptInfo() {
    	 
    	 System.out.println("Enter Batch Name");
    	 batchname=sc.next();
     }
     public void displayInfo() {
    	 System.out.println("----------------------------------");
    	 System.out.println("Batch Name is "+batchname);
     }
     
     
	public static void main(String[] args) {
		
		/*Batch batch = new Batch();
		batch.acceptInfo();
		batch.displayInfo();*/
		
	}

}
