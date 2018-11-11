public class Test03 {

  public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

    if (!isAsleep) {

      if (isMorning && !isMom) {
        return false;
      } else {
        return true;
      }

    } else {
      return false;
    }

  }

  public static void main(String[] args) {

    System.out.println(answerCell(false, false, false));
    System.out.println(answerCell(false, false, true));
    System.out.println(answerCell(true, false, false));

  }

}
