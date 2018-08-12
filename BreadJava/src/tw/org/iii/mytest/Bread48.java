package tw.org.iii.mytest;

import java.io.File;

public class Bread48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//換檔案並更名
		File f1 = new File("dir2/Bread5.txt");
		File f2 = new File("unitl2001/下載目錄/Bread6.txt");
		if (f1.renameTo(f2)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}

}
