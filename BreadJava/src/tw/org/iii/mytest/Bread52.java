package tw.org.iii.mytest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Bread52 {
	//串接
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fin = new FileInputStream("dir1/book1.csv");
		InputStreamReader isr = new InputStreamReader(fin); //, "big5")把字型設為big5; ,Charset.forName("Big5")
		BufferedReader reader = new BufferedReader(isr);
		String line = null;
		while ((line = reader.readLine()) !=null) {
			String[] data = line.split(",");
			String name = data[0];
			String tel = data[1];
			String addr = data[2];
			System.out.println("Name=" + name +"\n"+ "Tel=" + tel);
			//System.out.println(line);
		}
		fin.close();
	}catch(Exception e) {
		
	}
	}
	}
