package tw.org.iii.mytest;

import java.io.File;
import java.io.IOException;

public class Bread45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("dir1/");
		File f2 = new File("dir2/");
		//f3是物件 有做出來不代表目錄一定存在
		File f3 = new File("dir3/dir4/dir5/dri6/");
		File f4 = new File("dir3/dir4/dir5/dri6/file1");
		if(f1.exists()) {
			System.out.println("f1 exist");
		}
		if(f3.exists()) {
			System.out.println("f3 exist");
		}else {
			//實體目錄不存在 要做出該目錄用mkdir 如果爸爸不存在要做出該類別就用mkdirs
			System.out.println(f3.mkdirs());
		}
		
		if (!f4.exists()) {
			try {
				f4.createNewFile();
			}catch (IOException ie) {
				System.out.println(ie);
			}
	}
		//測試equals
		File f5= new File("dir1");
		File f6= new File("dir2/../dir1");
		File f7= new File("dir3/dir4/../../dir1");
		File f8= new File("dir1");
		System.out.println(f5 == f6);
		System.out.println(f5.equals(f6));
		System.out.println(f5.equals(f7));
		System.out.println(f5.equals(f8));
	}
}
