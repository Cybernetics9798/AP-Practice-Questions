package TestQuestions;
import java.lang.reflect.Array;

public class IndexCheck {
	
	
	
	public boolean[] get() {
		boolean [] a=new boolean[10];
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				a[i]=true;
			}
			else {
				a[i]=false;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		
		
	}

}
