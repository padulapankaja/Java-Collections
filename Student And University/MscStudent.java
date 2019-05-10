package paper9b;

public class MscStudent  extends Student{ 
	private String special;
	
	public MscStudent(){
		
	}

	public MscStudent(int studentID, String name, String special) {
		super(studentID, name);
		this.special = special;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}
	
}
