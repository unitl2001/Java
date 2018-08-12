package tw.org.iii.mytest;

public class Bread19 {
		//whitle 迴圈
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while迴圈進去前 會先做前測動作
		int a = 1;
		while (a<10){
			System.out.println(a++);
		}
		for (;a<10; ) {
			System.out.println(a++);
		//後測試while迴圈 先做在測	
		int b =  1;
		do {
			System.out.println(a++);
		}while (b<10);
		}
	}

}
