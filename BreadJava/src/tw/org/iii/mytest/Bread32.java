package tw.org.iii.mytest;

public class Bread32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Bread321{
	void m1() {
		System.out.println("Bread321:m1()");
	}
}
//先把父類別 強化所以加super 但並非建構式 所以位置不一定要放在
class Bread322 extends Bread321{
	void m1() {
		System.out.println("Bread321:m1()");
		super.m1();
	}
}