package util;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyCollectionUtil {

	public static boolean listEqualsArray(List<Integer> list1, int[] array) {
		if(list1.size()!=array.length) {
			return false;
		}
		List<Integer> list2 = Arrays.stream(array).boxed().collect(Collectors.toList());
		for(int i=0; i<list1.size(); i++) {
			if(!list1.get(i).equals(list2.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	public static <T> boolean listEquals(List<T> list1, List<T> list2) {
		if(list1.size()!=list2.size()) {
			return false;
		}
		for(int i=0; i<list1.size(); i++) {
			if(!list1.get(i).equals(list2.get(i))) {
				return false;
			}
		}
		return true;
	}
	
    public static <T> boolean setEquals(Set<T> set1, Set<T> set2) {
    	if(set1.size()!=set2.size()) {
    		return false;
    	}
		return set1.containsAll(set2)&& set2.containsAll(set1);
	}
}
