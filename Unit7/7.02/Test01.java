/**
 * Example from Runestone
 */

public class Test01
{
   public static void main(String[] args)
   {
     String message = "Have a 1ong and happy 1ife";
     int index = 0;

     // while more 1's in the message
     while (message.indexOf("1") >= 0)
     {
       index = message.indexOf("1");
       message = message.substring(0,index) + "l" + message.substring(index+1);
     }

     System.out.println(message);
   }
}
