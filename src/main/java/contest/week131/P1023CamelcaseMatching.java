package contest.week131;

import java.util.ArrayList;
import java.util.List;


/**
 * A query word matches a given pattern if we can insert lowercase letters to the pattern word so that it equals the query. (We may insert each character at any position, and may insert 0 characters.)
	Given a list of queries, and a pattern, return an answer list of booleans, where answer[i] is true if and only if queries[i] matches the pattern.
 * 
 * 1 <= queries.length <= 100
	1 <= queries[i].length <= 100
	1 <= pattern.length <= 100
	All strings consists only of lower and upper case English letters.
 * 
 * @author angilin
 *
 */
public class P1023CamelcaseMatching {

		public List<Boolean> camelMatch(String[] queries, String pattern) {
			List<Boolean> result = new ArrayList<>();
	        char[] p = pattern.toCharArray();
	        for(String str : queries) {
	        	char[] s = str.toCharArray();
	        	Boolean flag = null;
	        	int index = 0;
	        	int pindex = 0;
	        	outterLoop : for(;pindex<p.length;pindex++) {
	        		char p1 = p[pindex];
	        		for(;index<s.length;index++) {
	        			char s1 = s[index];
	        			if(s1==p1) {
	        				//fault2
	        				index++;
	        				//fault1
	        				if(pindex==p.length-1) {
	        					break outterLoop;
	        				}
	        				break;
	        			}
	        			if(Character.isUpperCase(s1) && s1!=p1) {
	        				flag = false;
	        				break outterLoop;
	        			}
	        		}
	        		if(index == s.length) {
	        			flag = false;
	        			break;
	        		}
	        	}
	        	//fault3
	        	if(flag==null || flag) {
	        		for(;index<s.length;index++) {
	        			char s1 = s[index];
	        			if(Character.isUpperCase(s1)) {
	        				flag = false;
	        			}
	        		}
	        	}
	        	
	        	if(flag!=null) {
	        		result.add(flag);
	        	}
	        	else {
	        		result.add(true);
	        	}
	        }
	        return result;
	    }
}
