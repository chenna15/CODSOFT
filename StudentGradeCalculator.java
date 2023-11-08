package PROJECTS;
import java.util.*;
public class StudentGradeCalculator {

	public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
		int totalMarks=0;
		int totalSubjects=0;
	System.out.println("Total number of Subjects:");
	int numberOfSubjects= sc.nextInt();
	
	for(int i=1; i<=numberOfSubjects; i++) {
		System.out.println("Enter marks out of (100) for subject " +i+ ":");
		int marks= sc.nextInt();
	totalMarks +=marks;
	totalSubjects++;
	}
	
	double averagePercentage= (double) totalMarks/ totalSubjects;
	
	String grade;
	
	if(averagePercentage>=90 & averagePercentage<=100 ) {
		grade ="A+";
	}
	else if(averagePercentage>=80 & averagePercentage<90) {
		grade="A";
	}
	else if(averagePercentage>=70 & averagePercentage<80) {
		grade="B";
	}
	else  if(averagePercentage>=60 & averagePercentage<70) {
		grade="c";
	}
	else if(averagePercentage>=50 & averagePercentage<60) {
		grade="D";
	}
	else if(averagePercentage>=40 & averagePercentage<50) {
		grade="E";
	}
	else {
		grade="Fail";
	}
	
	System.out.println("Total Marks obtained by Student: " + totalMarks);
	System.out.println("Average Percentage of the Student :"+averagePercentage+"%");
	System.out.println("Student Grade: "+grade);
	
	}

}
