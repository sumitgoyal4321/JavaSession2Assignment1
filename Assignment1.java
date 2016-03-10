import java.util.*;

public class Assignment1 {
	public static void main(String[]str)
	{	
		System.out.println("Weclome Guest...");
		
		
		Scanner reader = new Scanner(System.in); 		
		System.out.print("Please Enter Your Age:");
		int age = reader.nextInt();
		
		if(age<=0)
		{
			System.out.println("Invalid input. Please try againg");
			return;
		}
		
		else if(age>=0 && age < 18)
		{
			System.out.println("Sorry... You are not eligible for vote.");
			return;
		}
		else			
		{
			System.out.println("Congratulation... You are eligible for vote.");
		}
	}
}
