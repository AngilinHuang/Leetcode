package problem;

import java.util.ArrayList;
import java.util.List;


/**
 * Given an array A of 0s and 1s, consider N_i: the i-th subarray from A[0] to A[i] interpreted as a binary number (from most-significant-bit to least-significant-bit.)
	Return a list of booleans answer, where answer[i] is true if and only if N_i is divisible by 5.

	Example 1:
	Input: [0,1,1]
	Output: [true,false,false]
	Explanation: 
	The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.  Only the first number is divisible by 5, so answer[0] is true.
 *
 *  1 <= A.length <= 30000
    A[i] is 0 or 1
 */
public class P1018BinaryPrefixDivisibleBy5 {
	
	
	public List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> result = new ArrayList<>(A.length);
		long lastNumber = 0;
		for(int i=0;i<A.length;i++) {
			lastNumber = (lastNumber*2 + A[i])%10;
			if(lastNumber==0 ||lastNumber==5) {
				result.add(true);
			}
			else {
				result.add(false);
			}
		}
		return result;
    }
	
	
	
}
