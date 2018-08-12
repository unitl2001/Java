package tw.org.iii.mytest;

public class Bread14 {
	//質數
	public static void main(String[] args) {
		
		//system.currentTimeMillis(印出時間 千分之一秒）
		//檢查是否質數
		//從1970 1/1 0:0:0開始計算到現在 此計算方式稱時間戳記 
		//1970是unix紀元
		long star = System.currentTimeMillis();
		// TODO Auto-generated method stub
//		步驟1
//		for (int i=1; i<=100; i++) {
//			if (i % 10 == 0) System.out.println();
		
//		步驟2
//		for (int i=1; i<=100; i++) {
//			
//			for(int j=2; j<i; j++) {
////				％是mod 於數為0
//				if(i % j == 0)
//					//=不是質數
//					isPrime = false; //初值是質數嗎
//					//脫離所在的迴圈結構
//					break;
//					System.out.print(i + "   ");
//					if (i % 10 == 0) System.out.println();
//			}
					
//		步驟3
		
		for (int i=1; i<=100; i++) {
			boolean isPrime = true;
			for(int j=2; j<i; j++) {
//				％是mod 於數為0
				if(i % j == 0)
					//=不是質數
					isPrime = false;
					//脫離所在的迴圈結構
					break;
			}
//			如果是質數印＊ 如果不是空格
//			此為三元運算式(isPrime?"*":" ")
			System.out.print(i + (isPrime?"*":" ") + "   ");
			//(isPrime) 逢10換列
			if (i % 10 == 0) System.out.println();
		}
	}
}
