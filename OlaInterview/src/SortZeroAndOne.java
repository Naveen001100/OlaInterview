import java.util.ArrayList;
import java.util.List;

public class SortZeroAndOne {

	public static void swap(List <Integer>l,int i,int j) {
		int temp;
		temp = l.get(i);
		l.set(i,l.get(j));
		l.set(j,temp);
	}
	
	public static List<Integer> sortNumber(List <Integer> l) {
		int j = l.size()-1;
		for(int i=0;i<l.size();i++) {
			while(l.get(i)!=1) {
				i++;
			}
			while(l.get(j)!=0) {
				j--;
			}
			if(i<j) {
				swap(l,i,j);
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		List <Integer>l  = new ArrayList<>();
		l.add(0);
		l.add(1);
		l.add(0);
		l.add(0);
		l.add(1);
		l.add(0);
		l.add(0);
		l.add(1);
		System.out.println(sortNumber(l));
	}
}
