package RubiksCubeSolver;

public class Test {

	public static void main(String[] args) {
		String[] cube = {
				"R", "Y", "Y", "B", "W", "W", "W", "O", "W", 
				"O", "R", "R", "B", "R", "Y", "B", "O", "O", 
				"Y", "O", "W", "W", "B", "R", "G", "Y", "B", 
				"G", "B", "G", "B", "G", "G", "G", "W", "R", 
				"O", "G", "O", "R", "O", "G", "W", "R", "Y", 
				"R", "W", "B", "O", "Y", "Y", "B", "G", "Y"};
		testStep2(cube);
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
	
	/**
	 * test the first step
	 * @param cube
	 */
	public static void testStep1(String[] cube){
		Resolution reso = new Resolution(cube);
		System.out.println(reso.toString());
		reso.step1();
		System.out.println(reso.toString());
	}
	
	public static void testStep2(String[] cube){
		Resolution reso = new Resolution(cube);
		System.out.println(reso.toString());
		reso.step1();
		reso.step2();
		System.out.println(reso.toString());
	}
}
