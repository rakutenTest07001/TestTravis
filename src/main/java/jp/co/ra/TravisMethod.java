package jp.co.ra;

import java.util.List;
import java.util.stream.Collectors;

public class TravisMethod {
	
	public int add(int a, int b){
		return a+b;
	}
	
	public List<Integer> greatThan10(List<Integer> numbers){
		return numbers.stream().filter(x->x > 10).collect(Collectors.toList());
	}
}
