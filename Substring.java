class StringDemo3
{
  public static void main ( String[] args )
  {
    String str = new String( "Golf is a good walk spoiled." ); // erzeuge das originale Stringobjekt
	int Parameter1 = 0;
	int Parameter2 = 27;
	
	
    String sub = str.substring(Parameter1,Parameter2); // erzeuge ein neues Objekt aus dem Original

    System.out.println( sub );

  }
}