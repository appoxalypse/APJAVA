public class Magpie2
{
   public String getGreeting()
   {
     return "Hello, let's talk.";
   }

   public String getResponse(String statement)
   {
     String response = "";
     if (statement.indexOf(" no ") >= 0) {
       response = "Why so negative?";
     } else if (statement.indexOf("mother") >= 0
                 || statement.indexOf("father") >= 0
                 || statement.indexOf("sister") >= 0
                 || statement.indexOf("brother") >= 0) {
       response = "Tell me more about your family.";
     } else {
       response = getRandomResponse();
     }
     return response;
   }

   private String getRandomResponse()
   {
     final int NUMBER_OF_RESPONSES = 5;
     double r = Math.random();
     int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
     String response = "";

     if (whichResponse == 0) {
       response = "Interesting, tell me more.";
     } else if (whichResponse == 1) {
       response = "Hmmm.";
     } else if (whichResponse == 2) {
       response = "Do you really think so?";
     } else if (whichResponse == 3) {
       response = "You don't say.";
     } else {
       response = "I think the weather is quite nice today.";
     }
     return response;
   }

   public static void main(String[] args)
   {
     Magpie2 maggie = new Magpie2();

     System.out.println(maggie.getGreeting());
     System.out.println(maggie.getResponse("My mother and I talked last night."));
     System.out.println(maggie.getResponse("I said no!"));
     System.out.println(maggie.getResponse("The weather is nice."));
     System.out.println(maggie.getResponse("Do you know my brother?"));
   }
}
