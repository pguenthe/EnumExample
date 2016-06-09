
public class Recursion2 {

	//goal of the method is to print a String letter by letter with dashes
	//iterative solution
	/*public static void dashString(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i) + "-");
		}
		System.out.println();
	}*/

	public static void dashString (String s) {
		dashString(s, 0);
	}
	//recursive
	public static void dashString(String s, int index) {
		//stop state
		if (index >= s.length()) { //reached the end of the string
			System.out.println();
			return;
		}
		System.out.print(s.charAt(index) + "-");
		dashString (s, index + 1);
		//tail-recursive: recursive call is the last thing in the method
	}
	
	
	public static void main(String[] args) {
		dashString ("Hello World");
		dashString ("Have a nice day!");
	}
	
	

}
