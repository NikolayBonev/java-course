package oopproject;

public class Teacher extends Person implements MessageActivity, HelloGreatingMessage{
	private String subject;

	public Teacher(){
		super();
		
		setSubject("");
	}
	
	public Teacher(String firstName, String lastName, int age, int workExp, String subject){
		super(firstName, lastName, age, workExp);
		
		setSubject(subject);
	}
	
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void byeGreating(){
		System.out.println("Good bye!");
	}
	
	@Override
	public void messageActivity() {
		System.out.println("Checking homework!");
		
	}

	@Override
	public void helloGreating() {
		System.out.println("Hello!");
		
	}
	
	
}
