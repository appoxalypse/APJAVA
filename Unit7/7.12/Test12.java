public class Test12 {
  public static void main(String[] args) {

    String message = "Ix lovex youxxx";

    /* without loop */
    String result = message.replace("x", "");
    System.out.println(result);

    /* with loop */
    String result2 = "";
    for (int charLocation = 0; charLocation < message.length(); charLocation++) {

      if (message.charAt(charLocation) == 'x') {
        continue;
      } else {
        result2 += message.charAt(charLocation);
      }

    }
    System.out.println(result2);

  }
}
