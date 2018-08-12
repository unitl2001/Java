package tw.org.iii.mytest;

import java.util.Collections;
import java.util.LinkedList;

public class PokerV4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> poker = new LinkedList<>();
		for (int i=0; i<52; i++) {
			poker.add(i);
		}
		Collections.shuffle(poker);
		for (Integer i : poker) {
			System.out.println(i);
		}
	}

}
