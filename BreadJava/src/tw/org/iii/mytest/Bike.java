//package是執行環境的路徑
package tw.org.iii.mytest;

import java.io.Serializable;

//import
//import java.util.Collections;
//public class 是類別 沒有類別沒有物件
//一個java原始檔 最多只有一個被宣告public 而且要跟檔案名原始
//public 存取修飾字
public class Bike extends Object implements Serializable {
	//物件
	//4種屬性存取修飾字 public protected 沒有 private
	//private 只留在大括號裡面 屬性存取修飾字 是將該數值屬性封裝成方法 不會把屬性裸露在外
	protected double speed;
	
	/*Constructo建構式  進行該物件初始化的動作 
	*不會有傳回 必須跟類別名稱大小寫一模樣
	*建構式不是一個物件類別所擁有的
	*/
	Bike(){
		//System.out.println("Bike()");
		speed = 4.2 ;
	}
	//變數如果有衝突用this
	Bike(double speed){
		this.speed = speed;
	}
	
	//命名方法動詞跟介系詞小寫 
	
	void upSpeed() {     //對外宣告 不用傳回
		speed = speed==0?1:speed*1.4; //速度為0 你呼叫1次時 速度＊1.5
	}


	void upSpeed(int gear) {
		speed = speed==0?1:speed*gear*1.2;
	}
	void downSpeed() {
		speed = speed==1?0:speed*0.7;
	}
//	double為對外宣告
	double getSpeed() {
		return speed;
	}
	
}
