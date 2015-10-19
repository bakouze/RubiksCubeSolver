package RubiksCubeSolver;

/**
 * Class modeling the orientation of a piece.
 * @author bakouze
 *
 */
public class Orientation {

	/**
	 * Attribute
	 */
	private boolean orientationDroite;
	
	/**
	 * Constructor
	 * @param ori
	 */
	public Orientation(String ori){
		if(ori.equals("GAUCHE")){
			this.orientationDroite = false;
		}
		else if(ori.equals("DROITE")){
			this.orientationDroite = true;
		}
		else{
			System.out.println("Wrong Orientation : " + ori);
		}
	}
	
	public boolean getOrientation(){
		return this.orientationDroite;
	}
	
	/**
	 * Return a value for each color s.
	 * @param s
	 * @return
	 */
	private int value(String s){
		int temp = 0;
		switch(s){
		case "R":
			temp = 1;
			break;
		case "B":
			temp = 2;
			break;
		case "O":
			temp = 3;
			break;
		case "G":
			temp = 4;
			break;
		default:
			System.out.println("Error in Step 3 : Value");
			break;
		}
		return temp;
	}
	
	/**
	 * define the orientation in function of the color of the piece
	 * @param a
	 * @param b
	 */
	public Orientation(String a, String b){
		int value = value(a) - value(b);
		value = value%4;
		if(value<0){
			value += 4;
		}
		switch(value){
		case 0:
			System.out.println("Error 0 in Step 3 : setOrientation");
			break;
		case 1:
			this.orientationDroite = false;
			break;
		case 2:
			System.out.println("Error 2 in Step 3 : setOrientation");
			break;
		case 3:
			this.orientationDroite = true;
			break;
		default:
			System.out.println("Error modulo in Step 3 : setOrientation. " + value);
		}
	}
}