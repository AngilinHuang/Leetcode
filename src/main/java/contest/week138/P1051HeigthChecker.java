package contest.week138;

import java.util.*;

/**
 * 
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
Return the minimum number of students not standing in the right positions.  (This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)
 * 
 * 1 <= heights.length <= 100
1 <= heights[i] <= 100
 * 
 * @author angilin
 *
 */
public class P1051HeigthChecker {
	
	public int heightChecker(int[] heights) {
        int result = 0;
		List<Integer> list = new ArrayList<>();
		for(int height : heights) {
			list.add(height);
		}
		Collections.sort(list);
		for(int i=0;i<heights.length;i++) {
			if(heights[i]!=list.get(i)) {
				result++;
			}
		}
		return result;
    }
	
	
	
	public static void main(String[] args) {
		int[] heights = {1,1,4,2,1,3};
		//3
		System.out.println(new P1051HeigthChecker().heightChecker(heights));
	}
}
