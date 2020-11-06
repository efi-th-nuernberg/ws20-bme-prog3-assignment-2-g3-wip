class TextFormatter {

  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";


  private String firstPart;
  private String remainder;

  private int maxLineLength;  

  public static void main(String[] args) {

    TextFormatter formatter = new TextFormatter(30);
    formatter.print(text);

  }


  public TextFormatter(int maxLineLength) {

    this.maxLineLength = maxLineLength;

  }


  public void print(String textA) {

    checkLengthAndPrint(textA);
    System.out.println("Hier sollte der Text mit passendem Umbruch erscheinen.");

  }


  public void checkLengthAndPrint(String textA){
      
      while(textA.length() >= maxLineLength){

        if (textA.charAt(maxLineLength - 1) == ' ')
          printEntireWord(textA);
         else 
          printCutOffWord(textA);
          
        if(remainder.charAt(0) == ' ') remainder = remainder.substring(1);
        textA = remainder;
        
      }

        System.out.println(textA);

  }


  private void printEntireWord(String textA){

    firstPart = textA.substring(0, maxLineLength);
    remainder = textA.substring(maxLineLength -1);
    System.out.println(firstPart);

  }


  private void printCutOffWord(String textA){
    firstPart = textA.substring(0, maxLineLength - 1);
    remainder = textA.substring(maxLineLength - 1);

    if(textA.charAt(maxLineLength - 2) == ' ')  
       System.out.println(firstPart );  
     else
      System.out.println(firstPart+ '-');
  }

}