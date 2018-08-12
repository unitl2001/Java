package tw.org.iii.mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;





//InputStream的資料是byte 不適合讀文字資料 讀binary二進制檔案

public class Bread46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//運用Bread50 改良可以看中文字 運用byte.length
			
			
			FileInputStream fin = new FileInputStream("dir1/Bread.txt");
			int a = fin.read();
			System.out.println((char)a);
			int b = fin.read();
			System.out.println((char)b);
			//方法1
//			int temp;
//			do {
//				temp = fin.read();
//				if (temp== -1) {
//					break;
//				}else {
//					System.out.println((char)temp);
//				}
//			}while(true);
			
			//方法2
//			int temp1;
//			//請串流讀一個進來放在temp當中 先asign近來
//			while( (temp1 = fin.read())!= -1) {
//				System.out.println((char)temp1);
//			}
			//方法3 讀中文 一個中文字佔3個byte 才不會亂碼 如果在國字中間加數字 這個問題還是沒解決
			int temp1;byte[] b1 = new byte[7];
			while( (temp1 = fin.read(b1))!= -1) {
				System.out.print(new String(b1,0,temp1));
			}
			
			fin.close();
		}catch(FileNotFoundException fe) {
			
		}catch(IOException fe)  {
			
		}
	}

	

}
