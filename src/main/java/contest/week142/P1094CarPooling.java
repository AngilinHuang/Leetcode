package contest.week142;


import java.util.*;

/**
 * You are driving a vehicle that has capacity empty seats initially available for passengers.  The vehicle only drives east (ie. it cannot turn around and drive west.)
Given a list of trips, trip[i] = [num_passengers, start_location, end_location] contains information about the i-th trip: the number of passengers that must be picked up, and the locations to pick them up and drop them off.  The locations are given as the number of kilometers due east from your vehicle's initial location.
Return true if and only if it is possible to pick up and drop off all passengers for all the given trips. 
 * 
 * trips.length <= 1000
trips[i].length == 3
1 <= trips[i][0] <= 100
0 <= trips[i][1] < trips[i][2] <= 1000
1 <= capacity <= 100000
 * 
 * @author angilin
 *
 */
public class P1094CarPooling {
	
	public boolean carPooling(int[][] trips, int capacity) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<trips.length;i++) {
        	int[] trip = trips[i];
        	for(int j=trip[1];j<trip[2];j++) {
        		if(map.containsKey(j)) {
        			int count = map.get(j);
        			if((count+trip[0])>capacity) {
        				//System.out.println(trip[1]+" count="+count+" trip[0]="+trip[0]);
        				return false;
        			}
        			else {
        				map.put(j,count+trip[0]);
        			}
        		}
        		else {
        			if(trip[0]>capacity) {
        				return false;
        			}
        			else {
        				map.put(j,trip[0]);
        			}
        		}
        	}
        }
		return true;
    }



	public static void main(String[] args) {
		int[][] trips = {{2,1,5},{3,3,7}};
		int capacity = 4;
		//false
		System.out.println(new P1094CarPooling().carPooling(trips, capacity));
		
		int[][] trips2 = {{2,1,5},{3,3,7}};
		int capacity2 = 5;
		//true
		System.out.println(new P1094CarPooling().carPooling(trips2, capacity2));
		
		int[][] trips3 = {{2,1,5},{3,5,7}};
		int capacity3 = 3;
		//true
		System.out.println(new P1094CarPooling().carPooling(trips3, capacity3));
		
		int[][] trips4 = {{3,2,7},{3,7,9},{8,3,9}};
		int capacity4 = 11;
		//true
		System.out.println(new P1094CarPooling().carPooling(trips4, capacity4));
	}
}
