package tw.org.iii.mytest;

//要用pakeage01 自動inport Bread01
import p1.Bread01;

public class Bread40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread01 obj1 = new Bread01();
		//名字一樣 所以 要打詳細
		p2.Bread01 obj2 = new p2.Bread01();
		//因不在相同pakeage 所以叫不到
		//p2.Bread02 obj3 = new p2.Bread02();
	}

}
