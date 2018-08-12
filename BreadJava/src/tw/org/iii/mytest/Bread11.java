package tw.org.iii.mytest;

public class Bread11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case 不能放變數 只能放常數
		//final 只能初始宣告時化給值 （很重要"只能給值一次"）
		byte a = 10, b = 100 ; 
		final byte c = 100;
		//final byte c;
		//c = 100;     這樣是不行的 final 是初始時給職
		switch (a) {
		case 1:
			System.out.println("A");
			break;
		case 10:
			System.out.println("B");
			break;
		//把100換成b會無法編譯成功 因為case裡面只能讓常數 不能放變數
		//如果要變成數需要用到final	 所以改成c就可以了
		//不能給相同的case 可以用常數加減
		case 100:
			System.out.println("C");
			break;
//      byte範圍-128~127
//		case 1000:
//			System.out.println("D");
		//default不一定要放最後他可以放在你想要的地方 但不要在後面寫break
		//擺中間是沒有break敘述句 要結合其他的case做
		default:
			System.out.println("X");
			
		}
	}

}
