package RubiksCubeSolver;

/**
 * @author bakouze
 * Class modeling a triple piece by a triplet of string 
 */
public class Triplet {

	/**
	 * Attribute 
	 */
	private String first;
	
	/**
	 * Attribute 
	 */
	private String second;
	
	/**
	 * Attribute
	 */
	private String third;
	
	/**
	 * Constructor
	 */
	public Triplet(String a, String b, String c){
		this.first = a;
		this.second = b;
		this.third = c;
	}
	
	/**
	 * Accessor
	 * @return the first element of the triplet
	 */
	public String getFirst(){
		return this.first;
	}
	
	/**
	 * Accessor
	 * @return the second element of the triplet
	 */
	public String getSecond(){
		return this.second;
	}
	
	/**
	 * Accessor
	 * @return the third element of the triplet
	 */
	public String getThird(){
		return this.third;
	}
	
	/**
	 * Compare 2 triplet
	 * @param t, a triplet
	 * @return true if equals, false else.
	 */
	public boolean isEqual(Triplet t){
		return ((t.getFirst().equals(this.first)) && (t.getSecond().equals(this.second)) && (t.getThird().equals(this.third))) || 
				((t.getFirst().equals(this.second)) && (t.getSecond().equals(this.third)) && (t.getThird().equals(this.first))) ||
				((t.getFirst().equals(this.third)) && (t.getSecond().equals(this.first)) && (t.getThird().equals(this.second)));
	}
}
