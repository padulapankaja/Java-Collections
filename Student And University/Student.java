package paper9b;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

public class Student    {
	protected int studentID;
	protected String name;
	public Student() {}
	public Student(int studentID, String name) {
		super();
		this.studentID = studentID;
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}
	
	
	public void input()  {
		int studentid;
		String names;
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter Student Number: ");
			studentid = scan.nextInt();
			setStudentID(studentid);
			System.out.println("Enter Name : ");
			names = scan.nextLine();
			setName(names);
			scan.close();
			
			
		} catch (InputMismatchException e)  {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
