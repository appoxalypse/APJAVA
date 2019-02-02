public class Test13 {
  public static void main(String[] args) {

    String line = "";
    for (int i = 5; i >= 2; i--) {
      line = "";

      for (int x = i; x > 0; x--) {
        line += i;
      }

      System.out.println(line);
    }

  }
}
