package tw.org.iii.mytest;

import java.io.File;

public class Bread44 {
	//IO
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//window第一個分號;用在path mac是: window的separator是\ mac是/
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		//以下方法是用在windows解決方法	
		//File dir1 = new File("finder:/下載目錄/test1");
		//你在哪裏一個. 本目錄 兩個.上一層 這個.是本機的目錄
		File dir1 = new File("./dir3");
		//不存在有兩個問題1.字串 2.畫兩個斜線\\ 3.也可以用別的系統方式/
		//System.out.println(dir1.exists());
		System.out.println(dir1.exists());
		// /根 c:\ d:\多根
		File[] roots = File.listRoots();
		for(File root : roots) {
			System.out.println(root.getAbsolutePath());
		}
	}

}
