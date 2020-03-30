package JavaKurs30032020;

import java.awt.*;

public class Point_Gleiche_Referenzen {
	
	public static void main(String args[]) {
		
		Point pt1v, ptAliasv;
		
		pt1v = new Point(10,10);
		ptAliasv = pt1v;
		
		if(ptAliasv == pt1v)
		{
			System.out.println("pt1 und ptAlias verweisen auf dasselbe Objekt!");
		}
		
		System.out.println("Point pt1 vorher: " + pt1v.toString());
		System.out.println("Point ptAlias vorher: " + ptAliasv.toString());
		
		ptAliasv.move(2*ptAliasv.x , 2*ptAliasv.y);		
		
		System.out.println("Nur von ptAlias wurden die x- und y-Werte verdoppelt!");
		System.out.println("Point pt1 nachher: " + pt1v.toString());
		System.out.println("Point ptAlias nachher: " + ptAliasv.toString());
		
		
	}

}
