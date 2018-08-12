package tw.org.iii.mytest;

public class Bread22 {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		*cheakId有冠上static
		*TWId.cheakId("aaa");
		*所以要重新命名一個新的
		*TWId id1= new TWId();
		*id1.m1("aaa");
		*/
		
		
		String a = "A123456789";
		//正規表示法
		/* "^$" 空字串 "^a^$"
		 * "^[A-Z]........$" 用點來代替字母後面的數字
		 * "^[A-Z].{9}$" .{9}重複次數
		 * 
		 */
		//"
		//if (a.matches("^09[0-9].{8}$")) {
		if (a.matches("^[A-Z][12][0-9].{8}$")) {
			System.out.println("ok");
		}else
			System.out.println("XX");
		
//		if (TWId.cheakId("A123456789")) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		
		
		TWId id1 = new TWId();
		TWId id2 = new TWId(true);
		TWId id3 = new TWId(14);
		TWId id4 = new TWId(false, 17);
		TWId id5 = TWId.createTWId("A123456789");
		
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		System.out.println(id5.getId());
		
	}

}




}