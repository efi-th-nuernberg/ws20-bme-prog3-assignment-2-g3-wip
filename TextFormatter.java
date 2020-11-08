class TextFormatter {

  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  private StringBuilder builder = new StringBuilder("                              ");
  int excess;
  private String firstPart;
  private String remainder;

  private int maxLineLength;  

  public static void main(String[] args) {

    TextFormatter formatter = new TextFormatter(30);
    formatter.print(text);
    formatter.alignRight(text);
    

  }


  public TextFormatter(int maxLineLength) {

    this.maxLineLength = maxLineLength;

  }


  public void print(String textA) {
    while(textA.length() >= 30){

      trimSentence(textA);
      System.out.println(firstPart);
      textA = remainder;
    }

    System.out.println(remainder + "\n");

  }


     public void alignRight(String textLine) {

      builder.setLength(maxLineLength);
      if(textLine.charAt(0) == ' ') textLine = textLine.substring(1);

      while(textLine.length() >= maxLineLength){
        
        builder.replace(0, 29, "                              ");

        if (textLine.charAt(maxLineLength - 1) == ' '){
          trimSentence(textLine);
          System.out.println(firstPart);
          textLine = remainder;
        }
          
         else{
           trimSentence(textLine);
           System.out.println(builder.replace(maxLineLength - firstPart.length(), maxLineLength, firstPart));
           textLine = remainder;
         }
          
      }

      System.out.println(builder.replace(maxLineLength - remainder.length()-1, maxLineLength, remainder));
      

   }

  public void trimSentence(String text){

    if (text.charAt(30) == ' '){
      firstPart = text.substring(1, 30);
      remainder = text.substring(30);

    } else {
      
      while (text.charAt(30 - excess) != ' ') excess++;

      firstPart = text.substring(0, 30-excess+1);
      remainder = text.substring(30-excess+1);
      excess = 0;

    }
  }


}




