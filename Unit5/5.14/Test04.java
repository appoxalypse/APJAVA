public class Test04 {

  public static void main(String[] args) {

    String message = "Place the bomb today";

    if (message.indexOf(" bomb ") >= 0) {
      System.out.println("Possible bomb threat");
    } else {
      System.out.println("No mention of bomb");
    }

  }

}
