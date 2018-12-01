public class frontTimes {

  public static String frontTimes(String str, int n) {

    String result = "";
    String front = "";

    if (str.length() > 3) {
      front = str.substring(0, 3);
    } else {
      front = str;
    }

    for (int rep = n; rep > 0; rep--) {
      result += front;
    }

    return result;

  }

  public static void main(String[] args) {

    System.out.println(frontTimes("Chocolate", 4));

  }

}
