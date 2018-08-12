package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.IOException;
	//Write
public class Bread47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//寫true的用義是要不要append 在一開始就要決定了 
			FileOutputStream fout = new FileOutputStream("dir1/Bread4.txt",true);
			//新增並寫內容 利用getBytes 來寫 不會出現亂碼 因為是用getBytes陣列 中文也可以
			fout.write("你好 世界\n" .getBytes());
			fout.write("我是 世界\n" .getBytes());
			fout.write("你好 USER\n" .getBytes());
			fout.write("猴子\n" .getBytes());
			//flush是刷新＋如果檔案不在新增 如果檔案在 內容會先清空 在寫新的
			fout.flush();
			fout.close();
			//如果看到ok就表示那三行沒有例外 
			System.out.println("OK");
		}catch(IOException ie) {
			System.out.println(ie);
		}
		
	}

}
