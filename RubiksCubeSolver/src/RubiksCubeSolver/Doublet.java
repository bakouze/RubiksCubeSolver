package RubiksCubeSolver;

/**
 * Class modeling a double piece by a doublet of string 
 * @author bakouze
 *
 */
public class Doublet {
	
	/**
	 * Attribute 
	 */
	private String first;
	
	/**
	 * Attribute 
	 */
	private String second;
	
	/**
	 * Constructor
	 */
	public Doublet(String a, String b){
		this.first = a;
		this.second = b;
	}
	
	/**
	 * Accessor
	 * @return the first element of the doublet
	 */
	public String getFirst(){
		return this.first;
	}
	
	/**
	 * Accessor
	 * @return the second element of the doublet
	 */
	public String getSecond(){
		return this.second;
	}
	
	/**
	 * Compare 2 doublets
	 * @param d, a doublet
	 * @return true if equals, false else.
	 */
	public boolean compare(Doublet d){
		return ((d.getFirst().equals(this.first)) && (d.getSecond().equals(this.second))) || ((d.getFirst().equals(this.second)) && (d.getSecond().equals(this.first)));
	}
}
