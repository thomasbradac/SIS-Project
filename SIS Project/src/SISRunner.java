import java.util.Scanner;
import java.io.IOException;

public class SISRunner
	{

		public static void main(String[] args) throws IOException
			{
				ReadTextFile.readTextFile();
				StudentOperations.printWholeStudent();
				int choice = PlayerMenus.Menus();
				switch (choice)
					{
					// add student
					case 1:
						{
							StudentOperations.addStudent();
							break;
						}
					// delete student
					case 2:
						{
							StudentOperations.removeStudent();
							break;
						}
					// change grades
					case 3:
						{
							ChangeClassroom.changeGrade(ReadTextFile.students);
							break;
						}
					// change schedule
					case 4:
						{
							ChangeClassroom.changeSchedule(ReadTextFile.students);
							break;
						}
					// sorting
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
						{
							Sorting.sortClassroom(choice);
							break;
						}

					default:
					}

			}

	}
