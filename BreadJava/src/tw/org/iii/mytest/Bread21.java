package tw.org.iii.mytest;

public class Bread21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1, b2;
		//建構式是在做物件的初始化 真正在做的事
		b1 = new Bike();
		System.out.println(b1.getSpeed());
		b2 = new Bike(1.4);
		System.out.println(b2.getSpeed());
		//加檔位 加速 overloading 
		b1.upSpeed();
		System.out.println();
	}

}
