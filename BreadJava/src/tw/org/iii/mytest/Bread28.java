package tw.org.iii.mytest;

public class Bread28 {
	//字串StringBuffer 
	//StringBuffer建構式 其傳回的物件實體是新的
	//看物件的api 1.要看有無傳參數建構式 2.看有沒有final
	//StringBuffer 傳回來的是相同的物件實體

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer();
		//sb1印物件型別toString 基本型別印其質
		System.out.println(sb1);
		//capacity 印出16
		System.out.println(sb1.capacity());
		//長度為0
		System.out.println(sb1.length());
		//append 會傳回StringBuffer
		StringBuffer sb2 = sb1.append("123456789012345");
		System.out.println("sb1" + sb1);
		System.out.println("sb1" + sb1.capacity());
		System.out.println("sb1" + sb1.length());
		System.out.println("sb2" + sb2);
		System.out.println("sb2" + sb2.capacity());
		System.out.println("sb2" + sb2.length());
		System.out.println(sb1 == sb2);
		
		
		sb1.append("6");
		System.out.println("sb1" + sb1);
		System.out.println("sb1" + sb1.capacity());
		System.out.println("sb1" + sb1.length());
		
		
		sb1.append("7");
		System.out.println("sb1" + sb1);
		System.out.println("sb1" + sb1.capacity());
		System.out.println("sb1" + sb1.length());
		
		//今天看api 呼叫該方法會傳回原物件實體 其目的是讓code更精簡
		//sb1.append("8")return sb1 所以可以這樣寫sb1.append("8")
		//replace傳回自己 然後
		//相當於物件實體 連續呼叫
		sb1.append("8").replace(0, 3, "Bread").append("ok");
		
		

		
		//如何比對 StringBuffer 字串內容一模一樣
		StringBuffer sb3 = new StringBuffer("Bread");
		StringBuffer sb4 = new StringBuffer("Bread");
		
		//他沒有override 所以出來的是false
		System.out.println(sb3.equals(sb4)); //=> no override => same as ==
		//如果字串出來是不用toString
		//sb3.toString().equals(sb4) 這樣出來是false 因為他要型別不同 sb4是StringBuffer 
		//所以無法轉 如果字串出來比對 不用toString
		System.out.println(sb3.toString().equals(sb4.toString()));
		//StringBurffer跟String 並無法型別轉換 雖然師出同門object但卻沒有直系
		Bike b1 = new Bike();
		System.out.println(sb3.toString().equals(b1));
	


	//設定成績 呼叫的方法才能這樣做
	Bread281 obj1 = new Bread281();
	System.out.println(obj1.calSum());
	obj1.setS1(12)
		.setS2(34)
		.setS3(48);
	//calSum總成績
	System.out.println(obj1.calSum());
	}
}
class Bread281 {
	int s1, s2, s3;
	Bread281 setS1(int s1){this.s1=s1;return this;}
	Bread281 setS2(int s2){this.s2=s2;return this;}
	Bread281 setS3(int s3){this.s3=s3;return this;}
	int calSum() {return s1+s2+s3;}
}

