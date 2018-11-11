public class Test02 {

  public static int sortaSum(int a, int b) {

    int c = a + b;

    if (c >= 10 && c <= 19) {
      return 20;
    } else {
      return c;
    }

  }

  public static void main(String[] args) {

    System.out.println(sortaSum(3, 4));
    System.out.println(sortaSum(9, 4));
    System.out.println(sortaSum(10, 11));

  }

}
