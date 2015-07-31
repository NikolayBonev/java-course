package oopproject;

public class Profesor extends Lector implements TitleLector, MessageActivity{
	private String title;

	public Profesor(){
		super();
		
		setTitle("");
	}
	
	public Profesor(String firstName, String lastName, int age, int workExp, String nameUni, String title){
		super(firstName, lastName, age, workExp, nameUni);
		
		setTitle(title);
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void printTitleLector() {
		System.out.println("The lector " + getLastName() + " has the title " + this.title);
		System.out.println("His work experience is " + getWorkExp());
	}
	
	@Override
	public void messageActivity() {
		System.out.println("Conducts examination!");		
	}
	
}
