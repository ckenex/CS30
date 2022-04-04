package projects;
import java.io.*;

public class Stats 
{
	
	public static void main(String[] args)
	{
		
		File dataFile = new File("C:\\test1.txt");
		FileReader in;
		BufferedReader readFile;
		String stuname, mark;
		double avgMark;
		double totalMarks = 0;
		int markCount = 0;
		
		try 
		{
			
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			while((stuname = readFile.readLine()) != null)
			{	
				mark = readFile.readLine();
				System.out.println("name: " + stuname + " grade: " +mark);
				
				markCount += 1;
			
				totalMarks += Double.parseDouble(mark);
			}
			avgMark = totalMarks / markCount;
			System.out.println("Average: " + avgMark);
			readFile.close();
			in.close();
		} 
		catch(FileNotFoundException e)
		{
			System.out.println("File does not exist or could not be found");
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch (IOException e)
		{
			System.out.println("Problem reading file");
			System.err.println("IOException: " + e.getMessage());
			
		}
		
		
	}

}
