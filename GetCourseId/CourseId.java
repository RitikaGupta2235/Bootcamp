import java.util.*;

public class CourseId {
		
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int py=1;
		int j=1;
		int php=1;
		String Name = "";
		int Course;
		int ch;
		do
		{
			System.out.println("Enter course\n1. Java\n2. Python\n3. PHP");
			System.out.print("Enter Name: ");
			Name = sc.nextLine();
			System.out.print("Enter course: ");
			Course = sc.nextInt();
			System.out.println(Name);
			if(Course==1)
			{
				System.out.println("ID: Java"+j );
				j++;
			}
			else {
				if(Course==2)
				{
					System.out.println("ID: Py"+py );
					py++;
				}
				else
				{
					System.out.println("ID: PHP"+php );
					php++;
				}
			}
			System.out.println("Do You want to continue: ");
			ch = (sc.next()).charAt(0);
			sc.nextLine();
		}while(ch=='Y');
		
		sc.close();
	}

}
