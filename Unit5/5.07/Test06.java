public class Test06 {

  public static int teenSum(int a, int b) {

    int c = a + b;

    if (a >= 13 && a <= 19) {
      return 19;
    } else if (b >= 13 && b <= 19) {
      return 19;
    } else {
      return c;
    }

  }

  public static void main(String[] args) {

    System.out.println(teenSum(3, 4));
    System.out.println(teenSum(10, 13));
    System.out.println(teenSum(13, 2));

  }

}
