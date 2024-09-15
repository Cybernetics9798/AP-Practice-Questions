package TestQuestions;

public class HiddenWord {
	
	private String hidden= new String();
	
	public HiddenWord(String m){
		hidden=m;
	}
	
	public String getHint (String a) {
		String temp= new String();
		
		for(int l=0; l<a.length(); l++) {
			if(a.substring(l,l+1).equals(hidden.substring(l,l+1))) {
				temp+=hidden.substring(l,l+1);
			}
			else if(hidden.indexOf(a.substring(l,l+1))>=0) {
				temp+="+";
			}
			else {
				temp+="*";
			}
		}
		System.out.println(temp);
		return temp;
	}

}
