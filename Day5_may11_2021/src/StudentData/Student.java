/*Problem Statement 1
1.1:Create 2 classes Student and Batch. Student class is in pack1 and Batch
class is in pack2. Write accept() and  display() methid in both the class to accept and to display info.
Write a Test class to print Student and Batch
information.
1.2:Use the Student and Batch classes created earlier. It should contain
public  rollNo,Public  Name, private  Grade and default  totalMarks attributes and using Batch
class, check accessibility of there attributes in same package .
1.3:
Create new package pack2.
create class testStudent in pack3;
create object of Student class from pack1 and access methods.Try to check accessibility.*/
package StudentData;

import java.util.Scanner;

public class Student {
	public int rollNo;
	public String name;
	private char grade;
	 double totalmarks;
	public void aceeptInfoStudent() {
		 
		Scanner scc = new Scanner(System.in);
		System.out.println("Enter Roll Number");
		rollNo=scc.nextInt();
		System.out.println("Enter Your Name");
		name=scc.next();
		System.out.println("Enter Grade");
		grade=scc.next().charAt(0);
		
	}
	public void displayInfo() {
		
		System.out.println("-----------------------------------");
		System.out.println("Roll No = "+rollNo);
		System.out.println("Name = "+name);
		System.out.println("Grade="+grade);
		
	}

	public static void main(String[] args) {
		
        /*Student s = new Student();
        s.aceeptInfoStudent() ;
        s.displayInfo();*/
	}

}
