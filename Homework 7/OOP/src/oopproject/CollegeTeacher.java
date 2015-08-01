package oopproject;

public class CollegeTeacher extends Teacher{
	private String workCollege;

	public CollegeTeacher(){
		super();
		
		setWorkCollege("");
	}
	
	public CollegeTeacher(String firstName, String lastName, int workExp, String subject, String workCollege){
		super(firstName, lastName, workExp, subject);
		
		setWorkCollege(workCollege);
	}
	
	public String getWorkCollege() {
		return this.workCollege;
	}

	public void setWorkCollege(String workCollege) {
		this.workCollege = workCollege;
	}
	
	public void messageActivity() {
		super.messageActivity();
	}
	
}
