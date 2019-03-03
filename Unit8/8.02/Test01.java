public class Test01 {
  public static double getAvg (int[] values) {
    double total = 0;
    for (int val : values) {
      total += val;
    }
    return total/values.length;
  }

  public static void main(String[] args) {
    int[] values = {2, 6, 7, 12, 5};
    System.out.println(getAvg(values));
  }
}
