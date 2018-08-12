package tw.org.iii.mytest;

public class Bread23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//字串
		String s1 = new String();
		byte[] b2 = {97,98,99,100};
		String s2 = new String(b2);
//		在電子交換的過程 網際網路在java都是字串轉換
		String s3 = new String(b2,1,2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
//		在api看到的粗體字 現在可以之後可能會改掉不能用
//		一個字串的物件實體存在時 這個字串物件的字串內容就不在會被變更
//		s1舊的物件實體的物件內容是存在 但沒被新的給取代 只是暫時放在垃圾記憶體
//		暫時沒有被刪除
		s1 = new String(b2);
//		String Pool 等號右手邊的S4指向旁邊的Bread
//		S6的字串內容是Bread
//		16列的S5指向等好旁邊的Bread
//		S6看到new(凡是看到new就在java記憶體產生了物件 之後到後面的建構式 進行初始化動作 建構是初始化透過傳遞內容產生字串)
//		S7跟S6是一樣
		String s4 = "Bread";
		String s5 = "Bread";
		String s6 = new String(s4);
		String s7 = new String(s5);
		
//		在new 出來的物件裡面的內容 存放的是址 不是質 所以字串內容不一樣
		int a = 10, b = 10;
		System.out.println(a==b);
		System.out.println(s4==s5);
		System.out.println(s4==s6);
		System.out.println(s6==s7);
		System.out.println("-----");
//		equals想比裡面的內容可以用 是把裡面的字串內容相比看是否相等
//		==(兩個等號)是否為相同的物件實體 字串的equals
		System.out.println(s4.equals(s5));
		System.out.println(s4.equals(s6));
		System.out.println("-----");
//		把s6的基本型別內容傳給s4
		s4 = s6;
		System.out.println(s4==s6);
		System.out.println(s6.equals(s7));
	}

}
