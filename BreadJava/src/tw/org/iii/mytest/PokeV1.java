package tw.org.iii.mytest;

public class PokeV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] poker = new int [52];
		for (int i=0; i<poker.length; i++) {
			int temp = (int)(Math.random()*52);
			
			
			//檢察機制
		boolean isRepeat = false;
		for (int j=0; j<i; j++) {
			if (poker[j] == temp) {
				break;
			}
		}
		if (!isRepeat) {
			poker[i] = temp;
			System.out.println(poker[i]);
		}else {
			i--;
		}
		}

	}

}
