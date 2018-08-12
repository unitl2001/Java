package tw.org.iii.mytest;

public class Bread37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Bread371{
	void m1();
}
interface Bread372{
	void m2();
}
interface Bread373 extends Bread371, Bread372 {
	void m3();
}
//Bread374 他是Bread371, Bread372的表現 
class Bread374 implements Bread373 {//Bread371, Bread372 {
	//如果要實現373 規格要三條執行
	public void m1() {}
	public void m2() {}
	public void m3() {}
}