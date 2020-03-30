package JavaKurs30032020;

import java.util.Scanner;
import java.awt.*;

public class Point_Objekte {
	public static void main(String args[]) {
	
	Scanner scan = new Scanner(System.in);
	
	Integer x1 = 0, x2 = 0, y1 = 0, y2 = 0;
	Point PunktA , PunktB;
	String Punkt1 , Punkt2;
	
	
	System.out.println("Wert x1");
	x1 = scan.nextInt();
	System.out.println("Wert x2");
	x2 = scan.nextInt();
	System.out.println("Wert y1");
	y1 = scan.nextInt();
	System.out.println("Wert y2");
	y2 = scan.nextInt();
	
	PunktA = new Point(x1 , x2);
	PunktB = new Point(x2 , y2);
	
	Punkt1 = PunktA.toString();
	Punkt2 = PunktB.toString();
	
	System.out.println(Punkt1);
	System.out.println(Punkt2);
	
	if(Punkt1.equals(Punkt2))
		{
			System.out.println("Die Koordinaten der beiden Punkte sind gleich:");
			System.out.println(Punkt1 + " und " + Punkt2 );
		}
	
	}
}

	
	