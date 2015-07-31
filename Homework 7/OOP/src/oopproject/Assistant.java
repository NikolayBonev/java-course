package oopproject;

public class Assistant extends Lector implements TitleLector{
	private String title;

	public Assistant(){
		super();
		
		setTitle("");
	}
	
	public Assistant(String firstName, String lastName, int age, int workExp, String nameUni, String title){
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
		System.out.println("The assistant " + getLastName() + " has the title " + this.title);	
	}
	
	@Override
	public void messageActivity() {
		System.out.println("Checks exams!");		
	}
	

}
