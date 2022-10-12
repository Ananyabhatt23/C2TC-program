package corejava_package;
import java.util.*;

public class Loopy {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int temp = 30;
//		for(int week=1;week<5;week++)
//		{
//			temp=temp-2;
//		}
//		System.out.println("The temperature is "+ temp);
		
		
// Accept 10 numbers and calculate all negetive numbers product
		
		int product = 1;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<= 3; i++)//i is number of iterations
		{
			int n = sc.nextInt();
			if(n<0)
			{
				 product = n*product;
				System.out.println("The product is "+ product);
			}
			else
				{
				System.out.println("It is posiitive number");
				}
			
		}
		

	}

}
