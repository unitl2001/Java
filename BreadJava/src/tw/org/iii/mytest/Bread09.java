package tw.org.iii.mytest;

public class Bread09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2進位增值表
		//and&&跟or 執行優先順序由左至右
		// 比較&&(and)true false
		//因＋＋在後面
		//&一個＆運算（不是邏輯）
		//||
		//^
		int a = 10, b = 3;
		//if (a++ >= 10 && b-- <= 3) {
		//(a++ >= 10 || b-- <= 3 因為｜｜是或 所以Ｂ會是3
		//if (a++ >= 10 || b-- <= 3) {
		if (--a >= 10 && ++b <= 3) {
			//System.out.println("OK");
			System.out.println("OK:a =" + a + ";b =" +b);
		}else {
			
			//System.out.println("XX:a =" + a + ";b"=" +b);
			//System.out.println("XX");		
		
		}
		//2進位運算 增值表 1為trun 0為false
		//2進位運算 &(and) |(or) ^(as or)
		System.out.println(3 & 2);
		System.out.println(3 | 2);
		System.out.println(3 ^ 2);
		System.out.println("------");
		//;是這句話講完了 所以會直接會跳到下一句話
		if (a < 10); {
		//一個完整的句子 用分號;{} 最結尾 這叫做分個區塊
			System.out.println("III");
		}
	
	
	}
		
		
	
		
		//分號以大括號為結尾
		
}
