package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditer extends JFrame{
	private JButton open,save, saveas, newfile;
	private JTextArea editor;
	private File nowFile = null;
	
		public MyEditer() {
			super("超強記事本");
			setLayout(new BorderLayout());
			
			JPanel top = new JPanel(new FlowLayout());
			newfile = new JButton("New"); top.add(newfile);
			open = new JButton("open"); top.add(open);
			save = new JButton("save"); top.add(save);
			saveas = new JButton("saveas"); top.add(saveas);
			
			
			add(top, BorderLayout.NORTH);
			editor = new JTextArea();
		
			JScrollPane jsp = new JScrollPane(editor);
			add(jsp, BorderLayout.CENTER);
			
			open.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					openFile();
				}
			});
			
			save.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					saveFile();
			}
				
				
				

			});
			
		
				
		}
		
				
				private void saveFile() {
					// TODO Auto-generated method stub
					if (nowFile != null) {
						try {
							editor.write(new FileWriter(nowFile));
							JOptionPane.showMessageDialog(this, "Save OK");
						} catch (IOException e) {
							System.out.println(e);
						}
					
				}else {
					
				}
			
				
		
			
				setSize(640, 480);
				setVisible(true);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

			


		private void openFile() {
			JFileChooser jFileChooser = new JFileChooser();
			if (jFileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
				nowFile = jFileChooser.getSelectedFile();
				if(nowFile.isFile() && nowFile.canRead()) {
					readFile();
				}else {
					nowFile = null;
				}
			}
		}
		
		
	private void readFile() {
			// TODO Auto-generated method stub
			try {
				//讀取完 還更新成新的
				editor.setText("");
				FileReader reader = new FileReader(nowFile);
				int len = 0; char[] buf = new char [4096];
				while ((len = reader.read(buf)) != -1) {
					editor.append(new String(buf,0,len));
				}
				reader.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
