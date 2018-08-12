package tw.org.iii.mytest;

public class Bread41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0除3=0 10除0 出來的是數值是接近0所以是 無限大infinity
		//0除0=nan(Not a number)
//		double a = 10, b = 3;
//		double c = a/b;
//		System.out.println(c);
		
		//10除0 會出現紅單
		int a = 10, b = 3;
		int c = a/b;
		System.out.println(c);
		int[] d = new int[3];
		
		
		
		try {
		//放13也不會錯因為 在還在[]範圍內 但是錯誤的
		System.out.println(d[3]);
		//被捕捉了放到e 暫時不處理 但有大括號{}繼續處理
		//}catch(ArrayIndexOutOfBoundsException e) {
		//用數學的捕捉 但還是錯誤
//		}catch(ArithmeticException e) {
//		System.out.println("Ooop");
//		}
		
		c = a /b;
		System.out.println(c);
		System.out.println(d[13]);
		//不是數學的交給RuntimeException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Ooop1");
		}catch(ArithmeticException e) {
			System.out.println("Ooop");
				}
		
	
		System.out.println("Game Over");
	}

}

/*try catch 如果是直系血親 處理比較細的擺上面 如果是RuntimeException的直系血親 
*ArithmeticException不能擺在RuntimeException的下面
*或者可以全部用RuntimeException 處理
*/