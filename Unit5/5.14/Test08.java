public class Test08 {

  public static void main(String[] args) {

    String name = "Julian";
    String firstLetter = name.substring(0,1);
    String lowerFirst = firstLetter.toLowerCase();

    boolean aF = lowerFirst.equals("a");
    boolean eF = lowerFirst.equals("e");
    boolean iF = lowerFirst.equals("i");
    boolean oF = lowerFirst.equals("o");
    boolean uF = lowerFirst.equals("u");

    if (aF || eF || iF || oF || uF) {
      System.out.println("Starts with a vowel");
    } else {
      System.out.println("Starts with a consonant");
    }

  }

}
