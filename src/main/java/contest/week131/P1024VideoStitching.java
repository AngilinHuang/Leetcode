package contest.week131;

/**
 * You are given a series of video clips from a sporting event that lasted T seconds.  These video clips can be overlapping with each other and have varied lengths.
Each video clip clips[i] is an interval: it starts at time clips[i][0] and ends at time clips[i][1].  We can cut these clips into segments freely: for example, a clip [0, 7] can be cut into segments [0, 1] + [1, 3] + [3, 7].
Return the minimum number of clips needed so that we can cut the clips into segments that cover the entire sporting event ([0, T]).  If the task is impossible, return -1.
 * 
 * 
 * @author angilin
 *
 */
public class P1024VideoStitching {
	public int videoStitching(int[][] clips, int T) {
        int start = 0;
        int count = 0;
        int end = 0;
        return calc(clips, T, start, end, count);
    }
	
	public int calc(int[][] clips, int T, int start, int end, int count) {
		for(int i=0;i<clips.length;i++) {
        	int[] clip = clips[i];
        	if(clip[0]<=start) {
        		if(end<clip[1]) {
        			end = clip[1];
        			if(end>=T) {
        				return count+1;
        			}
        		}
        	}
        }
        if(start<end) {
        	start = end;
        	return calc(clips, T, start, end, count+1);
        }
        else {
        	return -1;
        }
	}
}
