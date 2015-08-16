import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in , "UTF-8");
		
		Student stud1 = new Student("Mila", "Ivanova", 121214019);
		System.out.println(stud1);
		System.out.println();

		addMarks(inputs, stud1);
		showMarks(inputs, stud1);
		
		Student stud2 = new Student("Vassi", "Dimitrova", 121214029);
		System.out.println(stud2);
		System.out.println();

		addMarks(inputs, stud2);
		showMarks(inputs, stud2);
		
		Student stud3 = new Student("Gergana", "Georgieva", 121214039);
		System.out.println(stud3);
		System.out.println();

		addMarks(inputs, stud3);
		showMarks(inputs, stud3);
	}
	
	public static void addMarks(Scanner inputs , Student stud){
		for (int i = 0; i < 5; i++) {
			stud.addSubjectMark(inputs);
		}
	}
	
	public static void showMarks(Scanner inputs, Student stud){
		String confirm = "Yes"; 
		
		do{
			System.out.printf("\nDo you woant to see the average mark for some subject of the student %s. Yes/no?\n", stud.getLastName());
			
			confirm = inputs.nextLine();
			if(!confirm.equals("Yes")){
				break;
			}else{
				System.out.print("Enter subject: ");
				String subject = inputs.nextLine();
				stud.calculateAvarageMark(subject);
			}
		}while(confirm.equalsIgnoreCase("yes"));
	}

}