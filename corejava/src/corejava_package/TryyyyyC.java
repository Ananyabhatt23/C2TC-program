package corejava_package;
import java.util.*;

public class TryyyyyC {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		
		try {
			int ab[]= {0,1,2};
		int bc[] = {0,10};
		int z=ab[0]/bc[1];
		System.out.println(z);
	}
		catch(ArithmeticException ae)
		{
			System.out.println("outer catch");
		}
		System.out.println("Am out of block");
	}
}
