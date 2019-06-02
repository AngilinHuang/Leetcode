package contest.week139;

import java.util.*;

public class P1072FlipColumnsForMaximumNumberOfEqualRows {
	
    public int maxEqualRowsAfterFlips(int[][] matrix) {
    	Set<String> flipMethodSet = new HashSet<>();
    	String[][] flipMethod = new String[matrix.length][2];
        for(int i=0;i<matrix.length;i++) {
        	StringBuilder sb1 = new StringBuilder();
        	StringBuilder sb2 = new StringBuilder();
        	for(int j=0;j<matrix[i].length;j++) {
        		if(matrix[i][j]!=0) {
        			sb1.append(j);
        		}
        		if(matrix[i][j]==0) {
        			sb2.append(j);
        		}
        	}
        	flipMethodSet.add(sb1.toString());
        	flipMethodSet.add(sb2.toString());
        	
        	flipMethod[i][0] = sb1.toString();
        	flipMethod[i][1] = sb2.toString();
        }
        
        int result = 0;
        for(String key : flipMethodSet) {
        	int temp = 0;
        	for(int i=0;i<flipMethod.length;i++) {
        		if(key.equals(flipMethod[i][0])||key.equals(flipMethod[i][1])) {
        			temp++;
        		}
        	}
        	if(temp>result) {
        		result = temp;
        	}
        }
        return result;
    }
    
    
    

	public static void main(String[] args) {
		int[][] matrix = {{0,0,0},{0,0,1},{1,1,0}};
		//2
		System.out.println(new P1072FlipColumnsForMaximumNumberOfEqualRows().maxEqualRowsAfterFlips(matrix));
		
		
		int[][] matrix2 = {{0,1},{1,0}};
		//2
		System.out.println(new P1072FlipColumnsForMaximumNumberOfEqualRows().maxEqualRowsAfterFlips(matrix2));
		
		int[][] matrix3 = {{0,1},{1,1}};
		//1
		System.out.println(new P1072FlipColumnsForMaximumNumberOfEqualRows().maxEqualRowsAfterFlips(matrix3));
	}
	
}
