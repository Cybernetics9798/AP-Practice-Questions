package TestQuestions;
public class APline {
	
	private int a1;
	private int b1;
	private int c1;
	
	public APline(int a, int b, int c){
		a1=a;
		b1=b;
		c1=c;
		
	}
	
	public double getSlope() {
		return (-(double)a1/(double)b1);
	}
	
	public boolean isOnLine(int a, int b) {
		if(a1*a+b1*b+c1==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		APline line1= new APline(5,4,-17);
		double slope1=line1.getSlope();
		boolean onLine1=line1.isOnLine(5, -2);
		System.out.println(slope1);
		System.out.println(onLine1);
	}

}
