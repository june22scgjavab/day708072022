package day708072022Arrays;

import java.util.Scanner;

public class StudentMain {
public static void main(String[] args) {
	Student student=new Student();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the roll number")	;
	int roll=scan.nextInt();
	student.setRoll(roll);
	System.out.println("Enter the name of the student");
	String name=scan.next();
	student.setName(name);
	String subjects[]=new String[3];
	for(int i=0;i<subjects.length;i++)
	{
		System.out.println("Enter the subject name");
		subjects[i]=scan.next();
	}
	student.setSubjects(subjects);
	int marks[]=new int[3];
	for(int i=0;i<marks.length;i++)
	{
		System.out.println("Enter the marks for "+subjects[i]);
		marks[i]=scan.nextInt();
	}
	student.setMarks(marks);
	System.out.println("The details are");
	System.out.println(student.getRoll());
	System.out.println(student.getName());
	subjects=student.getSubjects();
	
	/* for(String subject : subjects) { System.out.println(subject); } */
	
	  marks=student.getMarks();
		/* for(int m : marks) { System.out.println(m); } */
		
   for(int i=0;i<subjects.length || i<marks.length;i++)
   {
	   System.out.println(subjects[i]+" "+marks[i]);
   }


}
}
