package contest.week137;


import java.util.*;

/**
 * 
 * We have a collection of rocks, each rock has a positive integer weight.
Each turn, we choose the two heaviest rocks and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 * 
 * 1 <= stones.length <= 30
1 <= stones[i] <= 1000
 * 
 * @author angilin
 *
 */
public class P1046LastStoneWeight {
	
	public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>();
        for(int stone : stones) {
        	stoneList.add(stone);
        }
        Collections.sort(stoneList);
        smash(stoneList);
        if(stoneList.size()==1) {
        	return stoneList.get(0);
        }
        else {
        	return 0;
        }
    }

	public void smash(List<Integer> stoneList) {
		if(stoneList.size()<2) {
			return;
		}
		int max = stoneList.get(stoneList.size()-1);
        int next = stoneList.get(stoneList.size()-2);
        if(max == next) {
        	stoneList.remove(stoneList.size()-2);
        	stoneList.remove(stoneList.size()-1);
        }
        else {
        	stoneList.remove(stoneList.size()-2);
        	stoneList.remove(stoneList.size()-1);
        	stoneList.add(max-next);
        	Collections.sort(stoneList);
        }
        smash(stoneList);
	}

}
