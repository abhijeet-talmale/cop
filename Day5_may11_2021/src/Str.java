import java.io.*;
import java.util.Scanner;
public class Str {
	
	String[] str =new String[2];
   String tmp;
	Scanner sc = new Scanner(System.in);
    public void data() {
    	
    	//System.out.println(str);
    	for (int i = 0; i < str.length; i++) {
    		System.out.println("Enter value"+i);
			str[i]=sc.next();
		}
    /*	for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}*/
    	int len=0;
    	//System.out.println(str.length);
    	for (int i = 0; i <str.length; i++) {
			//System.out.println(str[i]);
			
			len=str[i].length();
			//System.out.println(len);
			for(int j=len-2;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.println();
		}
    	
    	
    	
    }
	

	public static void main(java.lang.String[] args) {
		
		Str str = new Str();
		str.data();

	}

}
