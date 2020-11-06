class TextFormatter {

  /*
  TODO 
  - Namen der Variablen
  - evtl mehr Funktionen zur Übersichtlichkeit
  */

  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  private int maxLineLength;  

  public static void main(String[] args) {

    TextFormatter formatter = new TextFormatter(30);
    formatter.print(text);

  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {

    this.maxLineLength = maxLineLength;

  }

  // Ausgabe
  public void print(String textA) {

      String firstPart;
      String remainder;
   
      while(textA.length() >= maxLineLength){

        if (textA.charAt(maxLineLength - 1) == ' '){
          firstPart = textA.substring(0, maxLineLength);
          remainder = textA.substring(maxLineLength -1);
          System.out.println(firstPart);

        } else {

          firstPart = textA.substring(0, maxLineLength - 1);
          remainder = textA.substring(maxLineLength - 1);

          if(textA.charAt(maxLineLength - 2) == ' ')  
            System.out.println(firstPart );  
          else
            System.out.println(firstPart+ '-');
          
        }

        if(remainder.charAt(0) == ' ') remainder = remainder.substring(1);
          
        textA = remainder;
        
      }

      System.out.println(textA);
      

    System.out.println("Hier sollte der Text mit passendem Umbruch erscheinen.");
  }

}