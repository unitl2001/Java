package tw.org.iii.mytest;

public class PokeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] poker = new int [52];
		
		//對照v1把boolean isRepeat 跟 int temp 放到外面
		//i-- 去掉
		boolean isRepeat;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
			 temp= (int)(Math.random()*52);
			
			
			//檢察機制
		isRepeat= false;
		for (int j=0; j<i; j++) {
			if (poker[j] == temp) {
				break;
			}
		}
		}while (isRepeat);
			poker[i] = temp;
			System.out.println(poker[i]);
		
		}
		}


	}


