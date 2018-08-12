package tw.org.iii.mytest;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import tw.org.iii.mytest.MyPanelV2.MyMouseListener;

public class MyPanelV4 extends MyPanel {
	
		private MouseListener mListener = new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(b);
			}
		};
		
		private MouseListener mListener2 = new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				System.out.println(a);
			}
		};
		
		private int a = 10;
		private int b = 20;
		private int c = 30;
		public MyPanelV4() {
		//super();
		addMouseListener(mListener);
		addMouseListener(mListener2);
		MouseListenerV100 mlistener3 = new MouseListenerV100(this);
		addMouseListener(mlistener3 ) ;
			
			
	}
		public int getc() {return c;}
}

class MouseListenerV100 extends MouseAdapter{
	private MyPanelV4 obj;
	public MouseListenerV100(MyPaneV4 obj) {
		this.obj = obj;
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println(obj.getc());
		obj.repaint();
	}
}
