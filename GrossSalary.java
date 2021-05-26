import java.util.Scanner;
/*10: Write a  program to input basic salary of an employee and calculate its Gross salary according to 
following: Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
public class GrossSalary {

	public static void main(String[] args) {
		double basic,gross,da,hra;
		System.out.println("Enter Basic Salary");
		Scanner sc = new Scanner(System.in);
		basic=sc.nextDouble();
		if(basic<=10000) {
			System.out.println("In  if  bas<10000");
			hra=basic*0.2;
			da=basic*0.8;
		}
		else if(basic<=20000) {
			hra=basic*0.25;
			da=basic*0.9; //0.9
		}
		else {
			hra=basic*0.3;
			da=basic*0.95;
		}
		System.out.println("Basic Salary "+basic);
		System.out.println("hra "+hra);
		System.out.println("Da "+da);
		gross=basic + hra + da;
		System.out.println("Gross Salary is "+gross);

	}

}
