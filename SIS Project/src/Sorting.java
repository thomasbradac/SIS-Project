import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Sorting implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		int result = 0;
		
		if (playerMenus.Menus() == 5)
		{
			result = s1.getLastName().compareToIgnoreCase(s2.getLastName());
		}
		
		else if (playerMenus.Menus() == 6)
		{
			result = Double.compare(s2.getGPA(), s1.getGPA());
		}
		
		else if (playerMenus.Menus() == 7)
		{
			result = s1.getClass1().compareToIgnoreCase(s2.getClass1());
		}

		return result;
	}

	public static void sortClassroom() {
		Collections.sort(readTextFile.students, new Sorting());
	}
}
