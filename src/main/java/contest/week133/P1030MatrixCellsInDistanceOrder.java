package contest.week133;

import java.util.*;


/**
 * We are given a matrix with R rows and C columns has cells with integer coordinates (r, c), where 0 <= r < R and 0 <= c < C.
Additionally, we are given a cell in that matrix with coordinates (r0, c0).
Return the coordinates of all cells in the matrix, sorted by their distance from (r0, c0) from smallest distance to largest distance.  Here, the distance between two cells (r1, c1) and (r2, c2) is the Manhattan distance, |r1 - r2| + |c1 - c2|.  (You may return the answer in any order that satisfies this condition.)
 * 
 * 1 <= R <= 100
1 <= C <= 100
0 <= r0 < R
0 <= c0 < C
 * 
 * @author angilin
 *
 */
public class P1030MatrixCellsInDistanceOrder {
	
	public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
		int[][] result = new int[R*C][2];
		int k=0;
		for(int i=0;i<R;i++) {
			for(int j=0;j<C;j++) {
				int[] temp = {i,j};
				result[k] = temp;
				k++;
			}
		}
    	
    	for(int i=0;i<result.length;i++) {
    		for(int j=i;j<result.length;j++) {
    			int ix = (result[i][0]-r0)>0?(result[i][0]-r0):(result[i][0]-r0)*-1;
    			int iy = (result[i][1]-c0)>0?(result[i][1]-c0):(result[i][1]-c0)*-1;
    			int jx = (result[j][0]-r0)>0?(result[j][0]-r0):(result[j][0]-r0)*-1;
    			int jy = (result[j][1]-c0)>0?(result[j][1]-c0):(result[j][1]-c0)*-1;
    			
    			if((ix+iy)>(jx+jy)){
    				int[] temp = result[i];
    				result[i] = result[j];
    				result[j] = temp;
    			}
    		}
    	}
        return result;
    }


	public static void main(String[] args) {
		//int[][] result = new Test1().allCellsDistOrder(2,2,0,1);
		//Output: [[0,1],[0,0],[1,1],[1,0]]
		int[][] result = new P1030MatrixCellsInDistanceOrder().allCellsDistOrder(3,3,0,2);
		for(int i=0;i<result.length;i++) {
			System.out.println(Arrays.toString(result[i]));
		}
		
		/*
		 * 2 3 1 2 
		 * Output: [[1,2],[1,1],[1,0],[0,2],[0,1],[0,0]] 
		 * Expected:[[1,2],[0,2],[1,1],[0,1],[1,0],[0,0]]
		 */
		
		/*
		 * Input: 3 3 0 2 
		 * Output:
		 * [[0,2],[1,2],[2,2],[0,1],[1,1],[2,1],[0,0],[1,0],[2,0]]
		 * Expected:
		 * [[0,2],[0,1],[1,2],[0,0],[1,1],[2,2],[1,0],[2,1],[2,0]]
		 */
		
		
		/*
		 * Input: 2 2 0 1 
		 * Output: [[0,0],[0,1],[1,0],[1,1]] 
		 * Expected:
		 * [[0,1],[0,0],[1,1],[1,0]]
		 */
		
		
	}
}
