package paper9a;

public class CompanyApp {

	public static void main(String[] args) {
		Employee emp1 = new Employee(123, "Padula", 1300000.00);
		Employee emp2 = new Employee(456, "Thisura", 26000.00);
		Employee emp3 = new Employee(678, "Ravindu", 50000.00);
		
		Company company = new Company();
		
		company.add(emp1);
		company.add(emp2);
		company.add(emp3);
		
		company.ListEmployee();

	}

}
