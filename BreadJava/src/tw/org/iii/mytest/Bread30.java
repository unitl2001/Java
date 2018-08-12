package tw.org.iii.mytest;

public class Bread30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法3
		Bread302 obj1 =new Bread302();
		byte b1 = 2;
		obj1.m1(b1);
		
		//obj1.m1((byte)2); 呼叫byte第二種方法
		Bread301 obj2 = new Bread301();
		obj2.m1(1,2,3);
	}

}
/*例子1
class Bread301{
	//m1 override 所以物件型別 都要一樣override 基本型別要一樣
	//在物件型別override 功能要大於等於父類別
	Object m1() {
		//return傳回執行點
		return new Object();
	}
}
class Bread302 extends Bread301 {
	String m1() {
		return "Bread";
	}
}
*/
/*方法2
class Bread301{
	//方法名稱一樣 
	int m1(int a) {
		//return傳回執行點
		return new Object();
	}
}
class Bread302 extends Bread301 {
	String m1() {
		return "";
	}
*/

class Bread301{
	
	int m1(int a) {
		System.out.println("A1");
		return 1;
	}
	void sayYa(String[] name) {
		for (String name: names) {
			System.out.println(name +", Ya!");
		}
	}
	
	void sayYa(String...names) { //不定個數的參數
		System.out.println("A");
	}
	void m1(int a, int b) {
		System.out.println("A2");
}
	void m1(int a, int b, int c) {
		System.out.println("A3");
	}
class Bread302 extends Bread301 {
	String m1(byte a) {
		System.out.println("B");
		return "a";
	}
}
}