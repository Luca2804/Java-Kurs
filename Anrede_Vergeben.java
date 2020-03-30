package JavaKurs30032020;

import java.util.Scanner;
import java.awt.*;

public class Anrede_Vergeben {

	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);

		
		String Name = "blabla";
		
		while(Name != " ")
		{
			System.out.println("Geben sie einen Namen ein: ");
			Name = scan.nextLine();
			if(Name.equals("Elory") || Name.equals("Fred") || Name.equals("Graham"))
			{
				System.out.println("Mr. " + Name);
			}
			else if(Name.equals("Amy") || Name.equals("Buffy") || Name.equals("Cathy"))
			{
				System.out.println("Ms.  " + Name);
			}
			else
			{
				System.out.println(Name);
			}
		}
	}
}
