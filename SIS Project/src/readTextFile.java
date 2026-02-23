import java.io.File;
import java.io.IOException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class readTextFile 
	{
		
		
		
		public static void readTextFile() throws IOException
		{
			ArrayList<Student> students = new ArrayList<Student>();
			String fileName = "StudentInfo.txt";
			Scanner fileReader = new Scanner(new File("StudentInfo.txt"));
			while (fileReader.hasNextLine()) 
				{
					String data = fileReader.nextLine();
					String[] dataSplit = data.split(" ");
					
				}
			
		}
		
		
		public static int gpaCalculator (int class1Grade , int class2Grade , int class3Grade , String[] dataSplit)
			{
				
				
				
				
				return 0; 
			}
		
		
		public static void fillArrayList()
		{
			students.add(new Student(dataSplit[0], dataSplit[1] , Integer.parseInt(dataSplit[2]) , dataSplit[3] , dataSplit[4] , dataSplit[5] , dataSplit[6] , dataSplit[7] , dataSplit[8]));
		}
		
	}
