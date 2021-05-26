import java.util.Scanner;

/*2:>Create a java applicstion for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

2.1 Write acceptInfo() method to accept customer details:

2.2 Write a method , showDetails to display customer name & credit limit only.

Naming convention : public void setCreditLimit(double limit) {...}
public double getCreditLimit(){...}

2.3 Create a TestCustomer class . Use scanner to accept user i/ps.
Create 2 customers object.
Display customer details of both customers.
Prompt user , for changing creditLimit of the customer2.
Display new credit limit on the console.*/

public class Customer {
	private String name;
	private String email;
    private int age;
    private double creditlimit;
    //private static int cnt;
    /*public static void displayCnt()
    {
    	System.out.println(cnt);
    }*/
    
    Scanner sc = new Scanner(System.in);
    
    public void  acceptInfo(){
    	
    	System.out.println("Enter Your Name");
    	name=sc.next();
    	System.out.println("Enter your EmailAddress");
    	email=sc.next();
    	System.out.println("Enter Yor Age");
    	age=sc.nextInt();
    	System.out.println("Enter your CreditLimit");
    	creditlimit=sc.nextDouble();
    	
    }
    public void displayInfo() {
    	System.out.println("--------------------");
    	System.out.println(name);
    	System.out.println(email);
    	System.out.println(age);
    	System.out.println(creditlimit);
    }
    public void setCreditLimit(double newCredit)
	{
		
		creditlimit=newCredit;//
	}
	public double getCreditLimit()
	{
		return creditlimit;
	}

	public static void main(String[] args) {
		
	    
	    
		
	}

}
