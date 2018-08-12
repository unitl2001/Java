package tw.org.iii.mytest;

public class Bread27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		//a的記憶體放的是10
		System.out.println(a);
		String str1 = new String("Bread");
		System.out.println(str1);
		//會跑出Bread 原因是字串override 記憶體 所以才傳回Bread
		Bread271 obj1 = new Bread271();
		System.out.println(obj1);
		@SuppressWarnings("hiding")
		//會跑出tw.org.iii.mytest.Bread271@61064425
		//原因是他印出記憶體裡的東西
	
		
		Bread271 obj2 =new Bread271();
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		//因為沒有override 加上字串相比 要用equals不用能＝＝
		System.out.println(obj1.equals(obj2));
		//就算用了equals 得出結果還是false 是因為沒有用override
	}

}
////class這一列是把記憶體override
class Bread271 {
	@Override
	public String toString() {
		return "Bread";
	}
}
