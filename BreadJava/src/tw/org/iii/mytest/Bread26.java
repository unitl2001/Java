package tw.org.iii.mytest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//利用這個類別 執行 做出Bread26的物件實體
//public class Bread26 {是object 因為object空空 所以沒有
public class Bread26 extends JFrame{//父類別無傳參數建構式
	//利用JButton宣告b1 b2有按鈕
	private JButton b1, b2;
	//加自己的建構式
	public Bread26() {
		//標題 利用super
		super("偶的視窗");
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		
		/*Component
		b1.setLocation(100, 100);
		*沒看到 所以要add add 是JFrame的父類別 但出現卻很小 add可以有很多個
		*/add(b1);
		//set 只有能有一個 manager介面＝吻合規格(Interface)的那個東西
		//FlowLayout只需要這個物件實體
		//靠右邊參數 FlowLayout.RIGHT
		//水瓶間隔 CENTER,80,10
		setLayout(new FlowLayout(FlowLayout.CENTER,80,10));
		add(b1);add(b2);
		
		b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok");
		}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("ok2");
			}
		});
		
		
		
		//System.out.println("Bread"); 
		//初始化 視窗初始話可以透父類別的初始化來使用 因為是JFrame裡面的 所以可以直接用setSize指令
		//看不到
		setSize(640, 480);
		//visible 看到視窗 按叉叉不代表結束 該物件實體還存著
		setVisible(true);
		//關閉就離開
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	//單一視窗程式
	public static void main(String[] args) { //執行(點從這裡開始)
		//Bread26 obj = new Bread26();
		//obj可以不寫 直接new 
		new Bread26();
		//JFrame 視窗物件
//		java.lang.Object
//		java.awt.Component
//		java.awt.Container
//		java.awt.Window
//		java.awt.Frame
//		javax.swing.JFrame
//		繼承關係不用相同package 看到final類別不用繼承因為已經中止了
	}

}
