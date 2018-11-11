public class Test05 {

  public static boolean lastDigit(int a, int b, int c) {

    int lastA = a % 10;
    int lastB = b % 10;
    int lastC = c % 10;

    if (lastA == lastB || lastA == lastC || lastB == lastC) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {

    System.out.println(lastDigit(23, 19, 13));
    System.out.println(lastDigit(23, 19, 12));
    System.out.println(lastDigit(23, 19, 3));

  }

}
