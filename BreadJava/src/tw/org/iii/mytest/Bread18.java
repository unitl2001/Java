package tw.org.iii.mytest;

public class Bread18 {
			//多維陣列
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = new int [2][3];
		int [][] b = new int [2][];
		b[0] = new int [3];
		b[1] = new int [2];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println("-----");
		//尋訪陣列 for each 
		int[] c = {1,3,4,7,3};
		for(int brad: c) {
			System.out.println(brad);
		}
		System.out.println("-----");
		for (int[]bb:b) {
			for (int bbb:bb) {
				System.out.print(bbb + " ");
			}
			System.out.println();
		}
		//用一維的陣列觀念去看 所以a有兩個 樹狀圖 a-0 a-1
//		System.out.println(a.length);
	}

}
