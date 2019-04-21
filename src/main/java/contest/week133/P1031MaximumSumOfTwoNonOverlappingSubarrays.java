package contest.week133;


/**
 * Given an array A of non-negative integers, return the maximum sum of elements in two non-overlapping (contiguous) subarrays, which have lengths L and M.  (For clarification, the L-length subarray could occur before or after the M-length subarray.)
Formally, return the largest V for which V = (A[i] + A[i+1] + ... + A[i+L-1]) + (A[j] + A[j+1] + ... + A[j+M-1]) and either:
0 <= i < i + L - 1 < j < j + M - 1 < A.length, or
0 <= j < j + M - 1 < i < i + L - 1 < A.length.
 * 
 * L >= 1
M >= 1
L + M <= A.length <= 1000
0 <= A[i] <= 1000
 * 
 * @author angilin
 *
 */
public class P1031MaximumSumOfTwoNonOverlappingSubarrays {
	
	public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int[] sumL = new int[A.length-L+1];
        int[] sumM = new int[A.length-M+1];
        int result = 0;
        
        for(int i=0;i<A.length;i++) {
        	if(i<A.length-L+1) {
        		for(int j=0;j<L;j++) {
            		sumL[i] = sumL[i]+A[i+j];
            	}
        	}
        	if(i<A.length-M+1) {
        		for(int j=0;j<M;j++) {
            		sumM[i] = sumM[i]+A[i+j];
            	}
        	}
        }
//      System.out.println(Arrays.toString(sumL));
//      System.out.println(Arrays.toString(sumM));
        
        for(int i=0;i<sumL.length;i++) {
        	for(int j=0;j<sumM.length;j++) {
        		//假设i=5,L=3,M=2    j的不可用范围  j=4 5 6 7
        		//假设i=0,L=3,M=2    j的不可用范围  j=0 1 2
        		if(j>=i+L || j<=i-M) {
            		int temp = sumL[i] + sumM[j];
        			if(temp>result) {
        				result = temp;
        			}
        		}
        	}
        }
        return result;
    }
}
