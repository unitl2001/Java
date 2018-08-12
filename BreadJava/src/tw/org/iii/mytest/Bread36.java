package tw.org.iii.mytest;

public class Bread36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bread363 obj1 = new Bread363();
		Bread363 obj2 = new Bread363();
		//宣告看你能不能呼叫 執行看你骨子裡
	
	}

}
//人機界面 訂規格的時候 是沒有實作的方法 沒有辦法做出物件實體 可以實作該介面的類別 實作物件實體
//interface 可以實作 因為他們都是public 每個定義的方法也是public
//Bread362 是一個規格 透過m1 m1來制定
//繼承是單一繼承 介面的的規格 可以多重實現
interface Bread362 {
	void m1();
	void m2();
}
//Bread363透過implements 對外宣稱 所以要加public
class Bread363 implements Bread362 {
	public void m1(){}
	public void m2(){}
	void m3() {}
}
class Bread364 implements Bread362{
	public void m1(){}
	public void m2(){} 
}