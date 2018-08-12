package tw.org.iii.mytest;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//類別是在設計一個物件的藍圖
public class MyPanelV2 extends MyPanel {
	public MyPanelV2() {
		//如果只有用super()會變綠色 但位置不會變
		//super ();
		
		super(100,100);
		//寫在類別中的類別
		addMouseListener(new MyMouseListener());
	}
	
	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("B");
			color = Color.GREEN;
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
