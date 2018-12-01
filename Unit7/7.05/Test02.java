public class Test02 {

  public static void main(String[] args) {

    String result = "";
    String message = "watch out";
    int pos = 0;

    while (pos < message.length() - 1) {

      result = result + message.substring(pos, pos + 2);
      pos = pos + 1;

    }

    System.out.println(result);

  }
}
