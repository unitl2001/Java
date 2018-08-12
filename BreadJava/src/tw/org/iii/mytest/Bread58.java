package tw.org.iii.mytest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Bread58 {

	public static void main(String[] args) {
		//解序列化
		try(ObjectInputStream oin = 
				new ObjectInputStream(
				new FileInputStream("dir1/bread.object"))){
			Object obj = oin.readObject();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
