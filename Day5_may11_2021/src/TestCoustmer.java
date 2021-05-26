import java.util.Scanner;
public class TestCoustmer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coustmer c1 = new Coustmer();
		Coustmer c2 = new Coustmer("Harshal","harshal@gmail.com", 20, 50000);
		
		System.out.println("Change Credit Limit:");
		double creditLimit = sc.nextDouble();
		c2.setCreditLimit(creditLimit);
		System.out.println("Credit Limit Changed: "+c2.getCreditLimit());
	}

}
