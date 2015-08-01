package oopproject;

public class Assistant extends Lector implements TitleLector{
	private boolean title;

	public Assistant(){
		super();
		
		isTitle(false);
	}
	
	public Assistant(String firstName, String lastName, int workExp, String nameUni, boolean title){
		super(firstName, lastName, workExp, nameUni);
		
		isTitle(title);
	}
	
	
	public boolean getTitle() {
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
		System.out.println("Assistant name: " + getLastName() + "\nHead assistant: " + this.title);	
	}
	
	@Override
	public void messageActivity() {
		System.out.println("Checks exams!");		
	}
	

}
