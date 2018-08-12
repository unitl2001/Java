package tw.org.iii.mytest;

public class Bread34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//因為是抽象類別 所以無法直接建構出物件實體
		//Bread341 obj1 = new Bread341();
		//可以用342 343做
		Bread341 obj1 = new Bread342();
		Bread341 obj2 = new Bread343();
		//強迫多行 有m2 但實際內容
		obj2.m2();
		obj2.m2();
	}

}
//abstract不期待你拿我做物件實體 可以看得到 宣告為何 但執行要看子類別
abstract class Bread341 {
	void m1() {System.out.println("Bread341:m1");}
	//如果只加;是透過子類別來講 所以需要加個抽象abstract這個字 在前面也一定要加 但子類別 一定要加{}
	//這個方法是強迫子類別一定要做
	abstract void m2();
}
class Bread342 extends Bread341{
	void m2() {System.out.println("Bread342:m2");}
}
class Bread343 extends Bread341{
	void m2() {System.out.println("Bread343:m2");}
}