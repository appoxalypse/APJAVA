public class selfDivisor {

  /** @param number the number to be tested
    *         Precondition: number > 0
    *  @return true if every decimal digit of
    *          number is a divisor of number;
    *          false otherwise
    */

  public static boolean isSelfDivisor(int number) {

    String strNum = Integer.toString(number);
    // int resultArray [];
    boolean boolRes = true;

    for (int i = 0; i < strNum.length(); i++) {

      char charDig = strNum.charAt(i);
      int digit = charDig;
      int result = 0;

      if (digit != 0) {
        result = number % digit;
      } else {
        continue;
      }

      if (result == 0) {
        continue;
      } else {
        boolRes = false;
        break;
      }

      // resultArray.add(result);

    }
/*
    for (int n = 0; n < resultArray.size(); n++) {
      if (resultArray[n] == 0) {
        continue;
      } else {
        boolRes = false;
        break;
      }
    }
*/
    return boolRes;

  }

  /****************/

  public static void main(String[] args) {

    System.out.println("128: " + isSelfDivisor(128));
    System.out.println("26: " + isSelfDivisor(26));
    System.out.println("120: " + isSelfDivisor(120));
    System.out.println("102: " + isSelfDivisor(102));

  }

}
