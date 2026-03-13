import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Sorting implements Comparator<Student>
	{
		public static int selection;

		public int compare(Student s1, Student s2)
			{
				int result = 0;

				if (selection == 5)
					{
						result = s1.getLastName().compareToIgnoreCase(s2.getLastName());
					}

				else if (selection == 6)
					{
						result = Double.compare(s2.getGPA(), s1.getGPA());
					}

				else if (selection == 7)
					{
						result = s1.getClass1().compareToIgnoreCase(s2.getClass1());
					}
				else if (selection == 8)
					{
						result = s1.getClass2().compareToIgnoreCase(s2.getClass2());
					}
				else if (selection == 9)
					{
						result = s1.getClass3().compareToIgnoreCase(s2.getClass3());
					}

				return result;
			}

		public static void sortClassroom(int choice)
			{
				selection = choice;
				Collections.sort(ReadTextFile.students, new Sorting());
				System.out.println("");
				System.out.println("Sorted...");
				StudentOperations.printWholeStudent();
				
			}

		
	}