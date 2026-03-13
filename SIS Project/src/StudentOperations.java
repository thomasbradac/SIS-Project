import java.util.Scanner;

public class StudentOperations
	{
		public static void addStudent()
			{
				Scanner stringInputs = new Scanner(System.in);
				String input;
				String addedStudent = "";
				String[] dataSplit = new String[8];
				System.out.println("I'm going to ask you a series of parameters.");
				System.out.println("Type in the parameters carefully");

				System.out.println("Type in the first name: ");
				input = stringInputs.nextLine();
				dataSplit[0] = input;

				System.out.println("Type in the last name: ");
				input = stringInputs.nextLine();
				dataSplit[1] = input;

				System.out.println("Type in the first class: ");
				input = stringInputs.nextLine();
				dataSplit[2] = input;

				System.out.println("Type in the first class's grade: ");
				input = stringInputs.nextLine();
				dataSplit[3] = input;

				System.out.println("Type in the second class: ");
				input = stringInputs.nextLine();
				dataSplit[4] = input;

				System.out.println("Type in the second class's grade: ");
				input = stringInputs.nextLine();
				dataSplit[5] = input;

				System.out.println("Type in the third class: ");
				input = stringInputs.nextLine();
				dataSplit[6] = input;

				System.out.println("Type in the third class's grade: ");
				input = stringInputs.nextLine().toUpperCase();
				dataSplit[7] = input;

				ReadTextFile.students.add(new Student(dataSplit[0], dataSplit[1], ReadTextFile.gpaCalculator(dataSplit),
						dataSplit[2], dataSplit[3], dataSplit[4], dataSplit[5], dataSplit[6], dataSplit[7]));
				;
				System.out.println("");
				System.out.println("Student Added...");
				printWholeStudent();
				

			}

		public static void removeStudent()
			{
				System.out.println("");
				Scanner intInputs = new Scanner(System.in);
				printStudentsOnly();
				boolean wantsToRemove = false;
				int index = 0;
				int check;
				while (wantsToRemove == false)
					{
						System.out.println("Type the index of student you want to remove: ");
						index = intInputs.nextInt() - 1;
						System.out.println(
								"Are you sure you want to remove <" + ReadTextFile.students.get(index).getLastName()
										+ ", " + ReadTextFile.students.get(index).getFirstName() + ">?");
						System.out.println("1) Yes");
						System.out.println("2) No");
						check = intInputs.nextInt();
						if (check == 1)
							{
								wantsToRemove = true;
							}
						else if (check == 2)
							{
								wantsToRemove = false;
							}
						else
							{
								removeStudent();
							}

					}
				ReadTextFile.students.remove(index);
				System.out.println("");
				System.out.println("Student Removed...");
				printWholeStudent();
			}

		public static void printStudentsOnly()
			{
				System.out.printf("%2s %-15s %-10s\n", "ID", "Last Name",
						"First Name");
				for (int i = 0; i < ReadTextFile.students.size(); i++)
					{
						System.out.printf("%2d %-15s %-10s\n", (i + 1), ReadTextFile.students.get(i).getLastName(),
								ReadTextFile.students.get(i).getFirstName());
					}
			}

		public static void printWholeStudent()
			{
				System.out.printf("%2s %-12s %-12s %-5s %-10s %-8s %-10s %-8s %-10s %-8s%n", "ID", "Last Name", "First Name", "GPA", "Class 1", "Grade", "Class 2", "Grade", "Class 3", "Grade");
				System.out.println("");
				for (int i = 0; i < ReadTextFile.students.size(); i++)
					{
						System.out.printf("%2d %-12s %-12s %-5.2f %-10s %-8s %-10s %-8s %-10s %-8s%n", (i + 1), ReadTextFile.students.get(i).getLastName(), ReadTextFile.students.get(i).getFirstName(), ReadTextFile.students.get(i).getGPA(), ReadTextFile.students.get(i).getClass1(), ReadTextFile.students.get(i).getClass1Grade(), ReadTextFile.students.get(i).getClass2(), ReadTextFile.students.get(i).getClass2Grade(), ReadTextFile.students.get(i).getClass3(), ReadTextFile.students.get(i).getClass3Grade());
					}
			}
	}
