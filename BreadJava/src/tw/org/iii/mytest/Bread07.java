package tw.org.iii.mytest;

public class Bread07 {
	  //判斷式 if else
	  //java.lang裡面MATH的randomd（亂數）會回傳double 大於或等於0.0 小於1.0 (不會是1) 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int score = (int)Math.random()*101; 因先算int int為0 所以算出來是0分
		int score = (int)(Math.random()*101); //101是有0~100
		System.out.println(score);
		
		//骰子的code
		int score1 = (int)(Math.random()*6)+1; //大樂透把6改成49
		System.out.println(score1);
		
		//學生骰成績的code
		int score2 = (int)(Math.random()*40)+30; 
		System.out.println(score2);
		
		
		if (score1 >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("DOWN");
		}	
		
		if (score>= 90) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
			score = 58; //印完B之後 不會印出Ｅ
		}else if(score >= 70) {
			System.out.println("C");
		}else if(score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		   }
		 System.out.println("after:" + score);
	}	

	}

		


