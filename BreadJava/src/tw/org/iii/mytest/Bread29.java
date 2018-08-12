package tw.org.iii.mytest;

public class Bread29 {
	//	轉型(強制)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//obj1被宣告為291 一但宣告291 能呼叫的方法 只有291
		//宣告看class那些
		//你宣告是你所能呼叫的東西 只有那些class
		//能不能呼叫是看你被宣告為何 如何執行看你骨子
		Bread291 obj1 = new Bread291();
		obj1.m1();
		Bread291 obj2 = new Bread292();
		obj2.m1();
		//obj是子類別 obj2 表面為父類別骨子裡是子類別 需要強制轉型
		//如果不要用new 就用()obj2強制轉型
		Bread292 obj3 = (Bread292)obj2; // OK
		obj3.m1();
		obj3.m2();
		System.out.println(obj2 == obj3);
		
		//instance 是物件實體
		//進行強制轉時 用instanceof 是在問你是不是物件實體
		//System.out.println(obj1 instanceof Bread292);
		if (obj1 instanceof Bread292) {
		//291無法被轉換成292轉型失敗 在編譯時期可以 但在Runtime是轉型失敗
		Bread292 obj4 = (Bread292)obj1;//語法過關 但出現RuntimeException
	}else {
		System.out.println("xx");
	}
		
		Bread294 obj5 = new Bread294();
		//考認證：要能強制轉型的前提 要有直系 所以obj5無法強制轉型obj6 所以編譯失敗
		//Bread292 obj6 = (Bread292)obj5; //=> compile error 編譯時期出錯
	}

}

class Bread291{
	void m1 (){
		System.out.println("Bread291:m1()");
		}
	}
//類別292 繼承(extends)Bread291 override改良ㄉ291
class Bread292 extends Bread291{
	//m1 是override
void m1 (){
	System.out.println("Bread292:m1()");
	}
void m2(){}
}
class Bread293 extends Bread292{void m3(){}}
//294是獨立的
class Bread294{}


//用電話簿製作客戶資料 1類別 客戶 供應商 業務 全都繼承聯絡人
//如果要看詳細資料 就用instanceof 進行強制轉型 想看什麼