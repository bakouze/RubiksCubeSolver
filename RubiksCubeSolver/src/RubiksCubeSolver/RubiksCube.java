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
	 * The list of the moves to solve the cube
	 */
	private Solution solution;

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
		this.solution = new Solution();
	}

	/**
	 * Constructor from a table
	 */
	public RubiksCube(String[] c){
		if(c.length == 54){
			String[] tab = new String[c.length];
			for(int i=0; i<c.length;i++){
				tab[i] = c[i];
			}
			this.cube = tab;
		}
		else{
			System.out.println("Wrong input table size : " + c.length);
		}
		this.solution = new Solution();
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
	private void white(){
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
	private void red(){
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
	private void blue(){
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
	private void green(){
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
	private void orange(){
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
	private void yellow(){
		this.arretes_fY();
		this.coins_fY();
		this.coins_a1Y();
		this.coins_a2Y();
		this.aretes_aY();
		this.cube[49] = "Y";
	}

	/**
	 * Turn the face "color" of the cube nb times clockwise.
	 * @param nb
	 * @param color
	 */
	public void move(int nb, String color){
		for(int i=0;i<nb;i++){
			switch(color){
			case "W":
				this.white();
				this.solution.addW();
				break;
			case "R":
				this.red();
				this.solution.addR();
				break;
			case "B":
				this.blue();
				this.solution.addB();
				break;
			case "G":
				this.green();
				this.solution.addG();
				break;
			case "O":
				this.orange();
				this.solution.addO();
				break;
			case "Y":
				this.yellow();
				this.solution.addY();
				break;
			default:
				System.out.println("Corrupted Data");
			}
		}
	}
	
	/**
	 * Return a String showing the current configuration of the cube
	 */
	public String toString(){
		String s = new String();
		for(int i=0; i<this.cube.length;i++){
			s += cube[i] + ", ";
		}
		return s;
	}
	
	/**
	 * Method 
	 * @return the table of double pieces
	 */
	public Doublet[] doubleTab(){
		Doublet[] tab = new Doublet[12];
		tab[0] = new Doublet(this.cube[1],this.cube[16]);
		tab[1] = new Doublet(this.cube[3],this.cube[23]);
		tab[2] = new Doublet(this.cube[5],this.cube[30]); 
		tab[3] = new Doublet(this.cube[7],this.cube[37]);
		tab[4] = new Doublet(this.cube[12],this.cube[19]);
		tab[5] = new Doublet(this.cube[14],this.cube[28]);
		tab[6] = new Doublet(this.cube[10],this.cube[52]);
		tab[7] = new Doublet(this.cube[25],this.cube[39]);
		tab[8] = new Doublet(this.cube[21],this.cube[48]);
		tab[9] = new Doublet(this.cube[34],this.cube[41]);
		tab[10] = new Doublet(this.cube[32],this.cube[50]);
		tab[11] = new Doublet(this.cube[43],this.cube[46]);
		return tab;		
	}
	
	/**
	 * Method which scan the doubleTab for the doublet (a,b)
	 * @param a
	 * @param b
	 * @return the position of (a,b)
	 */
	public int scanDouble(String a, String b){
		int position = 0;
		Doublet d = new Doublet(a,b);
		Doublet[] dTab = this.doubleTab();
		while(dTab[position].compare(d)){
			position++;
		}
		return position;
	}
}
