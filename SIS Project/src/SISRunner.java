import java.util.Scanner;
import java.io.IOException;
public class SISRunner
	{

		public static void main(String[] args) throws IOException
			{
				switch (playerMenus.Menus())
				{
					// add student
					case 1: 
							{
								StudentOperations.addStudent();
								break;
							}
					//delete student	
					case 2: 
							{
								StudentOperations.removeStudent();
								break;
							}	 
					// change grades
					case 3: 
							{
								
								break;
							}
					// change schedule
					case 4: 
							{
								
								break;
							}
					// sort last name		
					case 5: 
							{
								Sorting.sortClassroom();
								break;
							}
					// sort GPA	
					case 6: 
							{
								Sorting.sortClassroom();
								break;
							}
					// sort class period		
					case 7: 
							{
								Sorting.sortClassroom();
								break;
							}
					
					default:
				}
				
				
				
				
				
			
				
				
				

			}

	
	}
