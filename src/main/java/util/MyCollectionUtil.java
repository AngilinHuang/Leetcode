package util;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import model.TreeNode;

public class MyCollectionUtil {
	
	public static TreeNode createBinaryTreeByArray(Integer[] array,int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2*index+1);
            tn.right = createBinaryTreeByArray(array, 2*index+2);
            return tn;
        }
        return tn;
    }

	public static <T> boolean listEqualsArray(List<T> list1, T[] array) {
		if(list1.size()!=array.length) {
			return false;
		}
		List<T> list2 = Arrays.asList(array);
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
	
    public static <T> boolean setEquals(Set<T> set1, Set<T> set2) {
    	if(set1.size()!=set2.size()) {
    		return false;
    	}
		return set1.containsAll(set2)&& set2.containsAll(set1);
	}
}
