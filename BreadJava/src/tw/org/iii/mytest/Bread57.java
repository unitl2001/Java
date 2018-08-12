package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bread57 {
	//序列化 
	public static void main(String[] args) {
		
		Bread573 obj = new Bread573();
		
		try(ObjectOutputStream oout = 
				new ObjectOutputStream(
						new FileOutputStream("dir1/bread.object"))){
			oout.writeObject(obj);
			System.out.println("Save OK");
				
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Bread571 {
	Bread571(){System.out.println("Bread571()");}
	
	}
class Bread572 extends Bread571 implements Serializable{
		Bread572(){System.out.println("Bread572()");}
	}
class Bread573 extends Bread572  {
			Bread573(){System.out.println("Bread573()");}
			}



	