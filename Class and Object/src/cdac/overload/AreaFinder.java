package cdac.overload;

public class AreaFinder {

	void findArea(int side) {
		System.out.println("Area of square = " + side * side);
	}

	void findArea(float radius) {
		System.out.println("Area of circle = " + 3.14f * radius * radius);
	}

	void findArea(int length, int breadth) {
		System.out.println("Area of rectangle = " + length * breadth);
	}

}
