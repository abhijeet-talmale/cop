public class Date {
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		dd=9;
		mm=1;
		yy=1996;
		System.out.println("My Birthdate using No argument Constructor:\t"+dd+"�"+mm+"�"+yy);
		
	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		System.out.println("My Birthdate using Parameterized Constructor:\t"+dd+"�"+mm+"�"+yy);
	}

	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	
}