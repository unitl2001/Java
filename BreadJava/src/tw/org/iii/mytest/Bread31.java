package tw.org.iii.mytest;

public class Bread31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread311 obj1 = new Bread311();
		byte a =1, b = 2;
		//只傳a 是可以但如果加b 下面還要再增加
		obj1.m1(a,b);
	}

}
class Bread311{
	void m1(byte a) {
		System.out.println("A");
	}
	void m1(byte a, int b) {
		System.out.println("B");
	void m1(int a, byte b) {
		System.out.println("C");
	}
	void m1(byte a, byte b) {
		System.out.println("D");
	}
	}
}