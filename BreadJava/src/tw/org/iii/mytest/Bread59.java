package tw.org.iii.mytest;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class Bread59 {

	public static void main(String[] args) {
		try {
		//主機名稱(FQDN) HostName 組成方式 .(小老鼠)所在的Domain
		//InetAddress是要加www
		InetAddress ip = InetAddress.getByName("www.microsoft.com");
		System.out.println(ip.getHostAddress());

		}catch(UnknownHostException e) {
			System.out.println(e);
		}
	}

}
