import java.util.Scanner;

/*Create Date class with  data members day,month,year.
Write a method to accept all data members.write display function to display date.*/
public class Date {
    public String day;
    public int month;
    public int Year;
    Scanner sc = new Scanner(System.in);
    public void acceptdate(){
    	System.out.println("Enter Day Month and year");
    	day=sc.next();
    	month=sc.nextInt();
    	Year=sc.nextInt();
    	
    }
    public void displayDate() {
    	System.out.println("Date Month Year Are "+ day +"/"+month+"/"+Year);
    }
    public static void main(String[] args) {
		Date obj = new Date();
		obj.acceptdate();
		obj.displayDate();

	}

}
