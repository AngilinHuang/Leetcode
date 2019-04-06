package problem;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import util.MyCollectionUtil;

public class P1018Test {
	
	@Test
	public void test1() {
		int[] A = {0,1,1,1,1,1};
		List<Boolean> result = new P1018BinaryPrefixDivisibleBy5().prefixesDivBy5(A);
		Boolean[] check = {true,false,false,false,true,false};
		assert MyCollectionUtil.listEquals(result, Arrays.asList(check));
	}
	
	
	@Test
	public void test2() {
		int[] A = {1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0};
		List<Boolean> result = new P1018BinaryPrefixDivisibleBy5().prefixesDivBy5(A);
		Boolean[] check = {false,false,true,false,false,false,false,false,false,false,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,true,false,false,false,true,false,false,true,false,false,true,true,true,true,true,true,true,false,false,true,false,false,false,false,true,true};
		assert MyCollectionUtil.listEquals(result, Arrays.asList(check));
	}
}
