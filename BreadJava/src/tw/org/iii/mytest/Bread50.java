package tw.org.iii.mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Bread50 {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("dir1/view.jpg");
		//方法1.byte.length只能用2G
		//byte[] buf = new byte[(int)source.length()];
		//方法2.用byte[2000000000]是以空間換時間的做法
		//方法3.byte[source.length()<2000000000?(int)source.length():2000000000];
		//方法4.final int buflimit = 2000000000; 再調2000000000的數值
		final int buflimit = 2000000000; 
		byte[] buf = new byte[source.length()<buflimit?(int)source.length():buflimit];
		try {
		FileInputStream fin = new FileInputStream(source);
		int len = 0;
		while ((len = fin.read(buf)) != -1) {
			fout.write(buf, 0, len);
		}
		fin.read(buf);
		fin.close();
		
		FileOutputStream fout = new FileOutputStream("dir2/view.jpg");
				//第一種方法的
				//fout.write(buf);
				fout.flush();
				fout.close();
				System.out.println("OK" + (System.currentTimeMillis() -start));
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}


//Homework 攥寫一個複製整個目錄的程式 有幾層 不一定 用"遞迴"的概念 
//首先複製目錄 先判斷是否dreteray 還是file mkdir 如果是目錄用listFiles