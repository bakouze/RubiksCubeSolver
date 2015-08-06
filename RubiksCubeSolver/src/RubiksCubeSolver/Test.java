package RubiksCubeSolver;

public class Test {

	public static void main(String[] args) {
		
	}
	
	/**
	 * Test the property "4*mouv = Id" to test the mouv function
	 */
	public static void test1(){
		RubiksCube cube = new RubiksCube();
		System.out.println(cube.toString());
		cube.move(4, "Y");
		System.out.println(cube.toString());
	}
}
