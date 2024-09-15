package TestQuestions;

public class Add3 {
	public void changeArray(int[] a) {
		int l=a.length;
		for (int i=0; i<l; i++) {
			a[i]=a[i]+3;
	}
		System.out.print(a);
}
}
