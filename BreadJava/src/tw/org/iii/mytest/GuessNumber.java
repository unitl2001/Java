package tw.org.iii.mytest;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//繼承他 是建構式
public class GuessNumber extends JFrame{
	//這個類別擁有什麼東西
	private JButton guess;
	private JTextField input;
	private JTextArea hist;
	private String answer = createAnswer();
	private int counter;
	
	//呼叫爸爸
	public GuessNumber() {
		super("猜數字遊戲");
		
		//1.new出來 初始化物件實體
		guess = new JButton("猜");
		input = new JTextField();
		hist = new JTextArea();
		
		//框框內的大小
		input.setFont(new Font("Default", Font.PLAIN, 28));
		//設字型大小 粗體加斜體
		hist.setFont(new Font("Default", Font.BOLD + Font.ITALIC, 28));
		
		//3.setLayout new BorderLayout 設置版面
		setLayout(new BorderLayout());
		add(hist, BorderLayout.CENTER);
		//4.隔間是區域變數 只有在初始化時表現出功能
		JPanel top =new JPanel(new BorderLayout());
		//由top來add 但還看不到
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		//最外面的
		add(top, BorderLayout.NORTH);

		//addActionListener新增一個動坐傾聽者由()裡面的聽 是一個事件的觸發
				guess.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						doGuess();
							
						}
				});
		//2.有一個殼
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		
			}
					
				

		
	
		//按下按鈕 檢查幾Ａ幾Ｂ
	void doGuess() {
		counter++;
		String result = checkAB();
		
		//append 補後面 換列用\n
		hist.append(counter + " . " + input.getText() + "=>" + result + "\n");
		//抹去
		input.setText("");
		System.out.println(answer);
		//equls再比對字串
		if(result.equals("3A0B")) {
			//對話框如果跟parents沒關係 用null 如果本人是視窗 就用this
			JOptionPane.showMessageDialog(null, "恭喜老爺,賀喜夫人");
		
		} else if (counter ==10) {
		JOptionPane.showMessageDialog(null, "Loser" + "  " + answer);	
		}
		
	}
	
	//檢查幾Ａ幾Ｂ
	String checkAB() {
		int a, b; a = b = 0;
		//inputGuess人家輸入的你會知道 guess 不會跟button混在一起
		String Guess= input.getText();
		//檢查 假設answer:471 input:143 用迴圈
		//i是用來尋訪
		//下面的陣列 因為是猜三個數字所以 用三個陣列
		//matches依要判斷(String)的物件為主
		if (Guess.matches("^[0-9]{3}$")) {
			for (int i=0; i<Guess.length(); i++) {
				
				/*如果if (guess中的第i碼 == answer中的第i碼) {
						a++;
				}else if (guess中的第i碼存在於a中); {
						 b++;
				*///}
					if (Guess.charAt(i) == answer.charAt(i)) {
						a++;
					}else if(answer.indexOf(Guess.charAt(i)) != -1) {
						b++;
					}
				}
				return a + "A" + b + "B";
		}else  {
		return "result";
		}
		//return "1A2B";
	}
	//謎底
	String createAnswer() {
			int[] poker = new int [10];
			
			//對照v1把boolean isRepeat 跟 int temp 放到外面
			//i-- 去掉
			boolean isRepeat;
			int temp;
			for (int i=0; i<poker.length; i++) {
				do {
				 temp= (int)(Math.random()*10);
				
				
				//檢察機制
			isRepeat= false;
			for (int j=0; j<i; j++) {
				if (poker[j] == temp) {
					break;
				}
			}
			}while (isRepeat);
				poker[i] = temp;
				System.out.println(poker[i]);
			
			}
		 
		return "" +poker[0] + poker[1] + poker[2];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//先命名一個新的 產生該列別
		new GuessNumber();

	}

}
