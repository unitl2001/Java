package tw.org.iii.mytest;

import javax.swing.JOptionPane;

public class Bread08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strYear = JOptionPane.showInputDialog("input a year");
		int year = Integer.parseInt(strYear);
		
		//如果一年365能被4整除
		if(year % 4 == 0) {
			System.out.println("閏年");
		//如果一年365能被100整除
		}else if(year % 100 == 0) {
			System.out.println("閏年");
		//如果一年365能被400整除
		}else if(year % 400 == 0) {
			System.out.println("閏年");
		}else {
			System.out.println("平年");
			
		}
		
	}

}
