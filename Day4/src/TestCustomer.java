import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {

		//Customer.cnt=10;
		//Customer.displayCnt();
        Customer cust1=new Customer();
         cust1.acceptInfo();
         cust1.displayInfo();
         /*Customer cust2=new Customer();
         cust2.acceptInfo();
         cust2.displayInfo();*/
         
         System.out.println("Enter New CreditLimit");
 		Scanner sc=new Scanner(System.in);
 		double c=sc.nextDouble();
 		
 		cust1.setCreditLimit(c);
 		
 		System.out.println("Updated CreditLimit:"+cust1.getCreditLimit());
         
        
	}

}
