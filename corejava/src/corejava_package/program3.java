package corejava_package;
import java.util.*;
//avg program
public class program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.nextLine();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your marks of 3 sybject:");
		 int mark1 = sc.nextInt();
		 int mark2 = sc.nextInt();
		 int mark3 = sc.nextInt();
		 int sum  = mark1+mark2+mark3;
		 double avg = sum/3;
		 System.out.println("Average is:"+avg);
		 
		
		

	}

}
