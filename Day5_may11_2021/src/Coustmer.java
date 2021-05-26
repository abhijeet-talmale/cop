import java.util.*;
public class Coustmer {
	private String name;
	private String email;
	private int age;
	private double creditLimit;
	Scanner sc = new Scanner(System.in);
	public Coustmer(String name, String email, int age, double creditLimit) {
//		this();
		this.name = name;
		this.email = email;
		this.age = age;
		this.creditLimit = creditLimit;
		System.out.println("Parameterized Customer:\t"+name+"  "+email+"\t"+age+"\t"+creditLimit);
	}

	public Coustmer() {
		name= "Vinayak";
		email = "vnyk0901@gmail.com";
		age = 25;
		creditLimit = 20000;
		System.out.println("ArgumentLess Customer:\t"+name+"  "+email+"\t"+age+"\t"+creditLimit);
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	}