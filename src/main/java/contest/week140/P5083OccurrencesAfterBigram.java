package contest.week140;


import java.util.*;


/**
 * Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.
For each such occurrence, add "third" to the answer, and return the answer.
 * 
 * 1 <= text.length <= 1000
text consists of space separated words, where each word consists of lowercase English letters.
1 <= first.length, second.length <= 10
first and second consist of lowercase English letters.
 * 
 * @author angilin
 *
 */
public class P5083OccurrencesAfterBigram {
	
	public String[] findOcurrences(String text, String first, String second) {
        List<String> resultList = new ArrayList<>();
        String[] texts = text.split(" ");
        boolean firstMatch = false;
        boolean secondMatch = false;
        for(String str : texts) {
        	if(secondMatch) {
        		resultList.add(str);
        	}
        	
        	if(firstMatch) {
        		if(second.equals(str)) {
        			secondMatch = true;
        			firstMatch = false;
        		}
        		else {
        			if(first.equals(str)) {
            			firstMatch = true;
            			secondMatch = false;
            		}
            		else {
            			firstMatch = false;
            			secondMatch = false;
            		}
        		}
        	}
        	else {
        		if(first.equals(str)) {
        			firstMatch = true;
        			secondMatch = false;
        		}
        		else {
        			firstMatch = false;
        			secondMatch = false;
        		}
        	}
        }
        return resultList.toArray(new String[resultList.size()]);
    }

	public static void main(String[] args) {
		String text = "alice is a good girl she is a good student";
		String first = "a";
		String second = "good";
		//girl student
		System.out.println(Arrays.toString(new P5083OccurrencesAfterBigram().findOcurrences(text, first, second)));
		
		
		String text1 = "we will we will rock you";
		String first1 = "we";
		String second1 = "will";
		//we rock
		System.out.println(Arrays.toString(new P5083OccurrencesAfterBigram().findOcurrences(text1, first1, second1)));
		
		
		String text2 = "jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa";
		String first2 = "kcyxdfnoa";
		String second2 = "jkypmsxd";
		//kcyxdfnoa kcyxdfnoa  kcyxdfnoa
		System.out.println(Arrays.toString(new P5083OccurrencesAfterBigram().findOcurrences(text2, first2, second2)));
		
		
		
	}
}
