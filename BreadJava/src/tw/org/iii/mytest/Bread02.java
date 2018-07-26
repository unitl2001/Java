package tw.org.iii.mytest;

public class Bread02 {
		//api看java.lang "short byte int"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//簡單使用（玩）用int
		int a1 = 10, a2 = 3;
		//int a3 = a1 + a2
		//int a3 = a1 - a2
		//int a3 = a1 * a2
		//int a3 = a1 / a2; //如果是除 其結果在a1/a2的運算過程是整數相除（此為強型別特性）
		int a3 = a1 / 3 ;//可以
		//int a3 = a1 / 3.3 這樣不行
		System.out.println(a3);
		
		byte b1 = 10, b2 = 3;
		//byte b3 = b1 / b2
		//short b3 = b1 / b2 ; byte short 用數學運算 其運算結果為int
		//int b3 = b1 / b2(正確)
		byte b3 = (byte)(b1 / b2);
		System.out.println(b3);
		
		byte b4 = 120 + 3;//(數字為常數,正確)
		//byte b4 = b1 + 3; (b1為變數)
		System.out.println(b4);
		byte b5 = 127;
		b5++; //++位元加1 所以會得出來的結果為-128
		System.out.println(b5);
		b5 --;
		System.out.println(b5);
		b5 -= 4;
		System.out.println(b5); 
		//宣告是多少他的範圍是固定的-127~128
		//b5 = b5 + 1; //b5 b5要宣告為int常數 因為他是變數 
	}

}
