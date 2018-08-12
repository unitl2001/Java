package tw.org.iii.mytest;

public class TWId {
	
	//private static final String Interger = null;
	//private static boolean ture;
	//private static Object String c2 ;
	private String id;
	static final String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
//	參考Bread25
//	任何第一道敘述句可以不寫就是super
//	但寫了只能是super(其他) 或this(隨便你)
	TWId(){
		this((int)(Math.random()*2)==0);
	}
	TWId(boolean isMale){
		this(isMale,(int)(Math.random()*26));
}
	TWId(int area){
		this((int)(Math.random()*2)==0,area); //==是會傳回true flase
	}
	TWId(boolean isMale, int area){
		//super();
		String i1 = letters.substring(area,area+1);
		String i2 = isMale?"1":"2";
		String newid = i1 + i2 +
				(int)(Math.random()*10) +
				(int)(Math.random()*10) +
				(int)(Math.random()*10) +
				(int)(Math.random()*10) +
				(int)(Math.random()*10) +
				(int)(Math.random()*10) +
				(int)(Math.random()*10) ;
		
		String newid1 = i1.concat(i2)	//傳回字串
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)))
				.concat(String.valueOf((int)(Math.random()*10)));
		for (int i=0; i<=9; i++) {
			if (cheakId(newid1+1)) {
				this.id = newid1 + i;
				break;
			}
		}
		
	}
	/*static不屬於任何一個物件 是類別擁有的 基於分類的要求
    *是功能鍵的東西與物件無關 不能叫物件 只能呼叫static方法
    */
	
	
	//
	private TWId(String id){
		this.id= id;
	}
	//新增拋出例外
	static TWId createTWId(String id)throws Exception {
		if (cheakId(id)) {
			return new TWId(id);
		}else {
			throw new Exception();
			//return null;
		}
	}
	
	static boolean cheakId(String id) {
		//System.out.println("Ok");
		//如何檢查身分證字號
		//1.長度=10 2.第一碼為英文 3.第一碼不是1or2 4.3碼後每個字的數字
		//System.out.println(id.length());
		boolean isRight = false;
		if (id.matches("^[A-Z][12][0-9].{8}$")){
			 
			
			
			int n12 = letters.indexOf(id.charAt(0)) + 10;
			int n1 = n12/10;
			int n2 = n12%10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));//字串變整數

			int sum = n1*1 + n2*9 + n3*8 + n4*7 +n5*6 + n6*5+ 
					n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			isRight =sum % 10 == 0;
		}
		return isRight;
	}
		String getId() {return id;}
		
		boolean isMale() {
			
			return true;
		}
		String getArea() {
			return "台中市";
			
		}
}

//		//擷取字
//		System.out.println(id.charAt(1));
//		System.out.println(id.substring(2,7));
//		String c1 = id.substring(0,1);
//		String c2 ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		int pos = c2.indexOf(c1);
//		return ture;
//	}
//	
//	//物件可以叫static
//	boolean m1(String id) {
//		System.out.println("Ok");
//		return ture;
//		
//	}
//	public char[] getId() {
//		// TODO Auto-generated method stub
//		
//		
//		return null;
//	}
//}
