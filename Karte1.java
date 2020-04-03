package JavaKurs30032020;

import java.util.Scanner;

abstract class Karte
{
  String empfaenger;
  String anrede;
  public abstract void gruss();
  Karte( String empfaenger, String sex){
	  this.empfaenger = empfaenger;
	  if(sex.equals("w") || sex.equals("W"))
	  {
		  this.anrede = "Liebe";
	  }
	  else if(sex.equals("m") || sex.equals("M")) 
	  {
		  this.anrede = "Lieber";
	  }
	  else
	  {
		  this.anrede = "Liebe/Lieber";
	  }
  }
}

class Feiertag extends Karte
{
  public Feiertag( String e, String sex)
  {
    super(e, sex);
  }

  public void gruss()
  {
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}

class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String e, String sex, int jahre )
  {
    super(e, sex);
    this.alter = jahre;
  }

  public void gruss()
  {
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
  }
}

class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String e, String sex, int k )
  {
	  super(e, sex);
	  this.kuesse = k;
  }

  public void gruss()
  {
    System.out.println(anrede + " " + empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}

public class Karte1
{
  public static void main ( String[] args )
  {
    String name;
    String gender;
    Scanner scan = new Scanner( System.in );

    System.out.println("Ihr Name");
    name = scan.nextLine();
    System.out.println("Ihr Geschlecht <m> oder <w>");
    gender = scan.nextLine();

    Feiertag   feiern = new Feiertag( name, gender );
    feiern.gruss();

    Geburtstag  geb  = new Geburtstag( name, gender, 21 );
    geb.gruss();

    Valentin val = new Valentin( name, gender, 7 );
    val.gruss();

  }
}