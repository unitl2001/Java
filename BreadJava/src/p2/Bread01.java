package p2;

public class Bread01 {
	void m1() {
		//叫不到
		Bread02 obj1 = new Bread02();
	}
}
//相同pakeage才看得到Bread02
class Bread02 {
	//才能存取的到裡面
	public void m1() {
		
	}
}