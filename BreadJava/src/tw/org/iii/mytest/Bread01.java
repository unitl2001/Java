package tw.org.iii.mytest;

public class Bread01 {  //物件導向
		//基本型別8種類
	    //整數型別 int (常用) byte（次常用） short long（不常用）
		//浮點數 float（次常用） double(用double方便 所以常用)
		//字元
		//布林值
	public static void main(String[] args) { //語法寫這 該列別程式 主執行程式（主敘）
		// TODO Auto-generated method stub 單列註解
		/*
		 * 	
		 */ // /* * */ 區塊註解
		// /**
		// * javaDoc
		// */
		//一般寫程式會做變數的宣告
		//java為強型別語言 任何變數一定要宣告才能使用 一但宣告完 給了之後不能變
		//強型別一般用在編譯的動作稱為bytecode(位元組碼)
		//弱型別語言 javascript php 給了值 可以改變（浮點數）
		
		////local variablae b1 稱為區域變數 function
		byte b1; // (-1~-128)-128 ~127(0~127) java無正負號 => 256 => 2^8
		byte b2 = 12; //對他宣告同時給值
		byte b3 = -127; //128會編譯失敗 -129也會失敗
		//變數命名原則[a-zA-Z$][a-zA-Z0-9$_]* 而且不要撞到關鍵字例如byte public
		byte $_$ = 123;
		//正規表示法Regular Expression 表示正規的規則
		byte 變數1 = 123; //java支援unicode (但別這麼做)
		System.out.println(變數1);
		//預設編碼請設定為UTF-8 專案右鍵properties resource
		
		
		//
		short s1 = 128; //範圍2^16
		short s2 = 32767;
		//short s2 = 32768; 超過
		
		//平常使用int
		int a1 = 123; // 範圍2^32 整數範圍有正負號
		
		long g1 = 123; //2^64
		
		
		
		
	}

}
