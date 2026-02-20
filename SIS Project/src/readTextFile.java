import java.io.File;
import java.io.IOException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class readTextFile 
	{
		
		public static void readTextFile() throws IOException
		{
			ArrayList<String> students = new ArrayList<String>();
			String fileName = "StudentInfo.txt";
			Scanner fileReader = new Scanner(new File("StudentInfo.txt"));
			while (fileReader.hasNextLine()) 
			{
				String data = fileReader.nextLine();
				String[] dataSplit = data.split(" ");
				students.firstName.get(0) = dataSplit[0];
			}
		
			
			
			
			
		}
		
	}
