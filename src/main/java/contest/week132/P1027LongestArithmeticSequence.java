package contest.week132;

/**
 * Given an array A of integers, return the length of the longest arithmetic subsequence in A.
	Recall that a subsequence of A is a list A[i_1], A[i_2], ..., A[i_k] with 0 <= i_1 < i_2 < ... < i_k <= A.length - 1, and that a sequence B is arithmetic if B[i+1] - B[i] are all the same value (for 0 <= i < B.length - 1).
 * 
 * 2 <= A.length <= 2000
	0 <= A[i] <= 10000
 *
 * @author angilin
 *
 */
public class P1027LongestArithmeticSequence {
	
	public int longestArithSeqLength(int[] A) {
		int longestLength = 0;
        for(int i=0;i<A.length;i++) {
        	int[] array = new int[A.length-1-i];
        	for(int j=i+1;j<A.length;j++) {
        		array[j-i-1]=A[j]-A[i];
        	}
        	
        	for(int k=0;k<array.length;k++) {
        		int length=1;
        		int base = array[k];
        		for(int l=k+1;l<array.length;l++) {
        			if(array[l]==base*(length+1)) {
        				length++;
        			}
        		}
        		if(length+1>longestLength) {
        			longestLength = length+1;
        		}
        	}
        	//System.out.println(Arrays.toString(array));
        }
        return longestLength;
    }

}
