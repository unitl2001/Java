package tw.org.iii.mytest;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Bread54 {
		//串接
	public static void main(String[] args) {
		
		//自動關閉 平常很少用 功能在基本型別＋字串
		try(DataInputStream din = 
				new DataInputStream(
				new FileInputStream("dir1/bread.dat"))){
			
			int stage = din.readInt();
			String username = din.readUTF();
			boolean isSound = din.readBoolean();
			System.out.println(stage + ":" + username + ":" + isSound);
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
