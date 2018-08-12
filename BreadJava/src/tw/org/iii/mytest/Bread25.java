package tw.org.iii.mytest;

public class Bread25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		檔名25 public 只能有一個
		//沒傳參數所以會出錯
		Bread251 b1 = new Bread251(2);
		//Bread251 b2 = new Bread251(); 所以這條不能用
		//任何類別 物件實體 他的祖宗八代都存在
		Bread251 b2 = new Bread252();
		
		//equals
		//Bread251的爸爸是Object
		Bread251 b3 = new Bread251(2);
		//字串也是認object為父類別 但其定義在method裡面 有增加功能或改寫
		// 
		System.out.println(b1.equals(b2));
		//因為new ＝＝是相比 所以出來是false
		System.out.println(b1 == b3);
		
		System.out.println(b1 == b3);
		System.out.println(b1.isSame(b3));
		
	}


	}


		//寫了一個類別
		class Bread251 {
			private int a;
			//Bread251 有一個建構式 new出一個實體跑出初始化的動作
			Bread251(int a){
//				用super先把爸爸做出來 不寫已先把無傳物件隱含出來了
//				super();
				this.a = a;
				System.out.println("Bread251()");
			}
		
		
			}

		//方法名稱參數一模一樣所以做override 存取修飾字要大於或等於object 不能小於
		
//		@Override 可以不寫 但在編譯過程也是override
		@Override
//		public int getA() {return a;} //封裝
//		//obj 一定要轉相同型別 但因為改寫(override)了 所以執行出來會是ture
//		public boolean equals(Object obj) {
////			return super.equals(obj);
//			return((Bread251)obj).getA() == a;
//		}
		//單獨寫
		public 
		
		
		
//		任何一個類別都有建構式（不會沒有）
//		但在寫Bread251沒寫時 因為沒有定義 所以找父類別無傳預設的建構式
//		如果自己定義將沒有預設建構式
		
//		宣告Bread252	的父類別為Bread251 但有出錯是因為有先定義super
//		第二代
		class Bread252 extends Bread251 {
			Bread252(){
//				任何第一道敘述句可以不寫就是super
//				但寫了只能是super(其他) 或this(隨便你)
//				但敘述句只能寫在第一道
				// super();
			super(3);
			}
			}
//		第三代
		class Bread253 extends Bread252 {
//			沒有會找爸爸 要找爸爸就參考第二代
		}
		
		