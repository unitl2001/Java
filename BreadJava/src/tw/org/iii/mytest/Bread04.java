package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class Bread04 {
	//api看javax.swing 類別"JOptionPane/static String"
	//static 與物件無關 可直接呼叫類別名稱
	 			//跳出視窗
	//api看java.lang   integer的類別parseInt
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = JOptionPane.showInputDialog("Input a number1");
		String a2 = JOptionPane.showInputDialog("Input a number2");
		System.out.println(a1 + " : " + a2);
		
		int i1 = Integer.parseInt(a1);
		int i2 = Integer.parseInt(a2);
		
		//例子：除法算數得出來的數值要有六個小數點
		int r1 = i1 / i2;
		int r2 = i1 % i2;
		System.out.println(i1 + " / " + i2 + " = " + r1 + "......" + r2);
	}

}
