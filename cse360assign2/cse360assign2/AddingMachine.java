/*
 * Name: Sai Sandilya Babbepalli Venkata
 * Id: 1212688228
 * We are to make an adding machine that performs actions
 * like adding, subtracting, and converting to a string. 
 * 
 */

package cse360assign2;



		public class AddingMachine {

			private int total;
			private String History;
			
			public AddingMachine  () //keeps the tab on total and is for initialization.
			{
				total = 0;  // not needed - included for clarity
				History = "0";
			}
			public int getTotal () //returns the total value
			{
				return total;
				}
			public void add (int value) //The adding function
			{
				total = value + total;
				History = History + " + " + value;
			}
			
			public void subtract (int value) //The subtract function
			{
				total = total - value;
				History = History + " - " + value;
			}
			
			public String toString () //returns the history of operations.
			{
			 	return History;
			}
		
			public void clear() //The clear function 
			{
				total = 0;
				History = "0";
			}
		}
	