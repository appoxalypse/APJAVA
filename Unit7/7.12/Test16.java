public class Test16 {
  public static void main(String[] args) {

    String message = "xyxxzax";
    int firstLocation = message.indexOf('x');
    String narrow = message.substring(firstLocation, message.length());
    String result = "";

    for (int i = 0; i < message.length(); i++) {
      if (narrow.charAt(i) == 'x') {
        result += 'x';
      } else {
        continue;
      }
    }
    
    System.out.println(result);

  }
}
