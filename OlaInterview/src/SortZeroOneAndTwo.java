import java.util.ArrayList;
import java.util.List;

public class SortZeroOneAndTwo {
	
	public static List<Integer> sortNumber(List <Integer>l) {
		int med = 0;
		int j = l.size()-1;
		int i = 0;
		int temp;
		while(med<j){
			if(l.get(med)<1) {
				temp = l.get(i);
				l.set(i, l.get(med));
				l.set(med,temp);
				i++;
				med++;
			}else if(l.get(med)==1) {
				med++;
			}else {
				temp = l.get(j);
				l.set(j, l.get(med));
				l.set(med,temp);
				j--;
			}
		}
		return l;
	}

	public static void main(String[] args) {
		List <Integer>l = new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(0);
		l.add(2);
		l.add(1);
		l.add(0);
		l.add(2);
		System.out.println(sortNumber(l));
	}

}
