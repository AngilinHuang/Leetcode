package contest.week133;

/**
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 * 
 * 1 <= costs.length <= 100
It is guaranteed that costs.length is even.
1 <= costs[i][0], costs[i][1] <= 1000
 * 
 * @author angilin
 *
 */
public class P1029TwoCityScheduling {

	public int twoCitySchedCost(int[][] costs) {
		int result = 0;
		for (int i = 0; i < costs.length; i++) {
			for (int j = i; j < costs.length; j++) {
				if ((costs[i][0] - costs[i][1]) > (costs[j][0] - costs[j][1])) {
					int[] temp = costs[i];
					costs[i] = costs[j];
					costs[j] = temp;
				}
			}
		}

		for (int i = 0; i < costs.length; i++) {
			// System.out.println(Arrays.toString(costs[i]));
			if (i < costs.length / 2) {
				result = result + costs[i][0];
			} else {
				result = result + costs[i][1];
			}
		}
		return result;
	}
}
