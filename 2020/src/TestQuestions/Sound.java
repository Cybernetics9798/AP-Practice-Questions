package TestQuestions;

public class Sound {
	private int[] samples= {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
	public int limitAmplitude(int limit){
		int l=samples.length;
		int count=0;
		for(int i=0; i<l; i++) {
			if(samples[i]>limit) {
				samples[i]=limit;
				count++;
			}
			if(samples[i]<-limit) {
				samples[i]=-limit;
				count++;
			}
		}
		return count;
	}
	
	public void trimSlienceFromBeginning() {
		int r = 0;
		int l=samples.length;
		for(int i=0; i<l; i++) {
			if(samples[i]!=0) {
				r=i;
				break;
			}
		}
		int [] narr=new int [l-r+1];
		for(int i=0; i<(l-r+1); i++) {
			narr[i]=samples[r];
			r++;
		}
		samples=narr;
	}
	
	public static void main(String[] args) {
	}

}
