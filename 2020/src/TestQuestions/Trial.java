package TestQuestions;
class Trail
{
    private int[] markers;
    public Trail(int[] m)
    {
        markers = m;
    }
    public boolean isLevelTrailSegment(int start,int end )
    {
       int [] a= new int[12];
       int subtract=Math.abs(a[end]-a[start]);
       if(subtract<10) {
    	   return true;
       }
       return false;
    }
    public boolean isDifficult()
    {
        int count=0;
        for(int i=0; i<12; i++) {
    	   int temp= Math.abs(markers[i]-markers[i+1]);
    	   if(temp>=30) {
    		   count++;   
    	   }
       }
    	if(count>=3) {
    		return true;
    	   }
    		return false;  
    }
}

public class Trial {

	public static void main(String[] args) {
		 int []m = {100,150,105,120,90,80,50,75,75,70,80,90,100};
	        Trail t = new Trail(m);
	        boolean isLevel = t.isLevelTrailSegment(4, 8);
	        if(isLevel)
	            System.out.println("The Trai Elevation between 4 and 8 is level");
	        else
	            System.out.println("The Trai Elevation between 4 and 8 is not level");
	        boolean isDiff = t.isDifficult();
	        if(isDiff)
	            System.out.println("The Trai Elevation is difficult");
	        else
	            System.out.println("The Trai Elevation is not difficult");
	}

}
