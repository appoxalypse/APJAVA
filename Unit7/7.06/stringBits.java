public class stringBits {

  public static String stringBits(String str) {

    String result = "";
    int charPos = 0;

    for (int rep = str.length(); rep > 0; rep--) {

      if (rep % 2 == 1) {
        result += str.charAt(charPos);
      }

      charPos += 1;

    }

    return result;

  }

  public static void main(String[] args) {

    System.out.println(stringBits("Heeololeo"));

  }

}
