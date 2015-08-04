package RubiksCubeSolver;

/**
 * Main Class of the project, construction of the rubiks cube and modelisation of the movements.
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
				"Y","Y","Y","Y","Y","Y","Y","Y","Y",
		};
		this.cube = c;
	}

	/**
	 * Constructor from a table
	 */
	public RubiksCube(String[] c){
		if(c.length == 54){
			for(int i =0;i<54;i++){
				this.cube[i] = c[i];
			}
		}
	}

	//definition of the movements :

	//White :

	/**
	 * movements of the corners of the white face
	 */
	private void coins_fW(){
		this.cube[4] = this.cube[0]; 
		this.cube[0] = this.cube[6];
		this.cube[6] = this.cube[8];
		this.cube[8] = this.cube[2];
		this.cube[2] = this.cube[4];
	}

	/**
	 * movements of the segments of the white face	
	 */
	private void arretes_fW(){
		this.cube[4] = this.cube[1]; 
		this.cube[1] = this.cube[3];
		this.cube[3] = this.cube[7];
		this.cube[7] = this.cube[5];
		this.cube[5] = this.cube[4];
	}

	/**
	 * movements of the first external corners of the white face
	 */
	private void coins_a1W(){
		this.cube[4] = this.cube[15]; 
		this.cube[15] = this.cube[26];
		this.cube[26] = this.cube[38];
		this.cube[38] = this.cube[27];
		this.cube[27] = this.cube[4];
	}

	/**
	 * movements of the second external corners of the white face
	 */
	private void coins_a2W(){
		this.cube[4] = this.cube[17]; 
		this.cube[17] = this.cube[20];
		this.cube[20] = this.cube[36];
		this.cube[36] = this.cube[33];
		this.cube[33] = this.cube[4];
	}

	/**
	 * movements of the external segments of the white face
	 */
	private void aretes_aW(){
		this.cube[4] = this.cube[16]; 
		this.cube[16] = this.cube[23];
		this.cube[23] = this.cube[37];
		this.cube[37] = this.cube[30];
		this.cube[30] = this.cube[4];
	}

	/**
	 * the whole movements of the white face
	 */
	public void white(){
		this.arretes_fW();
		this.coins_fW();
		this.coins_a1W();
		this.coins_a2W();
		this.aretes_aW();
		this.cube[4] = "W";
	}

	//Red :

	/**
	 * movements of the corners of the red face
	 */
	private void coins_fR(){
		this.cube[13] = this.cube[9]; 
		this.cube[9] = this.cube[15];
		this.cube[15] = this.cube[17];
		this.cube[17] = this.cube[11];
		this.cube[11] = this.cube[13];
	}

	/**
	 * movements of the segments of the red face	
	 */
	private void arretes_fR(){
		this.cube[13] = this.cube[10]; 
		this.cube[10] = this.cube[12];
		this.cube[12] = this.cube[16];
		this.cube[16] = this.cube[14];
		this.cube[14] = this.cube[13];
	}

	/**
	 * movements of the first external corners of the red face
	 */
	private void coins_a1R(){
		this.cube[13] = this.cube[51]; 
		this.cube[51] = this.cube[20];
		this.cube[20] = this.cube[2];
		this.cube[2] = this.cube[29];
		this.cube[29] = this.cube[13];
	}

	/**
	 * movements of the second external corners of the red face
	 */
	private void coins_a2R(){
		this.cube[13] = this.cube[53]; 
		this.cube[53] = this.cube[18];
		this.cube[18] = this.cube[0];
		this.cube[0] = this.cube[27];
		this.cube[27] = this.cube[13];
	}

	/**
	 * movements of the external segments of the red face
	 */
	private void aretes_aR(){
		this.cube[13] = this.cube[52]; 
		this.cube[52] = this.cube[19];
		this.cube[19] = this.cube[1];
		this.cube[1] = this.cube[28];
		this.cube[28] = this.cube[13];
	}

	/**
	 * the whole movements of the red face
	 */
	public void red(){
		this.arretes_fR();
		this.coins_fR();
		this.coins_a1R();
		this.coins_a2R();
		this.aretes_aR();
		this.cube[13] = "R";
	}

	//Blue :

	/**
	 * movements of the corners of the blue face
	 */
	private void coins_fB(){
		this.cube[22] = this.cube[18]; 
		this.cube[18] = this.cube[24];
		this.cube[24] = this.cube[26];
		this.cube[26] = this.cube[20];
		this.cube[20] = this.cube[22];
	}

	/**
	 * movements of the segments of the blue face	
	 */
	private void arretes_fB(){
		this.cube[22] = this.cube[19]; 
		this.cube[19] = this.cube[21];
		this.cube[21] = this.cube[25];
		this.cube[25] = this.cube[23];
		this.cube[23] = this.cube[22];
	}

	/**
	 * movements of the first external corners of the blue face
	 */
	private void coins_a1B(){
		this.cube[22] = this.cube[9]; 
		this.cube[9] = this.cube[45];
		this.cube[45] = this.cube[36];
		this.cube[36] = this.cube[0];
		this.cube[0] = this.cube[22];
	}

	/**
	 * movements of the second external corners of the blue face
	 */
	private void coins_a2B(){
		this.cube[22] = this.cube[15]; 
		this.cube[15] = this.cube[51];
		this.cube[51] = this.cube[42];
		this.cube[42] = this.cube[6];
		this.cube[6] = this.cube[22];
	}

	/**
	 * movements of the external segments of the blue face
	 */
	private void aretes_aB(){
		this.cube[22] = this.cube[12]; 
		this.cube[12] = this.cube[48];
		this.cube[48] = this.cube[39];
		this.cube[39] = this.cube[3];
		this.cube[3] = this.cube[22];
	}

	/**
	 * the whole movements of the blue face
	 */
	public void blue(){
		this.arretes_fB();
		this.coins_fB();
		this.coins_a1B();
		this.coins_a2B();
		this.aretes_aB();
		this.cube[22] = "B";
	}

	//Green :

	/**
	 * movements of the corners of the green face
	 */
	private void coins_fG(){
		this.cube[31] = this.cube[27]; 
		this.cube[27] = this.cube[33];
		this.cube[33] = this.cube[35];
		this.cube[35] = this.cube[29];
		this.cube[29] = this.cube[31];
	}

	/**
	 * movements of the segments of the green face	
	 */
	private void arretes_fG(){
		this.cube[31] = this.cube[28]; 
		this.cube[28] = this.cube[30];
		this.cube[30] = this.cube[34];
		this.cube[34] = this.cube[32];
		this.cube[32] = this.cube[31];
	}

	/**
	 * movements of the first external corners of the green face
	 */
	private void coins_a1G(){
		this.cube[31] = this.cube[17]; 
		this.cube[17] = this.cube[8];
		this.cube[8] = this.cube[44];
		this.cube[44] = this.cube[53];
		this.cube[53] = this.cube[31];
	}

	/**
	 * movements of the second external corners of the green face
	 */
	private void coins_a2G(){
		this.cube[31] = this.cube[11]; 
		this.cube[11] = this.cube[2];
		this.cube[2] = this.cube[38];
		this.cube[38] = this.cube[47];
		this.cube[47] = this.cube[31];
	}

	/**
	 * movements of the external segments of the green face
	 */
	private void aretes_aG(){
		this.cube[31] = this.cube[14]; 
		this.cube[14] = this.cube[5];
		this.cube[5] = this.cube[41];
		this.cube[41] = this.cube[50];
		this.cube[50] = this.cube[31];
	}

	/**
	 * the whole movements of the green face
	 */
	public void green(){
		this.arretes_fG();
		this.coins_fG();
		this.coins_a1G();
		this.coins_a2G();
		this.aretes_aG();
		this.cube[31] = "G";
	}

	//Orange :

	/**
	 * movements of the corners of the orange face
	 */
	private void coins_fO(){
		this.cube[40] = this.cube[36]; 
		this.cube[36] = this.cube[42];
		this.cube[42] = this.cube[44];
		this.cube[44] = this.cube[38];
		this.cube[38] = this.cube[40];
	}

	/**
	 * movements of the segments of the orange face	
	 */
	private void arretes_fO(){
		this.cube[40] = this.cube[37]; 
		this.cube[37] = this.cube[39];
		this.cube[39] = this.cube[43];
		this.cube[43] = this.cube[41];
		this.cube[41] = this.cube[40];
	}

	/**
	 * movements of the first external corners of the orange face
	 */
	private void coins_a1O(){
		this.cube[40] = this.cube[6]; 
		this.cube[6] = this.cube[24];
		this.cube[24] = this.cube[47];
		this.cube[47] = this.cube[33];
		this.cube[33] = this.cube[40];
	}

	/**
	 * movements of the second external corners of the orange face
	 */
	private void coins_a2O(){
		this.cube[40] = this.cube[8]; 
		this.cube[8] = this.cube[26];
		this.cube[26] = this.cube[45];
		this.cube[45] = this.cube[35];
		this.cube[35] = this.cube[40];
	}

	/**
	 * movements of the external segments of the orange face
	 */
	private void aretes_aO(){
		this.cube[40] = this.cube[7]; 
		this.cube[7] = this.cube[25];
		this.cube[25] = this.cube[46];
		this.cube[46] = this.cube[34];
		this.cube[34] = this.cube[40];
	}

	/**
	 * the whole movements of the orange face
	 */
	public void orange(){
		this.arretes_fO();
		this.coins_fO();
		this.coins_a1O();
		this.coins_a2O();
		this.aretes_aO();
		this.cube[40] = "O";
	}

	//Yellow :

	/**
	 * movements of the corners of the yellow face
	 */
	private void coins_fY(){
		this.cube[49] = this.cube[45]; 
		this.cube[45] = this.cube[51];
		this.cube[51] = this.cube[53];
		this.cube[53] = this.cube[47];
		this.cube[47] = this.cube[49];
	}

	/**
	 * movements of the segments of the yellow face	
	 */
	private void arretes_fY(){
		this.cube[49] = this.cube[46]; 
		this.cube[46] = this.cube[48];
		this.cube[48] = this.cube[52];
		this.cube[52] = this.cube[50];
		this.cube[50] = this.cube[49];
	}

	/**
	 * movements of the first external corners of the yellow face
	 */
	private void coins_a1Y(){
		this.cube[49] = this.cube[42]; 
		this.cube[42] = this.cube[18];
		this.cube[18] = this.cube[11];
		this.cube[11] = this.cube[35];
		this.cube[35] = this.cube[49];
	}

	/**
	 * movements of the second external corners of the yellow face
	 */
	private void coins_a2Y(){
		this.cube[49] = this.cube[44]; 
		this.cube[44] = this.cube[24];
		this.cube[24] = this.cube[9];
		this.cube[9] = this.cube[29];
		this.cube[29] = this.cube[49];
	}

	/**
	 * movements of the external segments of the yellow face
	 */
	private void aretes_aY(){
		this.cube[49] = this.cube[43]; 
		this.cube[43] = this.cube[21];
		this.cube[21] = this.cube[10];
		this.cube[10] = this.cube[32];
		this.cube[32] = this.cube[49];
	}

	/**
	 * the whole movements of the yellow face
	 */
	public void yellow(){
		this.arretes_fY();
		this.coins_fY();
		this.coins_a1Y();
		this.coins_a2Y();
		this.aretes_aY();
		this.cube[49] = "Y";
	}
}
