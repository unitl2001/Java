package tw.org.iii.mytest;

public class Bread39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//要有外部物件 所以要先有obj1的物件實體
		Bread391 obj1 = new Bread391();
		Bread391.Bread392 obj2 = obj1.new Bread392();
		obj2.m1();
		Bread391.Bread393 obj3 = new Bread391.Bread393();
		obj3.m1();
	}
}
//外部物件
class Bread391 {
	private int a = 10;
	//內部物件是由外部物件所擁有的 
	class Bread392 {
		{
		//常見
		Bread391 m1() {
			System.out.println("Bread391:Bread392:m1()");
			System.out.println(a);
			//不常見
			//void m1() 
			//	System.out.println(Bread391.this.a);
			return Bread391.this;
		}
	}
	
	//另一種方法
	//宣告static 不用外部 不用宣告 就可以呼叫
	static class Bread393 {
		void m1() {
			System.out.println("Bread391:Bread392:m1()");
		}
	}
}