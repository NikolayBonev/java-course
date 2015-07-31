package oopproject;

public class Assistant extends Lector implements TitleLector{
	private boolean title;

	public Assistant(){
		super();
		
		isTitle("");
	}
	
	public Assistant(String firstName, String lastName, int age, int workExp, String nameUni, String title){
		super(firstName, lastName, age, workExp, nameUni);
		
		isTitle(title);
	}
	
	
	public String getTitle() {
		return this.title;
	}

	public void isTitle(boolean title) {
		this.title = title;
	}

	public void writeArticles(){
		System.out.println("I can write articles!");
	}
	
	@Override
	public void printTitleLector() {
		System.out.println("Is the assistant " + getLastName() + " head assistant! " + this.title);	
	}
	
	@Override
	public void messageActivity() {
		System.out.println("Checks exams!");		
	}
	

}
