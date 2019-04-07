package contest.week131;

import java.util.ArrayList;
import java.util.List;


/**
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
	A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
	Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
	Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 * 
 * S.length <= 10000
	S[i] is "(" or ")"
	S is a valid parentheses string
 * 
 * @author angilin
 *
 */
public class P1021RemoveOutermostParentheses {
	
	public String removeOuterParentheses(String S) {
        List<String> tempList = new ArrayList<>();
        int leftCount = 0;
        int rightCount = 0;
        int lastIndex = 0;
        for(int i=0;i<S.length();i++) {
        	if(S.charAt(i)=='(') {
        		leftCount++;
        	}
        	else {
        		rightCount++;
        		if(rightCount==leftCount) {
        			tempList.add(S.substring(lastIndex, i+1));
        			lastIndex=i+1;
        			leftCount=0;
        			rightCount=0;
        		}
        	}
        }
        StringBuilder sb = new StringBuilder();
        for(String str : tempList) {
        	sb.append(str.substring(1, str.length()-1));
        }
        return sb.toString();
    }

}
