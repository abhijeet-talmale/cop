import java.util.Scanner;

public class Employee {
	
	private int empid;
	private String name;
	private String add;
	private double salary;
	
	Scanner sc =new Scanner(System.in);
	
	public Employee(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAdd() {
		return add;
	}



	public void setAdd(String add) {
		this.add = add;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display()
	{
	    System.out.println("Name "+name+" "+"Salary = "+salary);	
	} 
	
	public void acceptInfo()
	{
		
		System.out.println("Enter Id: ");
		setEmpid(sc.nextInt());
		System.out.println("Enter Name: ");
		setName(sc.next());
		System.out.println("Enter Address");
		setAdd(sc.next());
		System.out.println("Enter Salary");
		setSalary(sc.nextDouble());
	}
	
	public void displayInfo()
	{
		System.out.println("Id: "+getEmpid());
		System.out.println("Name: "+getName());
		System.out.println("Address: "+getAdd());
		System.out.println("SAlary: "+getSalary());
		
	}
    

	public static void main(String[] args) {
		
		/*Employee e=new Employee("Abhi",20000);
		e.display();*/
		

	}

}
