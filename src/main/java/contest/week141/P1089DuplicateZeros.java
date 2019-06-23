package contest.week141;


import java.util.*;


/**
 * 
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written.
Do the above modifications to the input array in place, do not return anything from your function.
 * 
 * 1 <= arr.length <= 10000
0 <= arr[i] <= 9
 * 
 * @author angilin
 *
 */
public class P1089DuplicateZeros {
	
	public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==0) {
        		if(i+1<arr.length) {
        			for(int j=arr.length-1;j>i;j--) {
            			arr[j]=arr[j-1];
            		}
        		}
        		i++;
        	}
        }
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		new P1089DuplicateZeros().duplicateZeros(arr);
		System.out.println(Arrays.toString(arr));
	}
}
