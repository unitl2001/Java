package tw.org.iii.mytest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanelV3 extends Mypanel{
	public MyPanelV3() {
		//super();
		addMouseListener(new MyMouseListener());
	}
	//MyPanelV3 object has-a Inner class
	//要new出來才有意義 
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
		//super.mouseClicked(e);
			System.out.println("OK");
		}


	
		

	}
}
