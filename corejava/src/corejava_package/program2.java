package corejava_package;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		System.out.println("Enter details");
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name");
			String name = sc.nextLine();
			System.out.println("Enter your Gender");
			char gender = sc.next().charAt(0);
			boolean b = sc.hasNextInt();
			int age = sc.nextInt();
			long mobnum = sc.nextLong();
			double cgpa = sc.nextDouble();
			
			System.out.println("Hy"+ name);
			System.out.println("Gender="+ gender);
	
	}
	}

}
