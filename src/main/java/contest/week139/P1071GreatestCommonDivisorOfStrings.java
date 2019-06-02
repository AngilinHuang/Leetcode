package contest.week139;


/**
 * 
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T  (T concatenated with itself 1 or more times)
Return the largest string X such that X divides str1 and X divides str2.
 * 
 * 1 <= str1.length <= 1000
1 <= str2.length <= 1000
str1[i] and str2[i] are English uppercase letters.
 * 
 * @author angilin
 *
 */
public class P1071GreatestCommonDivisorOfStrings {
	
	public String gcdOfStrings(String str1, String str2) {
		int i=0;
        for(i=0;i<str1.length();i++) {
        	if(i<str2.length()) {
        		if(str1.charAt(i)!=str2.charAt(i)) {
        			break;
        		}
        	}
        	else {
        		break;
        	}
        }
        String overlapStr = str1.substring(0,i);
        
        for(int j=overlapStr.length();j>0;j--){
        	if(str1.length()%j==0 && str2.length()%j==0) {
        		StringBuilder sb1 = new StringBuilder();
        		StringBuilder sb2 = new StringBuilder();
        		
        		for(int k=0;k<str1.length()/j;k++) {
        			sb1.append(overlapStr.substring(0,j));
        		}
        		for(int k=0;k<str2.length()/j;k++) {
        			sb2.append(overlapStr.substring(0,j));
        		}
        		if(sb1.toString().equals(str1) && sb2.toString().equals(str2)) {
        			i = j;
            		break;
        		}
        	}
        }
        overlapStr = overlapStr.substring(0,i);
        
        return overlapStr;
    }



	public static void main(String[] args) {
		String str1 = "ABCABCABC";
		String str2 = "ABCABC";
		//ABC
		System.out.println(new P1071GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));
		
		str1 = "LEFT";
		str2 = "CODE";
		//""
		System.out.println(new P1071GreatestCommonDivisorOfStrings().gcdOfStrings(str1, str2));
	}
}
