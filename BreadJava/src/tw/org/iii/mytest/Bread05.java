package tw.org.iii.mytest;

public class Bread05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'a' ; //字元只能包在單引號裡面 而且只能包一個
		System.out.println(c1);
		char c2 = '資';
		char c3 = 97; //字元無正負號 0-65535 數字不用''
		System.out.println(c3); //ASCII code
		char c4 = '\u0041';
		System.out.println(c4); //ASCII code

		//System.out.println(012);  //0開頭會是8進位 逢8進位
		//System.out.println(0x41); //0開頭會是16進位 逢16進位
	
		int a1 = c1 + 4;
		System.out.println(a1);
	}

}
