public class Test07 {

  public static int withoutDoubles(int die1, int die2, boolean noDoubles) {

    int sum = die1 + die2;

    if (!noDoubles) {
      return sum;
    } else {
      if (die1 == die2) {
        if (die1 == 6) {
          die1 = 1;
        } else {
          die1++;
        }
        return die1 + die2;
      } else {
        return sum;
      }
    }

  }

  public static void main(String[] args) {

    System.out.println(withoutDoubles(2, 3, true));
    System.out.println(withoutDoubles(3, 3, true));
    System.out.println(withoutDoubles(3, 3, false));

  }

}
