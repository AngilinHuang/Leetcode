package contest.week140;


import java.util.*;

/**
 * You have a set of tiles, where each tile has one letter tiles[i] printed on it.  Return the number of possible non-empty sequences of letters you can make.
 * 
 * 1 <= tiles.length <= 7
tiles consists of uppercase English letters.
 * 
 * @author angilin
 *
 */
public class P5087LetterTilePossibilities {
	
	public int numTilePossibilities(String tiles) {
		Set<String> resultSet = new HashSet<>();
		List<String> letterList = new ArrayList<>();
        char[] letters = tiles.toCharArray();
        for(int i=0;i<letters.length;i++) {
        	letterList.add(letters[i]+"");
        }
        for(int i=1;i<=letters.length;i++) {
        	StringBuilder sb = new StringBuilder();
            test(letterList, resultSet, sb, i);
        }
        System.out.println(Arrays.toString(resultSet.toArray()));
        return resultSet.size();
    }
	
	public void test(List<String> letters, Set<String> resultSet, StringBuilder sb, int length) {
		
		for(int i=0;i<letters.size();i++) {
        	sb.append(letters.get(i));
        	List<String> newLetters = new ArrayList<>(letters);
        	newLetters.remove(i);
        	test(newLetters, resultSet, sb, length);
        }
		
		if(sb.length()==length) {
			resultSet.add(sb.toString());
			sb.deleteCharAt(sb.length()-1);
			return;
		}
		if(sb.length()!=0) {
			sb.deleteCharAt(sb.length()-1);
		}
	}
	

	public static void main(String[] args) {
		String tiles = "AAABBC";
		//188
		System.out.println(new P5087LetterTilePossibilities().numTilePossibilities(tiles));
	}
}
