package tw.org.iii.mytest;

public class Bread42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	}
		
		//一個完整的try catch 可以沒有catch  不管有沒有拋出例外finally都會被做
		//finally的意義 提早結束的時候 還是會被做
		//1.try catch 2.try finally(可以沒有catch) 3.try catch finally
		static void m1() {
		int a = 10, b = 0;
		try {
			System.out.println(a / b);
		}catch (Exception e) {
			System.out.println("OK");
			return;
		}finally {
			System.out.println("OK2");
		}
		System.out.println("OK3");
	}

}
