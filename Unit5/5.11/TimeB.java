/**
 * Objects of the Time class hold a time value for
 * a European‐style 24 hour clock.
 * The value consists of hours, minutes and seconds.
 * The range of the value is 00:00:00 (midnight)
 * to 23:59:59 (one second before midnight).
 */

public class TimeB
{
    // The values of the three parts of the time
    private int hours;
    private int minutes;
    private int seconds;

    /**
    * Creates a new Time object set to 00:00:00
    * Do not change this constructor.
    */
    public TimeB()
    {
      this.hours = 0;
      this.minutes = 0;
      this.seconds = 0;
    }

    /**
    * Constructor for objects of class Time.
    * Creates a new Time object set to h:m:s.
    * Assumes, without checking, that the parameter values are
    * within bounds.
    * For this task, you don't need to worry about invalid parameter values.
    * Do not change this constructor.
    */
    public TimeB(int h, int m, int s)
    {
      this.hours = h;
      this.minutes = m;
      this.seconds = s;
    }

    /**
    * Add one second to the current time.
    * When the seconds value reaches 60, it rolls over to zero.
    * When the seconds roll over to zero, the minutes advance.
    * So 00:00:59 rolls over to 00:01:00.
    * When the minutes reach 60, they roll over and the hours advance.
    * So 00:59:59 rolls over to 01:00:00.
    * When the hours reach 24, they roll over to zero.
    * So 23:59:59 rolls over to 00:00:00.
    */
    public void tick()
    {
      // Part a: complete the tick() method
      seconds++;
      if (seconds == 60) {
        seconds = 0;
        minutes++;
      }
      if (minutes == 60) {
        minutes = 0;
        hours++;
      }
      if (hours == 24) {
        hours = 0;
      }
    }

    /**
    * Add an offset to this Time.
    * Rolls over the hours, minutes and seconds fields when needed.
    */
    public void add(TimeB offset)
    {
      // Part b: complete the add method
      
    }

    public String toString()
    {
      return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);
    }

    /**
    * Returns a string representing the argument value, adding a leading
    * "0" if needed to make it at least two digits long.
    * Do not change this.
    */
    private String pad(int value)
    {
      String sign = "";
      if (value < 0)
      {
        sign = "-";
        value = -1 * value;
      }
      if (value < 10) {
        return sign + "0" + value;
      } else {
        return sign + value;
      }
    }






    public static void main(String[] args)
    {
      TimeB time1 = new TimeB(1,1,1);
      TimeB time2 = new TimeB(2,2,2);
      time1.add(time2);
      System.out.println("The result of (1,1,1).add(2,2,2) is " + time1 + " and should be (03:03:03)");

      time1 = new TimeB(0,0,59);
      time2 = new TimeB(0,0,1);
      time1.add(time2);
      System.out.println("The result of (0,0,59).add(0,0,1) is " + time1 + " and should be (00:01:00)");

      time1 = new TimeB(0,59,0);
      time2 = new TimeB(0,0,1);
      time1.add(time2);
      System.out.println("The result of (0,59,0).add(0,0,1) is " + time1 + " and should be (00:59:01)");

      time1 = new TimeB(0,59,59);
      time2 = new TimeB(0,0,1);
      time1.add(time2);
      System.out.println("The result of (0,59,59).add(0,0,1) is " + time1 + " and should be (01:00:00)");

      time1 = new TimeB(23,0,0);
      time2 = new TimeB(1,0,0);
      time1.add(time2);
      System.out.println("The result of (23,0,0).add(1,0,0) is " + time1 + " and should be (00:00:00)");

      time1 = new TimeB(23,59,59);
      time2 = new TimeB(23,59,59);
      time1.add(time2);
      System.out.println("The result of (23,59,59).add(23,59,59) is " + time1 + " and should be (23:59:58)");


    }
 }

















