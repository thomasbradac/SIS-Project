import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Sorting implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		int result = 0;
		
		if (playerMenus.Menus() == 1)
		{
			result = s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
		}
		
		else if (playerMenus.Menus() == 2)
		{
			result = Double.compare(s2.getGPA(), s1.getGPA());
		}
		
		else if (playerMenus.Menus() == 3)
		{
			result = s1.getClass1().compareToIgnoreCase(s2.getClass1());
		}

		return result;
	}

	public static void sortClassroom() {
		Collections.sort(readTextFile.students, new Sorting());
	}
}
