package paper9a;

public class Employee extends Person {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @param personID
	 * @param name
	 * @param salary
	 */
	public Employee(int personID, String name, double salary) {
		super(personID, name);
		this.salary = salary;
	}
	
}
