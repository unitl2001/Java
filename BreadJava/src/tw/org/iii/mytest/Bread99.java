package tw.org.iii.mytest;

public class Bread99 {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		//9*9乘法表
		//1.初表 println 去掉ln 可以變沒換列
//		System.out.print("2 X 1 = 2");
//		System.out.print("2 X 1 = 2");
//		System.out.print("2 X 1 = 2");
//		System.out.print("2 X 1 = 2");
//		//2.用 \t （\tab鍵 不可列印字元）
//		System.out.print("2 X 1 = 2\t");
//		System.out.print("2 X 1 = 2\t");
//		System.out.print("2 X 1 = 2\t");
//		System.out.print("2 X 1 = 2\t");
		//3. 宣告int x是開始2 要跑2-5所以x<=5
//		for (int x=2; x<=5; x++) {
//		//影響的是x
//		int r1 = x * 1; //結果
//		//把2改成x+ r1 + (字串相加印出r)
//		System.out.print(x + " x 1 = " + r1 + "\t");
//		}
//	}
//}
		//4.衝9列
		//int y=1; y<=9; y++) y=1因為是1-9 所以這個會跑9次
		
		for (int y=1; y<=9; y++) {
		for (int x=2; x<=5; x++) {
			int r1 = x * 1; 
			//+y+
			System.out.print(x + " x " + y + " = " + r1 + "\t");
		}
		System.out.println();
		}
	}
}
//		5.跑兩圈寫1或0開始算都可以 基本上是0開始
//		  跑兩圈所以是要這樣寫k=0; k<4 k++
//		for (int k=0; k<4; k++) //中間k<4 是指幾列
//			for (int y = 1;y<=9; y++ ) { //中間y<=9 是幾行
//			for (int x = 2; x<=5; x++ ) {
//		一列有4個
//				int newx = x + k*4;
//				int r = newx * y;
//				System.out.print(newx + " x " + y + " =" + r + "\t");
//			}
//			//print f 字串相加
			
//			System.out.println();
//		}
//		System.out.println("-------");
//		
//	}
//
//}
