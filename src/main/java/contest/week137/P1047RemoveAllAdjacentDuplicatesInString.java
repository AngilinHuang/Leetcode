package contest.week137;


/**
 * 
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
We repeatedly make duplicate removals on S until we no longer can.
Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
 * 
 * 1 <= S.length <= 20000
S consists only of English lowercase letters.
 * 
 * @author angilin
 *
 */
public class P1047RemoveAllAdjacentDuplicatesInString {
	
	public String removeDuplicates(String S) {
        StringBuilder s = new StringBuilder();
        s.append(S);
        removeDuplicate(s);
        return s.toString();
    }
	
	public void removeDuplicate(StringBuilder s){
		boolean flag = false;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				s.deleteCharAt(i+1);
				s.deleteCharAt(i);
				flag = true;
			}
		}
		if(flag) {
			removeDuplicate(s);
		}
		else {
			return;
		}
	}

}
