public class stringTimes {

  public static String stringTimes(String str, int n) {

    String result = "";

    for (int rep = n; rep > 0; rep--) {

      result += str;

    }

    return result;

  }

  public static void main(String[] args) {

    String inputString = "Hi";
    int repetitions = 2;

    System.out.println(stringTimes(inputString, repetitions));

  }

}
