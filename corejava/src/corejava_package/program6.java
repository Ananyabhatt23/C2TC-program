package corejava_package;
import java.util.*;


//Fine program
public class program6 {

	public static void main(String[] args) {
		float days;
		System.out.println("For how many days did you hold this book with you?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=5)
		{
			System.out.println("Rs 1 per day so");
		    days = n*1;
		}
		else if(n>5 && n<10)
		{
			System.out.println("Rs 5 per day");
			days = n*5;
		}
		else
		{
			System.out.println("Rs 10 per day");
			days = n*10;
		}
		System.out.print("The fine is:"+days);

	}

}
