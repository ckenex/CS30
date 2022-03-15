/*

Program: TestUniversity.java          Last Date of this Revision: March 15, 2022



Author: Caden, 
School: CHHS
Course: Computer Programming 30
 

*/


package University;

public class TestUniversity {

	public static void main(String[] args)
	{
		
		Staff test1 = new Staff("Jerry", 66000, "janitor");
		Faculty test2 = new Faculty("Berry", 153000, "professor");
		
		System.out.println(test1.getName() + " makes $" + test1.getSalary() + " while " + test2.getName() + " makes $" + test2.getSalary());
		System.out.println(test1.getName() + " is a " + test1.getJob() + " while " + test2.getName() + " is a " + test2.getDepartment());
		
		System.out.println();
		System.out.println(test1.toString());
		System.out.println(test2.toString());

	}

}
/*Screen Dump
  
Jerry makes $66000.0 while Berry makes $153000.0
Jerry is a janitor while Berry is a professor

Jerry has salary: $66000.0 and works as a janitor.
Berry has salary: $153000.0 and works in the professor department.

  
*/

