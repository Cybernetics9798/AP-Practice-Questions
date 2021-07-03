package TestQuestions;
import java.util.ArrayList;

public class Digits {
	private ArrayList<Integer> digitlist;
	public Digits(int a){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while(a>=1) {
			temp.add(a%10);
			a=a/10;
		}
		for(int i=temp.size()-1; i>=0; i--) {
			digitlist.add(temp.get(i));
		}
	}
	
	public boolean isStrictlyIncreasing() {
		int count=0;
		if(digitlist.size()==1) {
			return true;
		}
		for(int i=0; i<digitlist.size(); i++) {
			if(digitlist.get(i)>=digitlist.get(i+1)){
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
