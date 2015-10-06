package RubiksCubeSolver;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Class modeling the list of the moves to solve the rubiks cube
 * @author bakouze
 *
 */
public class Solution {
	
	/**
	 * Attribute the string list of the moves
	 */
	LinkedList<String> solution;
	
	/**
	 * Constructor
	 */
	public Solution(){
		LinkedList<String> s = new LinkedList<String>();
		this.solution = s;
	}

	/**
	 * Method to add a "W" to the list
	 */
	public void addW(){
		this.solution.add("W");
	}
	
	/**
	 * Method to add a "R" to the list
	 */
	public void addR(){
		this.solution.add("R");
	}
	
	/**
	 * Method to add a "B" to the list
	 */
	public void addB(){
		this.solution.add("B");
	}
	
	/**
	 * Method to add a "G" to the list
	 */
	public void addG(){
		this.solution.add("G");
	}
	
	/**
	 * Method to add a "O" to the list
	 */
	public void addO(){
		this.solution.add("O");
	}
	
	/**
	 * Method to add a "Y" to the list
	 */
	public void addY(){
		this.solution.add("Y");
	}
	
	/**
	 * Method
	 * @return the string of the list solution
	 */
	public String toString(){
		Iterator<String> iter = this.solution.iterator();
		String s = new String();
		while(iter.hasNext()){
			String temp = iter.next();
			s+=temp + "; ";
		}
		return s;
	}
}
