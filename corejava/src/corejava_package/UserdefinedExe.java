package corejava_package;
import java.io.*;
import java.util.Scanner;


	public class UserdefinedExe {
		private static String UserId;
		static void user() throws UserId
		{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
        String str = sc.nextLine();
        int upper = 0, lower = 0, special = 0;
        if(str.length() > 6)
    	{
    		System.out.println("Not reachable");
    	}
        else {

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else
                special++;
        }
        }
        if(upper==3 && lower==2 && special==1)
        {
        	System.out.println("Logic is correct");
        }
        else {
            System.out.println("Not correct");
        }

		}
		public static void main(String[] args) {
					try
					{
					 user();	
					}
					catch(Exception e)
					{
						System.out.println("Caught an Exception");
					}
	}
	}


