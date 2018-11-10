public class Test05 {

  public static void main(String[] args) {

    String favFood = "kale";
    boolean favPizza = favFood.equals("pizza");
    boolean favWings = favFood.equals("wings");

    if (favPizza || favWings) {
      System.out.println("You fav is junk food");
    } else {
      System.out.println("You fav is not junk");
    }

  }

}
