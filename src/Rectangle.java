import java.util.Scanner;

public class Rectangle {
	//4.5 parts to a method header
	//1. visibility modifier: public protected private (default)
	//(1/2) static: used to make this method a class method, not an instance method
	//2. return type: data type of the ONE PIECE of information the method passes back
	//  (void if no data is returned)
	//3. name of the method (same rules as var name)
	//4. argument list (information you're passing into the method)
	
	//the method signature is how the VM knows which method to run
	//only consists of the method name and the method argument data types (in order)
	
	public static double area (double l, double w) {
		double a = l * w;
		return a;
	}

	public static double perimeter (double l, double w) {
		double p = 2* (l + w);
		return p;
	}
	
	//overloaded method: same name of method, unique arg list
	//overloading is not the same as polymorphism
	//polymorphism means I can have the same method name with the same arg
	// list in different classes
	public static String perimeter (String name, int l, int w) {
		return ("The perimeter of " + name + " is " + perimeter (l, w));
	}
	//can't overload with the arg list, even w/ diff return type
/*	public static String perimeter (double l1, double w1) {
		return ("The perimeter of " + name + " is " + 42);
	}*/
	
	public static double volume (double side1, double side2, double side3) {
		return side1 * side3 * side2;
	}

	public static void main(String[] args) {
		// Area = length + Width
		// Perimeter = 2 *(length + Width)
		// Volume = length + width + height 
		Scanner scanner = new Scanner (System.in);
		
		double length = 0;
		double width = 0;
		double height = 0;
	
		double perimeter = 0; 
		double volume = 0;
		
		while (true) {
			System.out.println("Enter the length of the rectangle : ");
			length = scanner.nextDouble();
			
			System.out.print("Enter the width of the rectangle: ");
			width = scanner.nextDouble();
			
			System.out.print("Enter the height of the rectangle: ");
			height = scanner.nextDouble();
			
			//method invocation (calling)
			//invalid: the signature doesn't match a defined method
			//double area = area(length, width, height);
			double area = area(length, width);
			System.out.println("The Area of Rectangle is : "+ area);
			System.out.println("The Perimeter of Rectangle is : "+ perimeter(length, width));
			System.out.println("The Volume of Rectangle is : " 
					+ volume(length, width, height));

			System.out.println("The area of some other rectangle is " + area(4, 5) );
			System.out.println(perimeter("Bob", 10, 4));
			System.out.print("Go again? ");
			String garbage = scanner.nextLine();
			String goForward = scanner.nextLine();
			if (goForward.equals("y")){
				System.out.println("Let's go again");
			} else {
				System.out.print("Bye");
				break;
			}
				
		}
	}
}