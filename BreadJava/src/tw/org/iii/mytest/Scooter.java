package tw.org.iii.mytest;

//extends 是繼承 屬性跟方法有在繼承除了private
//Scooter是子 Bike是父
//修飾字大到小 
//public
//protected
//沒寫
//private
//繼承有開放多型
public class Scooter extends Bike{
	private int gear;
	
//	把屬性跟方法強化
	void chageGear(int gear) {
		this.gear = gear;
	}
	
	int getGear() {
		return gear;
	}
//	override upSpeed() 方法名稱參數列個型別一樣
//	要做override  必須要跟父類別一樣
//	int upSpeed() {
//		return 1;
//	} 錯誤
	
//	想改寫爸爸的upspeed 先用upspeed
	void upSpeed() {
//		之後再用自己
		super.upSpeed();
		speed *=gear;
	} //正確
	
	double getSpeed() {
		//要重新定義
		return speed+1;
	}

}
