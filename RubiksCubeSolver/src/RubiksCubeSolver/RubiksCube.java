package RubiksCubeSolver;

/**
 * Main Class of the project, construction of the rubiks cube and modelisation of the mouvements.
 * @author bakouze
 *
 */

public class RubiksCube {
	
	/**
	 * The table containing the value of the colors on the faces of the cube
	 */
	private String[] cube;
	
	/**
	 * Constructor :
	 * Built a solved rubiks cube
	 */
	public RubiksCube(){
		String[] c = {
				"W","W","W","W","W","W","W","W","W",
				"R","R","R","R","R","R","R","R","R",
				"B","B","B","B","B","B","B","B","B",
				"G","G","G","G","G","G","G","G","G",
				"O","O","O","O","O","O","O","O","O",
				};
		this.cube = c;
	}
	
	
}
