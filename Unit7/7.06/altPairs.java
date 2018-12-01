public class altPairs {

  public static String altPairs(String str) {

    String result = "";
    int charPos = 0;
    int thisLetter = 0;

    for (int rep = str.length(); rep > 0; rep--) {

      if (charPos == thisLetter) {
        result += str.charAt(charPos);

        if (thisLetter != str.length() - 1) {
          result += str.charAt(charPos + 1);
        }

        thisLetter += 4;
      }

      charPos++;

    }

    return result;

  }

  public static void main(String[] args) {

    System.out.println(altPairs("CodingHorror"));

  }

}
