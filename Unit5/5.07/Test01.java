public class Test01 {

  public static boolean more20(int n) {

    if (n % 20 == 1 || n % 20 == 2) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {

    System.out.println(more20(20));
    System.out.println(more20(21));
    System.out.println(more20(22));

  }

}
