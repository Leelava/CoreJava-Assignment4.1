package Session4Assignment1;
// Method overloading example
public class DemoOfOverload {

public int calculateperimeter(int length, int breadth){
	
	int perimeterofrect = length * breadth;
	return perimeterofrect;
}

public int calculateperimeter(int side){
	int perimeterofsquare = side *side;
	return perimeterofsquare;
}

public float calculateperimeter(float radius){
	float pi=3.14f;
	float perimeterofcircle = 2*radius*pi;
	return perimeterofcircle;
		
}

	public static void main(String[] args) {
		//calling the same method with different arguments and return type to cal perimeter of different geometrical shapes
		DemoOfOverload perimrect = new DemoOfOverload();
		System.out.println("Perimeter of a rectangle =  "  +perimrect.calculateperimeter(5,10));
		
		DemoOfOverload perimsqr = new DemoOfOverload();
		System.out.println("Perimeter of a square =  "  +perimrect.calculateperimeter(5));
		
		DemoOfOverload perimcirl = new DemoOfOverload();
		System.out.println("Perimeter of a circle =  "  +perimrect.calculateperimeter(5.0f));
		

	}

}
