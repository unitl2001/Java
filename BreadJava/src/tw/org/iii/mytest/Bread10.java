package tw.org.iii.mytest;

public class Bread10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch切換不同的狀態 而()括號裡面只有一個值
		//因括號裡面的值 會產生case
		//case不能重複
		//看到括號從上到下
		int a = 10;
//		
//例子1 a對case的比對 第一道是10跟1比 10不是1所以繼續往下跑
		switch(a) {
		case 1:
			System.out.println("A");
//如果結束了用break結束
		break; 
//      第二道10=10就執行 執行過程中 如果遇到break敘述句 就脫離這個區塊 沒遇到就繼續執行
		case 10:
			System.out.println("B");
			//break;
		case 100:
			System.out.println("C");
			//break;
		default:
			//System.out.println("D");
//			//break; 最後一道敘述句不用打break
//		}
//	}
//
//}
//例子2	switch case是結果論 switch(month) { 是因
		//System.out...是果 以每個月有幾月為例
		// 亂數 數學公式      幾個月份 +1為是否偏移
		//(int)(Math.random()*12)+1
		int month = (int)(Math.random()*12)+1;
		System.out.println(month);
		switch(month) {
		//
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:   
			System.out.println("31");
			break; 
		case 4: case 6: case 9: case 11:
			System.out.println("30");
			break;	
		case 2:
			System.out.println("28");
			break;
		default:
			System.out.println("D");
			//break; 最後一道敘述句不用打break
		}
	}
		
	}
}

