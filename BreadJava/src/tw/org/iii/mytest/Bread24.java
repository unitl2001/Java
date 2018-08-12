package tw.org.iii.mytest;

public class Bread24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		繼承關係
//		Bike b1 = new Bike();
//		Scooter s1 = new Scooter();
//		//s1是腳踏車但是是由摩托車工廠做出來的
//		操作是腳踏車 但真正的物件實體是摩托車 租一台車去墾丁 但拿到的是法拉利同為車
//		但執行（速度出來的）卻跟一般車不一樣
//		所以腳踏車是腳踏車但速度卻是摩托車的速度
//		Bike s1 = new Scooter(); 
//		class xxx extends(延伸,擴大） 父類別 因為class（單一延伸）繼承父類別
//		extends繼承其實是很像現實生活的繼承 所以稱呼
//		任何一個類別都有父類別
//
//		s1.upSpeed();
//		s1.upSpeed();
//		System.out.println(b1.getSpeed());
//		System.out.println(s1.getSpeed());
		
		
//		java永遠都是單一繼承 如果對外沒有宣稱extends父類別 
//		永遠都是Object稱為父類別 可以不寫但預設為Object
		
		Bike b1 = new Bike();
		Scooter s1 = new Scooter();
		
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		s1.upSpeed();
		s1.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.getSpeed());
		s1.chageGear(3);
		s1.upSpeed();
		System.out.println(s1.getSpeed());
//		因為b1是腳踏車所以沒有加速
//		把父類別改良叫override overload相同方法名稱
//		b1.chageGear(3);
		

	}

}
