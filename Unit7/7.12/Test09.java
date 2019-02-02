public class Test09 {
  public static void main(String[] args) {

    String sample = "test :)";

    for (int charNum = sample.length(); charNum > 0; charNum--) {
      String printVal = sample.substring(0, charNum);
      System.out.println(printVal);
    }

  }
}
