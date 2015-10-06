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
	private void move(int nb, String color){
		this.cube.move(nb, color, this.solution);
	}
	
	/**
	 * Method
	 * @return the strings of the cube and the solution
	 */
	public String toString(){
		return this.cube.toString() + "\n" + this.solution.toString();
	}

	// First step : the white cross
	
	/**
	 * Method which places the red and white part of the white cross
	 */
	private void step1Red(){
		switch(this.cube.scanDouble("R", "W")){
		case 0:
			break;
		case 1:
			this.move(1, "W");
			break;
		case 2:
			this.move(3, "W");
			break;
		case 3:
			this.move(2, "W");
			break;
		case 4:
			this.move(3, "R");
			break;
		case 5:
			this.move(1, "R");
			break;
		case 6:
			this.move(2, "R");
			break;
		case 7:
			this.move(1, "O");
			this.move(2, "W");
			break;
		case 8:
			this.move(2, "B");
			this.move(1, "W");
			break;
		case 9:
			this.move(1, "G");
			this.move(3, "W");
			break;
		case 10:
			this.move(2, "G");
			this.move(3, "W");
			break;
		case 11:
			this.move(2, "O");
			this.move(2, "W");
			break;
		default:
			System.out.println("Corrupted Data doubleTab");
		}
	}
	
	/**
	 * Method which places the blue and white part of the white cross
	 */
	private void step1Blue(){
		switch(this.cube.scanDouble("B", "W")){
		case 0:
			System.out.println("Error in step 1");
			break;
		case 1:
			break;
		case 2:
			this.move(1, "R");
			this.move(2, "W");
			this.move(3, "R");
			break;
		case 3:
			this.move(1, "R");
			this.move(1, "W");
			this.move(3, "R");
			break;
		case 4:
			this.move(1, "B");
			break;
		case 5:
			this.move(1, "R");
			this.move(3, "W");
			this.move(3, "R");
			break;
		case 6:
			this.move(1, "Y");
			this.move(2, "B");
			break;
		case 7:
			this.move(3, "B");
			break;
		case 8:
			this.move(2, "B");
			break;
		case 9:
			this.move(2, "O");
			this.move(3, "B");
			break;
		case 10:
			this.move(2, "Y");
			this.move(2, "B");
			break;
		case 11:
			this.move(3, "Y");
			this.move(2, "B");
			break;
		default:
			System.out.println("Corrupted Data doubleTab");
		}
	}
	
	/**
	 * Method which places the green and white part of the white cross
	 */
	private void step1Green(){
		switch(this.cube.scanDouble("G", "W")){
		case 0:
			System.out.println("Error in step 1");
			break;
		case 1:
			System.out.println("Error in step 1");
			break;
		case 2:
			break;
		case 3:
			this.move(1, "O");
			this.move(1, "G");
			break;
		case 4:
			this.move(3, "B");
			this.move(2, "Y");
			this.move(2, "G");
			this.move(1, "B");
			break;
		case 5:
			this.move(3, "G");
			break;
		case 6:
			this.move(3, "Y");
			this.move(2, "G");
			break;
		case 7:
			this.move(2, "O");
			this.move(1, "G");
			break;
		case 8:
			this.move(2, "Y");
			this.move(2, "G");
			break;
		case 9:
			this.move(1, "G");
			break;
		case 10:
			this.move(2, "G");
			break;
		case 11:
			this.move(1, "Y");
			this.move(2, "G");
			break;
		default:
			System.out.println("Corrupted Data doubleTab");
		}
	}
	
	/**
	 * Method which places the orange and white part of the white cross
	 */
	private void step1Orange(){
		switch(this.cube.scanDouble("O", "W")){
		case 0:
			System.out.println("Error in step 1");
			break;
		case 1:
			System.out.println("Error in step 1");
			break;
		case 2:
			System.out.println("Error in step 1");
			break;
		case 3:
			break;
		case 4:
			this.move(3, "B");
			this.move(1, "Y");
			this.move(2, "O");
			this.move(1, "B");
			break;
		case 5:
			this.move(1, "G");
			this.move(3, "Y");
			this.move(2, "O");
			this.move(2, "G");
			break;
		case 6:
			this.move(2, "Y");
			this.move(2, "O");
			break;
		case 7:
			this.move(1, "0");
			break;
		case 8:
			this.move(1, "Y");
			this.move(2, "O");
			break;
		case 9:
			this.move(3, "O");
			break;
		case 10:
			this.move(3, "Y");
			this.move(2, "0");
			break;
		case 11:
			this.move(2, "O");
			break;
		default:
			System.out.println("Corrupted Data doubleTab");
		}
	}
	
	/**
	 * Method which turns the parts of the white cross if in wrong orientation
	 */
	private void step1Replace(){
		if(this.cube.getElement(1)=="R"){
			this.move(1, "R");
			this.move(3, "W");
			this.move(1, "B");
			this.move(1, "W");
		}
		if(this.cube.getElement(3)=="B"){
			this.move(1, "B");
			this.move(3, "W");
			this.move(1, "O");
			this.move(1, "W");
		}
		if(this.cube.getElement(5)=="G"){
			this.move(1, "G");
			this.move(3, "W");
			this.move(1, "R");
			this.move(1, "W");
		}
		if(this.cube.getElement(7)=="O"){
			this.move(1, "O");
			this.move(3, "W");
			this.move(1, "G");
			this.move(1, "W");
		}
	}
	
	/**
	 * Method which solves step 1
	 */
	public void step1(){
		this.step1Red();
		this.step1Blue();
		this.step1Green();
		this.step1Orange();
		this.step1Replace();
	}
	
	//Step 2 : the whole white face
	
	/**
	 * the key move for the corner positioning
	 * @param a
	 * @param b
	 */
	private void cornerPositionAux(String a,String b){
		this.move(3, a);
		this.move(3, b);
		this.move(1, a);
		this.move(1, b);
	}
	
	/**
	 * Method to represent the move we will use in this step.
	 * @param a
	 */
	private void cornerPositionW(String a){
		this.cornerPositionAux(a, "Y");
	}
	
	/**
	 * Method used to exit a corner
	 * @param a
	 * @param b
	 */
	private void cornerExit(String a, String b){
		this.move(3, a);
		this.move(1, b);
		this.move(1, a);
	}
	
	/**
	 * Method to exit corner nb
	 * @param nb
	 */
	private void cornerExitNb(int nb){
		switch(nb){
		case 0:
			this.cornerExit("B", "Y");
			break;
		case 1:
			this.cornerExit("R", "Y");
			break;
		case 2:
			this.cornerExit("O", "Y");
			break;
		case 3:
			this.cornerExit("G", "Y");
			break;
		default:
			System.out.println("Error cornerExit Step2");
		}
	}
	
	/**
	 * Method to place a corner knowing the property : "6*sixTime = Id".
	 * @param a
	 * @param b
	 * @param c
	 * @param place
	 * @param nb
	 */
	private void sixTime(String a, String b, String c, int place, int nb){
		int temp = 0;
		Triplet[] tTab = this.cube.tripletTab();
		Triplet t = new Triplet(a,b,c);
		if(nb==0){
			while((!tTab[place].isStrictlyEqual(t)) && (temp<6)){
				this.cornerPositionW(c);
				temp++;
				tTab = this.cube.tripletTab();
			}
		}
		else{
			while((!tTab[place].isStrictlyEqual(t))&&(temp<6)){
				this.cornerPositionW(b);
				temp++;
				tTab = this.cube.tripletTab();
			}
		}
	}
	
	/**
	 * method using sixTime to actually place the corner we want to place
	 * @param a
	 * @param b
	 * @param c
	 * @param place
	 * @param nb
	 */
	private void cornerPlacing(String a, String b, String c, int place, int nb){
		Triplet[] tTab = this.cube.tripletTab();
		Triplet t = new Triplet(a,b,c);
		int test = 0;
		while(!tTab[place].isEqual(t) && test<50){
			test++;
			if(test==50){
				System.out.println("Error infinite cycle");
			}
			int position = this.cube.scanTriple(a, b, c);
			if((position == place) || (position == place +4)){
				this.sixTime(a, b, c, place, nb);
			}
			else if(position<4){
				this.cornerExitNb(position);
			}
			else{
				this.move(1, "Y");
			}
			tTab = this.cube.tripletTab();
		}
	}
	
	/**
	 * Method which solves step 2.
	 */
	public void step2(){
		this.cornerPlacing("W", "R", "B", 0, 0);
		this.cornerPlacing("W", "R", "G", 1, 1);
		this.cornerPlacing("W", "B", "O", 2, 0);
		this.cornerPlacing("W", "G", "O", 3, 1);
	}
}
