import java.util.Scanner;

/*3:Consider that payroll software needs to be developed for computerization of
operations of an ABC organization. The organization has employees.
3.1. Construct a class Employee with following members using private access
specifies:
 Employee Id integer
 Employee Name string
 Basic Salary double
 HRA double
 Medical double
 PF double
PT double
 Net Salary double
 Gross Salary double
Please use following expressions for calculations:
 * HRA = 50% of Basic Salary
* PF = 12% of Basic Salary
* PT = Rs. 200

3.2. Write methods to display the details of an employee and calculate the gross
and net salary.
* Goss Salary = Basic Salary + HRA + Medical
* Net Salary = Gross Salary – (PT + PF)

Create a TestEmployee Class.Create Object of employee class and assign values and display Details.*/
public class Employee {
	private int id;
	private String Name;
	private double bs;
	private double hra;
	private double pt=200;
	private double pf;
	private double medical;
	private double gs;
	private double ns;
	
	public void acceptInfoEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id");
		id=sc.nextInt();
		System.out.println("Enter Employee Name");
		Name=sc.next();
		System.out.println("Enter Employee Basic Salary");
		bs=sc.nextDouble();
		System.out.println("Enter Employee Medical");
		medical=sc.nextDouble();
		hra=bs*0.5;
		pf=bs*0.12;
		
	}
	public void displayInfoEmployee() {
		gs=bs+hra+medical;
		ns=gs-(pt+pf);
		System.out.println("EmployeeId "+id);
		System.out.println("Name is "+Name);
		System.out.println("Medical is "+medical);
		System.out.println("Pf is "+pf);
		System.out.println("Pt is "+pt);
		System.out.println("Hra is "+hra);
		System.out.println("Basic Salary is "+bs);
		System.out.println("Gross Salary is "+gs);
		System.out.println("Net Salary is "+ns);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
