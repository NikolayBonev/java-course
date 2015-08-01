package oopproject;

public class Test {

	public static void main(String[] args) {
		String[] arr = {"4C", "1A", "12B", "5C", "8A"};
		
		Teacher teacher = new Teacher("Yoana", "Ovcharova", 10, "Physics");
		Teacher teacher1 = new Teacher("Ivan", "Petcov", 2, "Math");
		Lector lecturer = new Lector("Naiden", "Naidenov", 20, "Sofia University");
		Lector lecturer1 = new Lector("Momchil", "Petkov", 10, "Technical University");
		Profesor professor = new Profesor("Lalka", "Boneva", 10, "Technical University", "Profesor");
		Assistant assistant = new Assistant("Rumen", "Petrov", 4, "UNSS", true);
		Assistant assistant1 = new Assistant("Martin", "Chakurov", 8, "Technical University", false);
		SchoolTeacher schoolTeacher = new SchoolTeacher("Tihomir", "Kostovski", 3, "Math", arr);
		CollegeTeacher collegeTeacher = new CollegeTeacher("Ivan", "Dimitrov", 19, "Computer networks", "TUES");
		
		System.out.printf("The instances are %d.\n" ,Person.countInstances);
		System.out.println();
		
		teacher.helloGreating();
		teacher.messageActivity();
		teacher.byeGreating();
		System.out.println();
		
		teacher1.helloGreating();
		teacher1.messageActivity();
		teacher1.byeGreating();
		System.out.println();
		
		lecturer.helloGreating();
		lecturer.messageActivity();
		lecturer.lecturesWeek();
		System.out.println();
		lecturer.checkUpr("Math");
		lecturer.checkUpr("Art", 2);
		lecturer.checkUpr("Physics", 3, 43);
		System.out.println();
		
		lecturer1.helloGreating();
		lecturer1.messageActivity();
		lecturer1.lecturesWeek();
		lecturer1.checkUpr("Art");
		lecturer1.checkUpr("Math", 4);
		lecturer1.checkUpr("Physics", 2, 33);
		System.out.println();
		
		professor.printTitleLector();
		professor.messageActivity();
		System.out.println();

		assistant.printTitleLector();
		assistant.messageActivity();
		assistant.writeArticles();
		System.out.println();
		
		assistant1.printTitleLector();
		assistant1.messageActivity();
		assistant1.writeArticles();
		System.out.println();
		
		schoolTeacher.print();
		System.out.println();
		schoolTeacher.kids();
		schoolTeacher.messageActivity();
		System.out.println();

		collegeTeacher.messageActivity();		
		
	}

}
