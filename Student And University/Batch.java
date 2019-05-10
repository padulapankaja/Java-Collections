package paper9b;


import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;


public class Batch {
	

	

	private String name;
	private int number;
	
	private final List <MscStudent> arrayList = new ArrayList<>();
	
	  public boolean append( MscStudent newStudent ) {
		  arrayList.add( newStudent );
	      return true;
	   }
	  
	  public void display()
	  {
		  for(MscStudent s : arrayList) {
			  System.out.println(s);
		  }
	  }
}
