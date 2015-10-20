package RubiksCubeSolver;

import java.util.Arrays;

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

	//Step 3 : Second crown.

	/**
	 * The manchot macro, a classic move which allows the solve of step 3
	 * @param a
	 * @param b
	 */
	private void manchot(String a, String b){
		String c = "Y";
		Orientation ori = new Orientation(a,b);
		if(!ori.getOrientation()){
			this.move(1, c);
			this.move(1, b);
			this.move(3, c);
			this.move(3, b);
			this.move(3, c);
			this.move(3, a);
			this.move(1, c);
			this.move(1, a);
		}
		else{
			this.move(3, c);
			this.move(3, b);
			this.move(1, c);
			this.move(1, b);
			this.move(1, c);
			this.move(1, a);
			this.move(3, c);
			this.move(3, a);
		}
	}

	/**
	 * a maccro which give the position of the center
	 * @return i the position of the center
	 */
	private int searchCenter(){
		int i = 0;
		while(i<=3){
			Doublet[] tab = this.cube.doubleTabExtraction();
			if(tab[i].getFirst()=="Y"||tab[i].getSecond()=="Y"){
				i++;
			}
			else if(i==0&&tab[i].getFirst()=="R"&&tab[i].getSecond()=="B"){
				i++;
			}
			else if(i==0){
				i=4;
			}
			else if(i==1&&tab[i].getFirst()=="R"&&tab[i].getSecond()=="G"){
				i++;
			}
			else if(i==1){
				i=5;
			}
			else if(i==2&&tab[i].getFirst()=="B"&&tab[i].getSecond()=="O"){
				i++;
			}
			else if(i==2){
				i=7;
			}
			else if(i==3&&tab[i].getFirst()=="G"&&tab[i].getSecond()=="O"){
				i++;
			}
			else if(i==3){
				i=9;
			}
			else{
				System.out.println("error step 3 : searchCenter");
			}
		}
		return i;
	}

	/**
	 * function which exit a center if missplaced
	 * @param n
	 */
	private void exitCenter(int n){
		switch(n){
		case 4:
			this.manchot("R", "B");
			break;
		case 5:
			this.manchot("R", "G");
			break;
		case 7:
			this.manchot("B", "O");
			break;
		case 9:
			this.manchot("G", "O");
			break;
		default: 
			System.out.println("Error step 3 : exitCenter. " + n);
		}
	}

	/**
	 * the orange boolean used in next functions
	 * @return boolean
	 */
	private boolean orange(){
		return this.cube.getElement(43)=="O"&&this.cube.getElement(46)!="Y";
	}

	/**
	 * the blue boolean used in next functions
	 * @return boolean
	 */
	private boolean blue(){
		return this.cube.getElement(21)=="B"&&this.cube.getElement(48)!="Y";
	}

	/**
	 * the green boolean used in next functions
	 * @return boolean
	 */
	private boolean green(){
		return this.cube.getElement(32)=="G"&&this.cube.getElement(50)!="Y";
	}

	/**
	 * the red boolean used in next functions
	 * @return boolean
	 */
	private boolean red(){
		return this.cube.getElement(10)=="R"&&this.cube.getElement(52)!="Y";
	}

	/**
	 * function which rotate the yellow crown if all pieces are missplaced
	 */
	private void yellowRotation(){
		int nbMove = 0;
		while(!this.red()&&!this.green()&&!this.blue()&&this.orange()&&nbMove<=3){
			this.move(1, "Y");
			nbMove++;
		}
	}

	/**
	 * function using the manchot function to solve step 3
	 */
	private void placeManchot(){
		if(this.red()){
			this.manchot(this.cube.getElement(10), this.cube.getElement(52));
		}
		else if(this.green()){
			this.manchot(this.cube.getElement(32), this.cube.getElement(50));
		}
		else if(this.blue()){
			this.manchot(this.cube.getElement(21), this.cube.getElement(48));
		}
		else if(this.orange()){
			this.manchot(this.cube.getElement(43), this.cube.getElement(46));
		}
		else{
			this.exitCenter(this.searchCenter());
		}
	}

	/**
	 * the rg boolean used in next functions
	 * @return boolean
	 */
	private boolean rg(){
		return this.cube.getElement(14)=="R"&&this.cube.getElement(28)=="G";
	}

	/**
	 * the go boolean used in next functions
	 * @return boolean
	 */
	private boolean go(){
		return this.cube.getElement(34)=="G"&&this.cube.getElement(41)=="O";
	}

	/**
	 * the ob boolean used in next functions
	 * @return boolean
	 */
	private boolean ob(){
		return this.cube.getElement(39)=="O"&&this.cube.getElement(25)=="B";
	}

	/**
	 * the br boolean used in next functions
	 * @return boolean
	 */
	private boolean br(){
		return this.cube.getElement(19)=="B"&&this.cube.getElement(12)=="R";
	}

	/**
	 * function which solves step 3
	 */
	public void step3(){
		while(!(this.rg()&&this.go()&&this.ob()&&this.br())){
			this.yellowRotation();
			this.placeManchot();
		}
	}

	//Step 4 : the yellow cross
	/**
	 * Method modeling the move used to solve the yellow cross
	 * @param a
	 * @param b
	 */
	private void yellowCross(String a, String b){
		String c = "Y";
		this.move(3, a);
		this.move(3, c);
		this.move(3, b);
		this.move(1, c);
		this.move(1, b);
		this.move(1, a);
	}
	
	/**
	 * First method used to solve step 4
	 */
	private void step41(){
		while(this.cube.getElement(52)!="Y"||this.cube.getElement(48)!="Y"||this.cube.getElement(46)!="Y"||this.cube.getElement(50)!="Y"){
			if(this.cube.getElement(52)=="Y"&&this.cube.getElement(48)=="Y"){
				this.yellowCross("O", "G");
			}
			else if(this.cube.getElement(48)=="Y"&&this.cube.getElement(46)=="Y"){
				this.yellowCross("G", "R");
			}
			else if(this.cube.getElement(46)=="Y"&&this.cube.getElement(50)=="Y"){
				this.yellowCross("R", "B");
			}
			else if(this.cube.getElement(52)=="Y"&&this.cube.getElement(50)=="Y"){
				this.yellowCross("B", "O");
			}
			else{
				this.yellowCross("O", "G");
			}
		}
	}
	
	/**
	 * Method 
	 * @return 1 if "O"
	 */
	private int testOrange(){
		int i = 0;
		if(this.cube.getElement(43)=="O"){
			i=1;
		}
		return i;
	}
	
	/**
	 * Method 
	 * @return 1 if "B"
	 */
	private int testBlue(){
		int i = 0;
		if(this.cube.getElement(21)=="B"){
			i=1;
		}
		return i;
	}
	
	/**
	 * Method 
	 * @return 1 if "R"
	 */
	private int testRed(){
		int i = 0;
		if(this.cube.getElement(10)=="R"){
			i=1;
		}
		return i;
	}
	
	/**
	 * Method 
	 * @return 1 if "G"
	 */
	private int testGreen(){
		int i = 0;
		if(this.cube.getElement(32)=="G"){
			i=1;
		}
		return i;
	}
	
	/**
	 * Method
	 * @return the sum test used in step42
	 */
	private int sumTest(){
		return this.testBlue()+this.testGreen()+this.testOrange()+this.testRed();
	}
	
	/**
	 * Second method used to solve step 4
	 */
	private void step42(){
		int count = 0;
		while(this.sumTest()!=1){
			if(count<=3){
				this.move(1, "Y");
				count++;
			}
			else{
				this.move(1, "R");
				this.move(2, "Y");
				this.move(3, "R");
				this.move(3, "Y");
				this.move(1, "R");
				this.move(3, "Y");
				this.move(3, "R");
				count = 0;
			}
		}
	}
	
	/**
	 * method used in step 4
	 */
	private void chair(String a){
		String b = "Y";
		while(this.cube.getElement(10)!="R"||this.cube.getElement(21)!="B"||this.cube.getElement(32)!="G"||this.cube.getElement(43)!="O"){
			this.move(1, a);
			this.move(2, b);
			this.move(3, a);
			this.move(3, b);
			this.move(1, a);
			this.move(3, b);
			this.move(3, a);
		}
	}
	
	/**
	 * third method used to solve step 4
	 */
	private void step43(){
		if(this.testOrange()==1){
			this.chair("B");
		}
		else if(this.testBlue()==1){
			this.chair("R");
		}
		else if(this.testRed()==1){
			this.chair("G");
		}
		else{
			this.chair("O");
		}
	}
	
	/**
	 * Method for the 4th step
	 */
	public void step4(){
		this.step41();
		this.step42();
		this.step43();
	}
}
