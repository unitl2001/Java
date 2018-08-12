package tw.org.iii.mytest;

public class Bread15 {
		private static int j;

		//github抓
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//coutinue 繼續下一圈
		for (int i =0; i<10; i++) {
			if (i % 2 == 0) {
				continue;// 
			}
			System.out.println(i);
		}
		System.out.println("----");
		
		brad: // for while do...while 
			for (int i1=0; i1<10; i1++);  {
			for (int j=0; j<10; j++); {
			if (i + j >=10) {
				break brad;
			}
			System.out.println(i + ":" + j);
			}
		}
	}
}
