import java.util.Scanner;
import java.util.ArrayList;

public class ChangeClassroom
	{

public static void changeGrade(ArrayList <Student> students){
			System.out.println("");
			System.out.println("What student's grade would you like to change?");
			
			StudentOperations.printWholeStudent();
			
			System.out.println("Enter the number.");
			
			Scanner studentSelection = new Scanner(System.in);
			int selectedStudent = studentSelection.nextInt() - 1;
			System.out.printf("%2s %-12s %-12s %-5s %-10s %-8s %-10s %-8s %-10s %-8s%n", "ID", "Last Name", "First Name", "GPA", "Class 1", "Grade", "Class 2", "Grade", "Class 3", "Grade");
			System.out.printf("%2d %-12s %-12s %-5.2f %-10s %-8s %-10s %-8s %-10s %-8s%n", (selectedStudent + 1), ReadTextFile.students.get(selectedStudent).getLastName(), ReadTextFile.students.get(selectedStudent).getFirstName(), ReadTextFile.students.get(selectedStudent).getGPA(), ReadTextFile.students.get(selectedStudent).getClass1(), ReadTextFile.students.get(selectedStudent).getClass1Grade(), ReadTextFile.students.get(selectedStudent).getClass2(), ReadTextFile.students.get(selectedStudent).getClass2Grade(), ReadTextFile.students.get(selectedStudent).getClass3(), ReadTextFile.students.get(selectedStudent).getClass3Grade());
			
			
			System.out.println("Which grade would you like to change?");
			System.out.println("1. Period 1");
			System.out.println("2. Period 2");
			System.out.println("3. Period 3");
			
			Scanner classSelection = new Scanner(System.in);
			int chosenClass = classSelection.nextInt();
			
			System.out.println("What would you like to change the grade to?");
			
			Scanner gradeSelection = new Scanner(System.in);
			String chosenGrade = gradeSelection.nextLine();
			
			switch(chosenClass) {
				case 1:
						{
							students.get(selectedStudent).setClass1Grade(chosenGrade.toUpperCase());
							break;
						}
				case 2:
						{
							students.get(selectedStudent).setClass2Grade(chosenGrade.toUpperCase());
							break;
						}
				case 3:
						{
							students.get(selectedStudent).setClass3Grade(chosenGrade.toUpperCase());
							break;
						}
						
			}
			
			System.out.println("");
			System.out.println("Grade Changed...");
			StudentOperations.printWholeStudent();
		}

public static void changeSchedule(ArrayList <Student> students){
		
		System.out.println("What student's schedule would you like to change?");
		
		StudentOperations.printWholeStudent();
		
		System.out.println("Enter the number.");
		
		Scanner studentSelection = new Scanner(System.in);
		int selectedStudent = studentSelection.nextInt() - 1;
		System.out.printf("%2s %-12s %-12s %-5s %-10s %-8s %-10s %-8s %-10s %-8s%n", "ID", "Last Name", "First Name", "GPA", "Class 1", "Grade", "Class 2", "Grade", "Class 3", "Grade");
		System.out.printf("%2d %-12s %-12s %-5.2f %-10s %-8s %-10s %-8s %-10s %-8s%n", (selectedStudent + 1), ReadTextFile.students.get(selectedStudent).getLastName(), ReadTextFile.students.get(selectedStudent).getFirstName(), ReadTextFile.students.get(selectedStudent).getGPA(), ReadTextFile.students.get(selectedStudent).getClass1(), ReadTextFile.students.get(selectedStudent).getClass1Grade(), ReadTextFile.students.get(selectedStudent).getClass2(), ReadTextFile.students.get(selectedStudent).getClass2Grade(), ReadTextFile.students.get(selectedStudent).getClass3(), ReadTextFile.students.get(selectedStudent).getClass3Grade());
		
		System.out.println("Which class would you like to change?");
		System.out.println("1. Period 1");
		System.out.println("2. Period 2");
		System.out.println("3. Period 3");
		Scanner classSelection = new Scanner(System.in);
		int selectedClass = classSelection.nextInt();
		
		System.out.println("What would you like to change the class to?");
		
		Scanner classChange = new Scanner(System.in);
		String newClass = classChange.nextLine();
		
		switch(selectedClass) {
			case 1:
					{
						students.get(selectedStudent).setClass1(newClass);
						break;
					}
			case 2:
					{
						students.get(selectedStudent).setClass2(newClass);
						break;
					}
			case 3:
					{
						students.get(selectedStudent).setClass3(newClass);
						break;
					}
					
		}
		
		
		System.out.println("");
		System.out.println("Class Changed...");
		StudentOperations.printWholeStudent();
	

}
	}
