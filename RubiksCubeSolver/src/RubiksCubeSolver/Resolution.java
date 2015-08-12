package RubiksCubeSolver;

public class Resolution {
	/**
	 * The list of the moves to solve the cube
	 */
	private Solution solution;
	
	/**
	 * The cube we want to solve
	 */
	private RubiksCube cube;
	
	/**
	 * Constructor
	 */
	public Resolution(){
		this.solution = new Solution();
		this.cube = new RubiksCube();
	}
	
	/**
	 * Constructor
	 * @param tab
	 */
	public Resolution(String[] tab){
		this.solution = new Solution();
		this.cube = new RubiksCube(tab);
	}
	
	/**
	 * Method to make a move on the cube clockwise
	 * @param nb
	 * @param color
	 */
	public void mouv(int nb, String color){
		this.cube.move(nb, color, this.solution);
	}

}
