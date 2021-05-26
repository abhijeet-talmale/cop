
public class ArrayArguments {
	   
        public static void sum(int...a) {
        	int total=0;
        	for (int i = 0; i < a.length; i++) {
				total=total+a[i];
			}
        	System.out.println("Total Sum="+total);
        }
	public static void main(String[] args) {
	     int a=1;
          sum(a);
          sum(a,a,a,a,a,a);
	}

}
