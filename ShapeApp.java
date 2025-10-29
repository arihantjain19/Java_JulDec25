package firstprj;

class Shape {
	double dim1;
	double dim2;
	double dim3;
}
class rectangle extends Shape{
	rectangle(){
		dim1 = 0.0; dim2 = 0.0; dim3 = 0.0;
	}
	double findArea(){
		return dim1*dim2;
	}
	double findPerimeter() {
		return 2*(dim1+dim2);
	}
	void display() {
		System.out.println("Rectangle Area:"+findArea()+" Perimeter:"+findPerimeter());
	}
}
class square extends Shape{
	square(){
		dim1 = 0.0;
	}
	double findArea(){
		return dim1*dim1;
	}
	double findPerimeter() {
		return 4*dim1;
	}
	void display() {
		System.out.println("Square Area:"+findArea()+" Perimeter:"+findPerimeter());
	}
}
public class ShapeApp{
	public static void main(String args[]) {
		Shape S = new Shape();
		rectangle R = new rectangle();
		R.display();
		square Sq = new square();
		Sq.display();
	}
}