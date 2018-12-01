public class stringSplosion {

  public static String stringSplosion(String str) {

    String result = "";
    int charPos = 0;

    for (int rep = str.length(); rep >= 0; rep--) {

      result += str.substring(0, charPos);
      charPos++;

    }

    return result;

  }

  public static void main(String[] args) {

    System.out.println(stringSplosion("Code"));

  }

}
