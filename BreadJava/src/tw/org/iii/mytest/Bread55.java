package tw.org.iii.mytest;

import java.beans.Transient;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bread55 {
	//序列化 
	public static void main(String[] args) {
		Bike b1 = new Bike();
		Student s1 = new Student (90, 60, 24, b1);
		s1.bike.upSpeed();s1.bike.upSpeed();s1.bike.upSpeed();s1.bike.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(s1.calSum() + ":" + s1.calAvg());
		
		try(ObjectOutputStream oout = 
				new ObjectOutputStream(
						new FileOutputStream("dir1/bread.object"))){
			//oout.writeObject(s1);
			System.out.println("Save OK");
				
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
//宣告該列別 加入implements Serializable  實現可系列化的介面
class Student implements Serializable {
	//如果不要全部序列化 加上transient修飾字
	transient int ch;
	int eng, math;
	Bike bike;
	Student(int ch,int eng,int math, Bike bike){
		this.ch=ch; this.eng=eng; this.math=math;
		this.bike = bike;
	}
	int calSum() {
		return ch +eng + math;
	}
	double calAvg() {
		return calSum()/3.0;
	}
}