package cse360assignment02;

/**
*
* @author Pranav Annapareddi 
* @version 3
* 
* Empty Methods with Javadoc format
*/
public class AddingMachine {
	
	/**
	 * Private integer value that holds number as program runs 
	 * Holds the total value
	 */
	private int total;
	
	/**
	 * Private string that holds memory of all functions called
	 */
	private String str = "";
	  
	/**
	 * Constructor, not used
	 */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    str = str + total;
	  }
	  
	  /**
	   * getter method
	   * @return the variable total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * @param integer value for addition
	   * @return unknown
	   */
	  public void add (int value) {
		  total = total + value;
		  str = str + " + " + value;
	  }

	  /**
	   * @param integer value for subtraction
	   * @return unknown
	   */
	  public void subtract (int value) {
		  total = total - value;
		  str = str + " - " + value;
	  }

	  /**
	   * String format
	   * @return Desired output for program
	   */
	  public String toString () {
	    return str;
	  }

	  /**
	   * Clears the machine
	   */
	  public void clear() {
		  str = "";
		  total = 0;
		  str = str + total;
	  }

}
