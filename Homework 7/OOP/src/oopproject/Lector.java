package oopproject;

public class Lector extends Person implements HelloGreatingMessage, MessageActivity{
	private String nameUni;

	public static final int countLetures=10;
	
	public Lector(){
		super();
		
		setNameUni("");
	}
	
	public Lector(String firstName, String lastName, int age, int workExp, String nameUni){
		super(firstName, lastName, age, workExp);
		
		setNameUni(nameUni);
	}
	
	public String getNameUni() {
		return this.nameUni;
	}

	public void setNameUni(String nameUni) {
		this.nameUni = nameUni;
	}

	public void checkUpr(String oopSub){
		System.out.println("Checking exercises is discipline " + oopSub);
	}
	
	public void checkUpr(String oopSub, int semester){
		System.out.println("Checking exercises is discipline " + oopSub + " from semester " + semester);
	}

	public void checkUpr(String oopSub, int semester, int group){
		System.out.println("Checking exercises is discipline " + oopSub + " from semester " + semester);
		System.out.print("From group " + group);
	}
	
	@Override
	public void helloGreating() {
		System.out.println("Hello!");
	}

	@Override
	public void messageActivity() {
		System.out.println("Checking homework!");		
	}
	
	
}