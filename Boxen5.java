package JavaKurs30032020;

	class Box3
	{
		double breite;
		double hoehe;
		double laenge;
		
	Box3(double breite, double hoehe, double laenge)
		{
		this.breite = breite;
		this.hoehe = hoehe;
		this.laenge = laenge;
		}	
	
	public boolean passtIn(Box3 innereBox, Box3 aeussereBox)
	{
		if (innereBox.breite < aeussereBox.breite && innereBox.hoehe < aeussereBox.hoehe && innereBox.laenge < aeussereBox.laenge)
		{return true;}
			else
		{return false;}
	}
	
	public Box3 groessereBox()
	{
		return new Box3(1.25 * this.breite, 1.25 * this.hoehe, 1.25 * this.laenge );
	}
	
	private double berechneOberflaechevorne()
	{
		return laenge * hoehe;
	}
	
	private double berechneOberflaecheoben()
	{
		return laenge * breite;
	}
	
	private double berechneOberflaecheseite()
	{
		return hoehe * breite;
	}
		
	double berechneOberflaeche()
	{
		return 2*berechneOberflaechevorne() +
			   2*berechneOberflaecheoben() +
			   2*berechneOberflaecheseite();	
	}

	double berechneVolumen()
	{
		return breite*laenge+hoehe;
	}
}

class BoxTester3
{
  public static void main ( String[] args )
  {
     Box3 box = new  Box3( 2.5, 5.0, 6.0 ) ;

     
     System.out.println( "Flaeche: "  + box.berechneOberflaeche( ) +
                         " Volumen: " + box. berechneVolumen());
     
     System.out.println( "Laenge: " + box.laenge +
             			 " Hoehe: " + box. hoehe +
             			 "Breite: " + box.breite );
     
     Box3 box1 = new Box3(1, 1, 1);
     System.out.println( "Flaeche: "  + box1.berechneOberflaeche( ) +
    		 			 " Volumen: " + box1. berechneVolumen());

     System.out.println( "Laenge: " + box1.laenge +
 			 			 " Hoehe: " + box1. hoehe +
 			             "Breite: " + box1.breite );
     
 	if (box.passtIn(box, box1))
	{
		System.out.println("Passt in die aeussere Box!");
	}
	else
	{
		System.out.println("Passt nicht in die aeussere Box!");
	}
  }
}
