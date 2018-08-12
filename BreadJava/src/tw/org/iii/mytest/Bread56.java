package tw.org.iii.mytest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Bread56 {

	public static void main(String[] args) {
		//解序列化
		try(ObjectInputStream oin = 
				new ObjectInputStream(
				new FileInputStream("dir1/bread.object"))){
			Object obj = oin.readObject();
			Student s1 = (Student)obj;
			System.out.println(s1.calSum() + ":" + s1.calAvg());
			System.out.println(s1.bike.getSpeed());
			//Bike b1 = (Bike)oin.readObject();
			//System.out.println(b1.getSpeed());
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
