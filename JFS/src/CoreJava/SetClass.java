package CoreJava;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(40);
		s.add(50);
		Set<Integer> Uni=new LinkedHashSet<Integer>(set);
		Uni.addAll(s);
	
		
		for(Integer i:Uni) {
			System.out.println(i);
		}

	}

}
