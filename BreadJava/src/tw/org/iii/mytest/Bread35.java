package tw.org.iii.mytest;

public class Bread35 {
	//幾何形狀
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s1 = new Circle();
		Rectangle s2 = new Rectangle();
		m2(s1);
		m2(s2);
	}
static void m2 (Shape s) {
	System.out.println(s.calArea());
}
}
abstract class Bread353{
	void m1() {}
}
abstract class Shape {
	Shape(){
		System.out.println("I am shape");
	}
	void setName() {}
	abstract double calLength();
	abstract double calArea();
}
class Circle extends Shape{
	double claLength() {
		return 1.0;
	}
	double calArea() {
		return 1.0;
	}

class Rectangle extends Shape{
	double claLength() {
		return 2.0;
	}
	double calArea() {
		return 2.0;
	}
	@Override
	double calLength() {
		// TODO Auto-generated method stub
		return 0;
	}
}

@Override
double calLength() {
	// TODO Auto-generated method stub
	return 0;
}
}
class Bread351 {
	
}
//class Bread352 extends Bread351 {
//	
//}
