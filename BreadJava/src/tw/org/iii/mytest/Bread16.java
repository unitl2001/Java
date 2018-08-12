package tw.org.iii.mytest;

public class Bread16 {
	//陣列
	//java陣列最多到2G
	public static void main (String[] args) {
		/*
		 * Array 
		 * 1. Type 型別固定
		 * 2. Length 長度固定 放10格
		 */
		//測試8個型別 double flaout 0.0 boolean flase 
//		宣告了整數陣列
		int[] a;
//		長度 有4個元素 永遠從0開始 new的字樣 在java 只有物件能用
		a = new int[4]; 
		//物件是具體的 在記憶體原本就存在 也完成初始化的動作 等號＝初始化給值
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]); //[i] 0以上的整數
		}
		int[] b = new int[3];
		int[] c = new int[] {1,2,3,4,5};
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i]); 
	}
		//只有在宣告的同時給值 宣告時沒給值 用c
		int[] d = new int[] {1,2,3,4,5};
		for (int i=0; i<d.length; i++) {
			System.out.println(d[i]); 
	}
		
}
	
}
		
			