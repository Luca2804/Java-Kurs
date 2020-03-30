package JavaKurs30032020;

import java.util.Scanner;
import java.awt.*;

public class Point_objekte2 {
	
	public static void main(String args[]) {
		
	Point pt1 , pt2;
	
	pt1 = new Point(10 , 10);
	pt2 = new Point(30 , 30);
	
	int Flaeche =  Math.abs(pt1.x - pt2.x) * Math.abs(pt1.y - pt2.y);
	
	System.out.println("Die Flaeche betraegt: " + Flaeche);
		
	}
}
