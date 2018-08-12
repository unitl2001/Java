package tw.org.iii.mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.OutputStream;
import java.io.PrintStream;

public class Bread49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			long start = System.currentTimeMillis();
			FileInputStream fin = new FileInputStream("dir1/view.jpg");
			FileOutputStream fout = new FileOutputStream("dir2/view.jpg");
		
			int temp;
			while ((temp = fin.read()) != -1) {
				fout.wait(temp);
		}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("OK" + (System.currentTimeMillis()-start));
	}catch(Exception e) {
		System.out.println(e);
	}
	}
}

