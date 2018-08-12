package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;


public class Bread38 extends JFrame{
	//可更改第幾代MyPanel 
	private MyPanel myPanel;
	
		public Bread38() {
			setLayout(new BorderLayout());
		}
		//可更改第幾代MyPanel 
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
			addWindowListener(new MyLinsterner());
			
			setSize(640, 480);
			setVisible(true);
		}
		public static void main(String[] args) {
			new Bread38();
}

class  MyLinsterner extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("closing");
		System.exit(0); 
	}
}

class MyWindowListener implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("opened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("closing");
		System.exit(0); //command line return value; 0 => normal; non-zero => error
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("closed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("icon");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("deicon");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("activated");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("dectivated");
	}
}