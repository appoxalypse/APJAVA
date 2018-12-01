public class Test02 {

  public static void main(String[] args) {

    int var1 = 3;
    int var2 = 2;

    while ((var2 != 0) && ((var1 / var2) >= 0)) {

      System.out.println(var1);
      System.out.println(var2);

      var1++;
      var2--;

    }

    System.out.println(var1);
    System.out.println(var2);

  }

}
