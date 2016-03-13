package com.Session6.Assignment4;

import java.util.Scanner;

public class MainClass {
	/*
	 * ￼Create student result processing system with an abstract class. All years students data can be
		￼entered and displayed by inherited sub classes. Abstract class should contain student roll, name
￼		and registration number.
	 */
	
	public static void main(String[] args) {
		StudentExt.CollageName = "AcadGild Institute";
		
		StudentExt s1 = new StudentExt();
		s1.name = "Sumit Shastri";
		s1.rollno =101;
		s1.registrationNumber = 102;
		s1.marksForHindi = 75;
		s1.marksForEnglish= 75;
		s1.marksForMaths = 75;		
		s1.calculateResult();
		
	
	}
}


abstract class Student
{
	public String name;
	public int rollno;
	public int registrationNumber;
	
	public abstract void calculateResult();

}

class StudentExt extends Student
{
	public static String CollageName;
	public int marksForHindi;
	public int marksForEnglish;
	public int marksForMaths;
	public int persantge;

	@Override
	public void calculateResult() {
		// TODO Auto-generated method stub
		System.out.println("****************************************");
		System.out.println("Student Name\t:\t"+ this.name);
		System.out.println("Student Roll No\t:\t"+ this.rollno);
		System.out.println("Student Reg No\t:\t"+ this.registrationNumber);
		System.out.println("College \t:\t"+ CollageName);
		System.out.println("****************************************");
		System.out.println("Hindi\t\t:\t"+marksForHindi);
		System.out.println("English\t\t:\t"+marksForEnglish);
		System.out.println("Maths\t\t:\t"+marksForMaths);
		int total =(marksForHindi+marksForEnglish+marksForMaths);
		System.out.println("Total\t\t:\t"+total);
		System.out.println("Per(%)\t\t:\t"+total/3+"%");
		System.out.println("****************************************");
		
	}
	
}