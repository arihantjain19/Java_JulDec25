package firstprj;
class Circle{
	double radius;
	Circle(){
		radius = 1.0;
	}
	Circle(double radius){
		this.radius = radius;
	}
	double area() {
		return radius*radius*3.14;
	}
	double circumference() {
		return radius*2*3.14;
	}
	void display() {
		System.out.println("Area:"+area()+" Circumference:"+circumference());
	}
}
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.display();
		Circle c2 = new Circle(47.65);
		c2.display();
	}
}
