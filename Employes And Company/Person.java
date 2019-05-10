package paper9a;
import java.util.*;

public class Person {

	private int personID;
	private String name;
	/**
	 * @param personID
	 * @param name
	 */
	public Person(int personID, String name) {
		
		this.personID = personID;
		this.name = name;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
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
	public void input() {
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Person ID : ");
			personID = scan.nextInt();
			System.out.println("Enter Name : ");
			name = scan.nextLine();
			scan.close();
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println(e);
		}

		
		
		
		
	}
}
