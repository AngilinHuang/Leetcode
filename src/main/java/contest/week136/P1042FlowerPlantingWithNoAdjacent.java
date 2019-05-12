package contest.week136;


import java.util.*;


/**
 * You have N gardens, labelled 1 to N.  In each garden, you want to plant one of 4 types of flowers.
paths[i] = [x, y] describes the existence of a bidirectional path from garden x to garden y.
Also, there is no garden that has more than 3 paths coming into or leaving it.
Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.
Return any such a choice as an array answer, where answer[i] is the type of flower planted in the (i+1)-th garden.  The flower types are denoted 1, 2, 3, or 4.  It is guaranteed an answer exists.
 * 
 * 1 <= N <= 10000
0 <= paths.size <= 20000
No garden has 4 or more paths coming into or leaving it.
It is guaranteed an answer exists.
 * 
 * @author angilin
 *
 */
public class P1042FlowerPlantingWithNoAdjacent {
	
	public int[] gardenNoAdj(int N, int[][] paths) {
        int[] result = new int[N];
        Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
        for(int i=0;i<paths.length;i++) {
        	int[] path = paths[i];
        	int garden1 = path[0];
        	int garden2 = path[1];
        	if(map.containsKey(garden1)) {
        		map.get(garden1).add(garden2);
        	}
        	else {
        		List<Integer> list = new ArrayList<>();
        		list.add(garden2);
        		map.put(garden1, list);
        	}
        	if(map.containsKey(garden2)) {
        		map.get(garden2).add(garden1);
        	}
        	else {
        		List<Integer> list = new ArrayList<>();
        		list.add(garden1);
        		map.put(garden2, list);
        	}
        }

        fill(result, 1 , map);
        
        return result;
    }
	
	public boolean check(int[] result, int index, Map<Integer,List<Integer>> map, int color) {
		List<Integer> paths = map.get(index);
		//会有不连接到任何其他garden的点，需要处理空值错误
		if(paths==null) {
			return true;
		}
		for(Integer i : paths) {
			if(result[i-1]==color) {
				return false;
			}
		}
		return true;
	}
	
	public void fill(int[] result, int index, Map<Integer,List<Integer>> map ) {
		if(index==result.length+1) {
			return;
		}
		for(int i=1;i<5;i++) {
			if(check(result, index, map,i)) {
				result[index-1] = i;
				fill(result, index+1, map);
				break;
			}
		}
	}
	
	

	public static void main(String[] args) {
//		int[][] paths = {{1,2},{2,3},{3,1}};
//		int N = 3;
//		System.out.println(Arrays.toString(new Test2().gardenNoAdj(N, paths)));
		
		
		int[][] paths = {{1,2},{2,3},{3,4},{4,1},{1,3},{2,4}};
		int N = 4;
		System.out.println(Arrays.toString(new P1042FlowerPlantingWithNoAdjacent().gardenNoAdj(N, paths)));
	}
}
