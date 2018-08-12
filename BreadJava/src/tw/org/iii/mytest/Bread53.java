package tw.org.iii.mytest;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Bread53 {

	public static void main(String[] args) {
		try {
		DataOutputStream dout =
				new DataOutputStream(
						new FileOutputStream("dir1/bread.dat"));
		
		
		dout.writeInt(4);
		dout.writeUTF("Bread");
		dout.writeBoolean(false);
		
		
		
		dout.flush();
		dout.close();
		System.out.println("Save OK");
	}catch(Exception e) {
		
	}
	}
}
