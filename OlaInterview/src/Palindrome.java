import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Character> c = new LinkedList<>();
		c.add('r');
		c.add('a');
		c.add('d');
		c.add('a');
		c.add('r');
		System.out.println(findPalindrome(c));
	}

	private static boolean findPalindrome(List<Character> c) {
		// TODO Auto-generated method stub
		Stack <Character>st = new Stack<>();
		st.addAll(c);
		Iterator<Character> i = c.iterator();
		while(i.hasNext()) {
			if(i.next()==st.pop())
				continue;
			else
				return false;
		}
		return true;
	}

}
