package TestQuestions;
public class TestDay2 {
//VW315XX4 Y.C.
//a)
public static double gradeSimulation() {
	int count=0;
	int total=0;
	while(getGrade()!=-1) {
		if(getGrade()>=90) {
			count++;
		}
		total++;
	}
	double pr=count/total;
	return pr;
}
	
//b)
//A static public final variable MaxScore may be added under the GradeAnalysis class.
//When using getGrade method, a few more lines of code can be added to the method
//to determine if the grade has exceeded the MaxScore or not. If exceeded, just go to the 
//next loop.
}
