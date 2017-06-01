//package edu.gatech.oad.antlab.person;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		char[] charArr = input.toCharArray();
		Random rando = new Random();
		for (int i = 0; i < charArr.length - 1; i++) {
			int j = rando.nextInt(charArr.length - i) + i;
			char x = charArr[j];
			charArr[j] = charArr[i];
			charArr[i] = x;
		}
		
	  return (new String(charArr));
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + " " + calc(input);
	}
	public static void main(String[] args) {
		Person2 Rob=new Person2("Robert");
		for(int i = Integer.parseInt(args[0]); i > 0; i--){
			System.out.println(Rob.toString("Robert"));
		}
	}
}
