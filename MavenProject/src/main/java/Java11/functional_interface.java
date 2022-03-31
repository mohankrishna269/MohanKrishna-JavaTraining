package Java11;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class functional_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(10,20,30);
		Function<Integer,Integer> funref=(i)->{
			return i*2;
		};
		Stream s=list.stream();
		Stream s1=s.map(funref);
		list.stream().map(funref).map(i->i*2).filter(x->x<10).forEach(System.out::println);
		s1.forEach(System.out::println);
		
		

	}

}
