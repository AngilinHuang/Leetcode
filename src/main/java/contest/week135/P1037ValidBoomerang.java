package contest.week135;

/**
 * A boomerang is a set of 3 points that are all distinct and not in a straight line.
Given a list of three points in the plane, return whether these points are a boomerang.
 * 
 * points.length == 3
points[i].length == 2
0 <= points[i][j] <= 100
 * 
 * @author angilin
 *
 */
public class P1037ValidBoomerang {
	
	public boolean isBoomerang(int[][] points) {
		if((points[1][0]-points[0][0])*(points[2][1]-points[0][1])==(points[2][0]-points[0][0])*(points[1][1]-points[0][1])) {
			return false;
		}
		else {
			return true;
		}
    }
}
