package oopproject;

public class SchoolTeacher extends Teacher{
	String[] classes = new String[5];
	
	public SchoolTeacher(){
		super();
		
		setClasses(null);
	}
	
	public SchoolTeacher(String firstName, String lastName, int workExp, String subject, String[] classes){
		super(firstName, lastName, workExp, subject);
		
		setClasses(classes);
	}
	
	public void print(){
		System.out.println("Mr. " + lastName +" has 5 classes, and they are: ");
		for(int i=0;i<classes.length;i++){
			System.out.print( classes[i]+" ");
		}
	}
	
	public String[] getClasses() {
		return this.classes;
	}

	public void setClasses(String[] classes) {
		this.classes = classes;
	}

	public void kids(){
		System.out.println("I can play with kids!");
	}

	public void messageActivity() {
		super.messageActivity();
	}
	
}
