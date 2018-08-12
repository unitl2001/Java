package tw.org.iii.mytest;

import java.io.IOException;
import java.text.ParseException;

public class Bread43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b1 = new Bird();
		//RuntimeException try catch Exception 可以不做
		//如果是20行void的那一列是Exception 就要做try catch 
		try {
		b1.setleg(2);
		}catch(ParseException e) {
		
		}catch(IOException e) {
			
		}
		}
	}


//＊單一例外被拋出用throw 宣告拋出例外用throws 宣告很多個用,隔開
class Bird {
	private int leg;
	//void也要再寫一個拋出(很大) 可以寫成RuntimeException 但下面也要寫
	void setleg(int leg) throws ParseException, IOException {
		if(leg<0)  {
			//拋出一個例外 可以寫成RuntimeException但當上面也寫成RuntimeException
			//這裡不能寫Exception 因為不能小包大
			throw new ParseException("xxx",3);
		}else if (leg>2){
			throw new IOException();
		}else {
		this.leg = leg;
		}
	}
	class BirdV2 extends Bird{
		//override的例外 要比爸爸小 要比爸爸少 真的要超過只要換個名字就不是override
	void setLeg(int leg) throws ParseException, IOException {
		// TODO Auto-generated method stub
		
	}
	
		
	
}
}