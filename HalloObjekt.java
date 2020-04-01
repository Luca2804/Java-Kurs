package JavaKurs30032020;

import java.util.Scanner;

class HalloObjekt
{
  // Methodendefinition
  void sprich()
  {
	  Scanner scan = new Scanner(System.in);
	  
	  String Text; 
	  
	  System.out.println("Geben sie einen Text ein:");
	  Text = scan.nextLine();
	  System.out.println(Text);
  } 
}

class HalloTester
{
  public static void main ( String[] args )
  {
    HalloObjekt einObjekt = new HalloObjekt();

    einObjekt.sprich();
  }
}