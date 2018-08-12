package tw.org.iii.mytest;

import java.util.Arrays;

public class PokeV5 {
		//洗牌發牌到4個玩家 理牌
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
			//System.out.println(poker[i]);
		
		}
		System.out.println("-------");
//		玩家有4個人 一個人有13張
		int[][] players = new int [4] [13];
		for (int i=0; i<poker.length; i++) {
			//[i%4]4的餘數 [i/4]4的商數
			players[i%4][i/4] = poker[i];
		}
		//新增牌的花色數字
		String[] suits = {"黑桃","紅心","方塊","梅花"};
		String[] values = {"A","2","3","4","5","6",
				"7","8","9","10","J","Q","K"};
//		for (int v : players[0]) {
//			char[] v;
//			System.out.println(v);
			//players是變數命名
		for (int[] player : players) {
			//排序 看java api
			Arrays.sort(player);
			for(int card : player) {
				//System.out.print(card + " ");
				System.out.print(suits[card/13]+ values[card%13] + "  ");
			}
			System.out.println();
		}
		
		}

	}

