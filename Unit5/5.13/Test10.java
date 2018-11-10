public class Test10 {

  public static void main(String[] args) {

    double score = 67;

    if (score >= 92) {
      System.out.println("A");
    } else if (score < 92 && score >= 82) {
      System.out.println("B");
    } else if (score < 82 && score >= 72) {
      System.out.println("C");
    } else if (score < 72 && score >= 62) {
      System.out.println("D");
    } else {
      System.out.println("E");
    }

  }

}
