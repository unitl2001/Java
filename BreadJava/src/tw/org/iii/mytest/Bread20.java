package tw.org.iii.mytest;

public class Bread20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//只要能被new（新增）出來
		Bike b1 = new Bike();
		//擁有的表示法是.
		//System.out.println(b1.getspeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		//System.out.println(b1.getspeed());
		//b1.speed = 10;
		
		
		//物件放的是記憶體位置的值？
		double[] a = new double [3];
		System.out.println(a);
		//基本型別放的是值
		int b = 123;
		System.out.println(b);
		
		//定義在tw.org.iii.mytest.Bike@記憶體位置的類別
		//tw.org.iii.mytest.Bike@61064425
	}

}
