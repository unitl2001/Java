package tw.org.iii.mytest;

public class Bread12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本型別switch(byte short char int)可以放
		//字串string可以放
		byte a = 10; //不能寫資 因為他的16進位超過了byte
		//int a = 10;  //int 可以寫資
		//short a = 10;
		//char a = 97; 
		//long a = 10;  不能放switch
		//float a = 10; 不能放switch
		//double a = 10; 不能放switch
		//bollean a 10; 不能放switch
		//String a = "Bread";
		switch(a) {
		case 1: System.out.println("1"); break;
		case 10: System.out.println("B"); break;
		case 'a': System.out.println("a"); break;
		case 'A': System.out.println("A"); break;
		//Bread 已經變常數了
		//case "Bread": System.out.println("A"); break;
		default: System.out.println("D"); break;
		}
	}

}
