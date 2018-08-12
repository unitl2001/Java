package tw.org.iii.mytest;

import java.util.Random;
import java.util.Scanner;

public class PokeV3 {
		//Homework 不用檢查機制的洗牌

		public static void main(String[] args) {
			Random random = new Random();

			int number = 0;;
			int poke[] = new int[52];
			boolean b;

			for(int i=0;i<52;i++)
			{
			b = true;
			while(b) {
			b = false;
			number = random.nextInt(52)+1;
			for(int j=0;j<poke.length;j++) {
			if(poke[j]==number) {
			b = true;
			}
			}
			}
			poke[i] = number;
			System.out.printf("array[%d]=%d\n",i,number);
			}
			}

			}