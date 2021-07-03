package TestQuestions;

public class CodeWordChecker {
	
	private int min;
	private int max;
	private String str=new String();
	
	public CodeWordChecker(int a, int b, String c) {
		min=a;
		max=b;
		str=c;
	}
	
	public CodeWordChecker(String n) {
		min=6;
		max=20;
		str=n;
	}
	
	public boolean isValid(String test) {
		int count=0;
		int p=test.length();
		if(p<=max&&p>=min) {
			for(int i=0; i<p; i++) {
				if(test.substring(i,i+1).equals(str)) {
					count++;
					System.out.print(count);
				}
			}
			if(count==0) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

	public static void main(String[] args) {
		CodeWordChecker XD=new CodeWordChecker("%");
		XD.isValid("HappyMe");	

	}

}
