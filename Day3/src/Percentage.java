import java.util.Scanner;

/*2:Write a program which will accept student information like rollno,name,5 subject marks.calculate total and percentage.calculate grade.. 
           per >75 grade :A
           per<74 and >60 :B
           per<59  :C*/
public class Percentage {

	public static void main(String[] args) {
		int rollNo;
		float s1,s2,s3,s4,s5;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No");
		rollNo=sc.nextInt();
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter 5 Subject Marks out of 100");
		s1=sc.nextFloat();
		s2=sc.nextFloat();
		s3=sc.nextFloat();
		s4=sc.nextFloat();
		s5=sc.nextFloat();
		
		float total=0,per;
		
		total=s1+s2+s3+s4+s5;
		per=(total/500)*100;
		System.out.println("Roll No"+" "+rollNo);
		System.out.println("Name"+" "+name);
		System.out.println("Total="+" "+total);
		System.out.println("Percentage="+" "+per);
		
		if(per>75) {
			System.out.println(name+" "+"You Got A Grade");
		}
		else if(per<74 ){
			if(per>60) {
			System.out.println(name+" "+"You Got B Grade");
			}
		}
		else{
			
			System.out.println(name+" "+"You Got B Grade");
		}

	}

}
