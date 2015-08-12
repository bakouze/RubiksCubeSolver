package RubiksCubeSolver;

public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	/**
	 * Test the property "4*mouv = Id" to test the mouv function
	 */
	public static void test1(){
		RubiksCube cube = new RubiksCube();
		Solution s = new Solution();
		System.out.println(cube.toString());
		cube.move(4, "Y", s);
		System.out.println(cube.toString());
		System.out.println(s.toString());
	}
}
