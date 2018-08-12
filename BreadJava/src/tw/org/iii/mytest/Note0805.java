package tw.org.iii.mytest;

public class Note0805 {

	// api java.lang (看api 有無 無傳參構建構式 跟有無final)
	/* concat 傳回的原內容不會更改
	   hascode 可以用來快速判別兩個物件是否為不同的物件
	   toString
	   如果字串內容常變更 請使用StringBuffer or StringBuilder
	   這兩個沒有override equals方法
	   兩者的差異
	   StringBuffer 早期1.0 是處理字串為主 會改變,異動 return回來會是相同的物件實體
	   StringBuilder 1.5出現 用來替代StringBuffer 但使用多重執行序不安全
		Bread30
		相同方法名稱 稱為overload 但參數類不一樣 有可能繼承
		父類別 參數一樣 但要改良稱為override 前提要大於等於父類別
		建構式是初始化的動作
		物件實體是用new做出來的
		繼承表現出多型 
		1.透過extends父類別來表現
		2.強迫
		
	*/ 
}
