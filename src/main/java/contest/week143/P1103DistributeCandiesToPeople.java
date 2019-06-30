package contest.week143;


import java.util.*;



/**
 * 
 * We distribute some number of candies, to a row of n = num_people people in the following way:
We then give 1 candy to the first person, 2 candies to the second person, and so on until we give n candies to the last person.
Then, we go back to the start of the row, giving n + 1 candies to the first person, n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.
This process repeats (with us giving one more candy each time, and moving to the start of the row after we reach the end) until we run out of candies.  The last person will receive all of our remaining candies (not necessarily one more than the previous gift).
Return an array (of length num_people and sum candies) that represents the final distribution of candies.
 * 
 * 1 <= candies <= 10^9
1 <= num_people <= 1000
 * 
 * @author angilin
 *
 */
public class P1103DistributeCandiesToPeople {
	
	public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int count = 1;
        int i=0;
        while(candies>0) {
        	if(candies>=count) {
        		result[i] = result[i]+count;
        		candies = candies - count;
        	}
        	else {
        		result[i] = result[i]+candies;
        		candies = 0;
        	}
        	
        	count++;
        	if(i<num_people-1) {
        		i++;
        	}
        	else {
        		i = 0;
        	}
        }
        
        return result;
    }



	public static void main(String[] args) {
		int  candies = 10, num_people = 3;
		System.out.println(Arrays.toString(new P1103DistributeCandiesToPeople().distributeCandies(candies, num_people)));
	}
}
