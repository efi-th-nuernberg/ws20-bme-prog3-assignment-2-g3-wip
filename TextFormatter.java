class TextFormatter {

  /*
  TODO 
  - Leerzeichen am Anfang einer Zeile
  - Namen der Variablen
  - evtl mehr Funktionen zur Übersichtlichkeit
  - letzten 20 Zeichen ausgeben lassen 
  */

  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  public static void main(String[] args) {
    TextFormatter formatter = new TextFormatter(30);
    formatter.print(text);

   
  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {
    
  }

  // Ausgabe
  public void print(String textA) {

   
         
        
      String firstHalf;
      String remainder;
      int excess = 0;
     
      while(textA.length() >= 30){

        if (textA.charAt(30) == ' '){
          firstHalf = textA.substring(0, 30);
          remainder = textA.substring(30);
          System.out.println(firstHalf + "\n");

        } else {

          while (textA.charAt(30 + excess) != ' ') excess++;

          firstHalf = textA.substring(0, 30+excess);
          remainder = textA.substring(30+excess);
          System.out.println(firstHalf + "\n");
          excess = 0;
          
        }

        textA = remainder;
      }



    System.out.println("Hier sollte der Text mit passendem Umbruch erscheinen.");
  }

}