package tw.org.iii.mytest;

public class Bread03 {
		//api看java.lang "double"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//浮點數不是值 本身是為double
		float f1 = 1.2f; //1.2 =>double; 像12 => int
		double s1 = 12.3;
		
		f1++;
		System.out.println(f1);
		f1 += 10;
		System.out.println(f1);
		
		//int a1 = 10;
		long a1 = 10; //(改為long )
		//int a3 = a1 + f1; // int + float => float(float)
		//long a3 = a1 + f1; 也要改為float
		float a3 = a1 + f1;		
		
		
	}

}
