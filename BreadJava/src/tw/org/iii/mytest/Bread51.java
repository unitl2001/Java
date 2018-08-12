package tw.org.iii.mytest;

import java.io.FileReader;

public class Bread51 {

	public static void main(String[] args) {
		//沒有進行asign的動作 所以沒初始化 會編譯失敗 所以要加上null 是可以進行的
		String a = null;
		//區域變數沒有初始化 
		System.out.println(a);
		
		
		
		// TODO Auto-generated method stub
		//FileReader是用InputStream在處理
		try {
		FileReader reader = new FileReader("dir1/Bread.txt");
		int v =reader.read();
		System.out.println((char)v);
		v = reader.read();
		System.out.println((char)v);
		v = reader.read();
		System.out.println((char)v);
		reader.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}
