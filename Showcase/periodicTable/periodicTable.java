/**
 * This is a periodic table made in Java.
 * By putting in the name of the element, The
 * program returns the symbol and the atomic
 * number of the element.
 *
 * @author Samik Pradhan (spradhan)
 * @version 11/23/18
 */

import java.util.*;

public class periodicTable {

  public static String periodicTableSymbol[];
  public static String periodicTableNumber[];

  // method to create table
  public str createSymbolTable(int index, String value) {
    periodicTableSymbol[index] = value;
  }

  public str createNumberTable(int index, String value) {
    periodicTableNumber[index] = value;
  }

  /* method to return desired values
  public str getValue(String elem) {
    //complete
  } */

  // main method
  public static void main(String[] args) {

    test1 periodicTable = new periodicTable; // make this work

    // creating the tables
    test1.createNumberTable(1, "Hydrogen");
    test1.createNumberTable(2, "Helium");
    test1.createNumberTable(3, "Lithium");
    test1.createNumberTable(4, "Berillium");
    test1.createNumberTable(5, "Boron");
    test1.createNumberTable(6, "Carbon");

    test1.createSymbolTable(1, "H");
    test1.createSymbolTable(2, "He");
    test1.createSymbolTable(3, "Li");
    test1.createSymbolTable(4, "Be");
    test1.createSymbolTable(5, "B");
    test1.createSymbolTable(6, "C");

    Scanner in1 = new Scanner(System.in);

    // asks user for the name of the element
    System.out.println("Please type in the name of the element.");
    String elementName = in1.nextLine();

    // .printInfo(elementName);

  }

}
