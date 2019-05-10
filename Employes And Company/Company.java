package paper9a;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	 
	 List <Employee>  arrylist = new ArrayList<>();
	 
	 public boolean add(Employee newEmp) {
		 
		 arrylist.add(newEmp);
		 
		return true;
	 }
	 public void ListEmployee() {
		 for(Employee e : arrylist)
		 {
			 System.out.println(e);
		 }
	 }
}