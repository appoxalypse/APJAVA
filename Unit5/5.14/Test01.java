public class Test01 {

  public static void main(String[] args) {

    int guess = 10;
    int answer = 5;

    if (guess < answer) {
      System.out.println("Your guess is too low");
    } else if (guess == answer) {
      System.out.println("You are right!");
    } else {
      System.out.println("Your guess is too high");
    }

  }

}
