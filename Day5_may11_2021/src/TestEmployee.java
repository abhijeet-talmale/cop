import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		/*int[] arr=new int[5];
	     arr[0]=10;
	     //UDT-ref type
	     //can i create array of IacsdEmployee
	     Employee[] allEmps=new Employee[5];
	     
	     
	     
	     Employee emp1=new Employee("Vaishali",78955);
	     Employee emp2=new Employee("Sonali",459000);
	     Employee emp3=new Employee("Priti",454000);
	     Employee emp4=new Employee("Snehal",40000);
	     Employee emp5=new Employee("Pratiksha",2000);
	     
	     emp1.acceptInfo();
	     emp1.displayInfo();
	     
	     allEmps[0]=emp1;
	     allEmps[1]=emp2;
	     allEmps[2]=emp3;
	     allEmps[3]=emp4;
	     allEmps[4]=emp5;
	     
	     System.out.println("------------------");
	    for(int i=0;i<allEmps.length;i++)
	    {
	    	allEmps[i].display();
	    	
	    }
	    
	    //for each
	    
	    for(Employee emp:allEmps)
	    {
	    	emp.display();
	    }
	    for(int i=0; i<allEmps.length; i++)
		{	
			if(allEmps[i].getSalary()>20000)
			{
				System.out.println(allEmps[i].getEmpid()+"\t"+allEmps[i].getName());
				System.out.println("");
			}
		}
	    	*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Employees: ");
		int n = sc.nextInt();
		Employee[] emp= new Employee[n];
		for(int i=0; i<emp.length; i++)
		{	
			emp[i]= new Employee("sam",200000);
			emp[i].display();
			System.out.println("");
			System.out.println("Enter Employee details: ");
			emp[i].acceptInfo();
		}
		
		for(int i=0; i<emp.length; i++)
		{
			System.out.println("覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧�");
			System.out.println("Employee "+(i+1)+"...");
			System.out.println("");
			emp[i].displayInfo();
		}
		System.out.println("覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧�");
		System.out.println("Employees with 20000+ Salary... ");
		for(int i=0; i<emp.length; i++)
		{	
			if(emp[i].getSalary()>20000)
			{
				System.out.println(emp[i].getEmpid()+"\t"+emp[i].getName());
				System.out.println("");
			}
		}
		sc.close();
	    	
	    

	}

}
