public class Test03 {

   public static boolean isInOrder(String check) {

       int pos = 0;

       while (pos < check.length() + 1) {

          if (check.substring(pos, pos + 1).compareTo(check.substring(pos + 1, pos + 2)) < 0) {
            return true;
          }

          pos++;

       }

       return false;
   }

   public static void main(String[] args) {

      System.out.println(isInOrder("abca"));
      System.out.println(isInOrder("abc"));

   }
}
