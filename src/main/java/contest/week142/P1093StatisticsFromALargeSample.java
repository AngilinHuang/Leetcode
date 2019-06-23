package contest.week142;


import java.util.*;


/**
 * We sampled integers between 0 and 255, and stored the results in an array count:  count[k] is the number of integers we sampled equal to k.
Return the minimum, maximum, mean, median, and mode of the sample respectively, as an array of floating point numbers.  The mode is guaranteed to be unique.
(Recall that the median of a sample is:
The middle element, if the elements of the sample were sorted and the number of elements is odd;
The average of the middle two elements, if the elements of the sample were sorted and the number of elements is even.)
 * 
 * count.length == 256
1 <= sum(count) <= 10^9
The mode of the sample that count represents is unique.
Answers within 10^-5 of the true value will be accepted as correct.
 * 
 * @author angilin
 *
 */
public class P1093StatisticsFromALargeSample {

    public double[] sampleStats(int[] count) {
    	double[] result = new double[5];
    	boolean min = false;
    	//最小 最大  平均  中位 最多？
    	long sum = 0;
    	int totalCount = 0;
    	int maxCount = 0;
    	for(int i=0;i<count.length;i++) {
    		int tempCount = count[i];
    		if(tempCount>0 && !min) {
    			result[0] = (double)i;
    			min = true;
    		}
    		if(tempCount>0) {
    			result[1] = (double)i;
    		}
    		if(tempCount>maxCount) {
    			maxCount = tempCount;
    			result[4] = (double)i;
    		}
    		sum = sum + i*tempCount;
    		totalCount = totalCount + tempCount;
    	}
    	result[2] = (double)sum/(double)totalCount;
    	
    	if(totalCount%2==0) {
    		int target = totalCount/2;
    		int temp = 0;
    		boolean targetVal1Flag = false;
    		int targetVal1 = 0;
    		int targetVal2 = 0;
    		for(int i=0;i<count.length;i++) {
    			temp = temp+count[i];
    			if(temp>=target && !targetVal1Flag) {
    				targetVal1 = i;
    				targetVal1Flag = true;
    			}
    			if(temp>=(target+1)) {
    				targetVal2 = i;
    				break;
    			}
    		}
    		result[3] = ((double)targetVal1 + (double)targetVal2)/2;
    	}
    	else {
    		int target = totalCount/2+1;
    		int temp = 0;
    		for(int i=0;i<count.length;i++) {
    			temp = temp+count[i];
    			if(temp>=target) {
    				result[3] = (double)i;
    				break;
    			}
    		}
    	}
    	return result;
    }
    
    
	public static void main(String[] args) {
		int[] count = {0,1,3,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		// [1.00000,3.00000,2.37500,2.50000,3.00000]
		System.out.println(Arrays.toString(new P1093StatisticsFromALargeSample().sampleStats(count)));
		
		
		int[] count2 = {0,4,3,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		//[1.00000,4.00000,2.18182,2.00000,1.00000]
		System.out.println(Arrays.toString(new P1093StatisticsFromALargeSample().sampleStats(count2)));
	}
}
