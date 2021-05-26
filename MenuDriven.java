import java.util.Scanner;

/*11:Write a menu driven program for stationary shop.Items are 1:Pen 2:Pencil 3:NoteBook 4:Bottle 5:ColorBox.
1 pen cost is 10Rs,Pencil is 5 rs.NoteBook is 20 rs Bottle is 30 rs and ColorBox is at 50 Rs.
Calculate Total of all purchesed items. */

public class MenuDriven {
	
	public static void main(String[] args) {
		float pr,qty,sp=0,spn=0,sn=0,sb=0,scr=0;
		int ch;
		boolean flag=false;
		System.out.println("1.Pen");
		System.out.println("2.Pencil");
		System.out.println("3.Notebook");
		System.out.println("4.Bottle");
		System.out.println("5.ColorBox");
		System.out.println("6.Exit");
		
		Scanner sc = new Scanner(System.in);
		while(flag!=true) {
			System.out.println("Enter Choice");
			ch=sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("You Choice Pen");
				System.out.println("Enter quantity");
				qty=sc.nextFloat();
				sp=10*qty;
				break;
				
			}
			case 2: {
				System.out.println("You Choice Pencil");
				System.out.println("Enter quantity");
				qty=sc.nextFloat();
				spn=5*qty;
				break;
				
			}
			case 3: {
				System.out.println("You Choice Notebook");
				System.out.println("Enter quantity");
				qty=sc.nextFloat();
				sn=20*qty;
				break;
				
			}
			case 4: {
				System.out.println("You Choice Bottle");
				System.out.println("Enter quantity");
				qty=sc.nextFloat();
				sb=30*qty;
				break;
				
			}
			case 5: {
				System.out.println("You Choice ColourBox");
				System.out.println("Enter quantity");
				qty=sc.nextFloat();
				scr=50*qty;
				break;
				
			}
			case 6: {
				flag=true;
				break;
				
			}
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		System.out.println("Cost of Pen is "+sp);
		System.out.println("Cost of Pencil is "+spn);
		System.out.println("Cost of Notebook is "+sn);
		System.out.println("Cost of Bottle is "+sb);
		System.out.println("Cost of ColourBox is "+scr);
		float total=sp + spn + sn +sb + scr;
		System.out.println("Your Total is "+total);

	}

}
