package tw.org.iii.mytest;

public class Bread13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 迴圈
		//*for 回圈三到敘述句 兩個;（分號 此為無窮迴圈
		//for (int i=0; i<10; i++) { 印出i 0~9
		//for迴圈 1.int i=0 宣告並給值 在for迴圈裡面 i只活在sysout(i) 稱為變數的生命範圍
		//        
		for(int i=0; ; i++) {
			System.out.println(i++);
		}
	}
//	2.	int i=0 這個重複宣告  所以裡面的int=0 可以刪除 他出來的值0-10
//		for((int i=0; i<10; i++); {
//			System.out.println(i);
//	}
//		System.out.println(i)
//}
	
//	3.	int i=0 這個是三個敘述句
//	for((System.out.println; i<10; i++);  {
//		System.out.println(i);
//}
//	System.out.println(i)
	
//  4. 對for進入迴圈前要做的事
//	   int i=0 
//		for((m1(); i<10; i++);  {
//			System.out.println(i);
//}
//			System.out.println(i)
	
//		public static void m1() {
//		int a = 10, b = 3;
//		System.out.println(a/b);
//	}
//	
//}
	
	
//  5. 如果把for裡面的i++去掉 會陷入無窮迴圈 所以在sysout那邊輸入i++
//	   int i=0 
//		如果把i<10刪除 System.out.println(i)會跑出錯誤
//		for((m1(); i<10; System.out.println("----")  );  {
//			System.out.println(i++);
//}
//			System.out.println(i) //（到不了的地方
	
//		public static void m1() {
//		int a = 10, b = 3;
//		System.out.println(a/b);
//	}
//	
//}
