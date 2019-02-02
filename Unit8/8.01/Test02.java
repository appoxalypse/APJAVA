public class Test02 {
  public static void main(String[] args) {

    int[ ] highScores = null;
    String[ ] names = null;

    highScores = new int[5];
    names = new String[5];

    // print the initial values at index 0
    System.out.println(highScores[0]);
    System.out.println(names[0]);

    highScores[0] =  99;
    highScores[1] =  98;
    highScores[2] =  98;
    highScores[3] =  88;
    highScores[4] =  68;
    System.out.println(highScores[0]);

    names[0] = "Jamal";
    names[1] = "Emily";
    names[2] = "Destiny";
    names[3] = "Mateo";
    names[4] = "Sofia";
    System.out.println(names[0]);
    
  }
}
