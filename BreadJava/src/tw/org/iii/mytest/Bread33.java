package tw.org.iii.mytest;

public class Bread33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bread331.m2();
		//Bread331 obj1 = new Bread331();
		//物件就是物件 但類別有載入過 只載入一次
		Bread332 obj2 = new Bread332();
		Bread332 obj3 = new Bread332();
				
	}

}
class Bread331{
	//只要是static在該類別會先被載入
		static {System.out.println("Bread331{staic}");}
	//{}是物件的程式區塊 
	{System.out.println("Bread331{}");} //可以呼叫物件區塊
	//建構式 的物件早已存在 
	Bread331(){System.out.println("Bread331()");}
	//物件方法
	void m1() {System.out.println("Bread331:m1()");}
	//static方法
	static void m2() {System.out.println("Bread331:m2()");}
}
//331是父類別 沒有331 就沒有332的存在
class Bread332 extends Bread331{
	static {System.out.println("Bread332{staic}");}
	{System.out.println("Bread332{}");}
	Bread332(){System.out.println("Bread332()");}
	void m1() {System.out.println("Bread332:m1()");}
	static void m2() {System.out.println("Bread332:m2()");}
}