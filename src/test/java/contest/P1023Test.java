package contest;

import java.util.List;

import org.junit.Test;

import contest.week131.P1023CamelcaseMatching;
import util.MyCollectionUtil;

public class P1023Test {
	
	@Test
	public void test1(){
		
		String[] queries ={"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}; 
		String pattern = "FB";
		List<Boolean> result = new P1023CamelcaseMatching().camelMatch(queries, pattern);
		Boolean[] answer = {true,false,true,true,false};
		assert MyCollectionUtil.listEqualsArray(result, answer);
	}
	
	@Test
	public void test2(){
		
		String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}; 
		String pattern = "FoBa";
		List<Boolean> result = new P1023CamelcaseMatching().camelMatch(queries, pattern);
		Boolean[] answer = {true,false,true,false,false};
		assert MyCollectionUtil.listEqualsArray(result, answer);
	}
	
	@Test
	public void test3(){
		
		String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}; 
		String pattern = "FoBaT";
		List<Boolean> result = new P1023CamelcaseMatching().camelMatch(queries, pattern);
		Boolean[] answer = {false,true,false,false,false};
		assert MyCollectionUtil.listEqualsArray(result, answer);
	}
	
	@Test
	public void test4(){
		
		String[] queries = {"IXfGawluvnCa","IsXfGaxwulCa","IXfGawlqtCva","IXjfGawlmeCa","IXfGnaynwlCa","IXfGcamwelCa"}; 
		String pattern = "IXfGawlCa";
		List<Boolean> result = new P1023CamelcaseMatching().camelMatch(queries, pattern);
		Boolean[] answer = {true,true,true,true,true,true};
		assert MyCollectionUtil.listEqualsArray(result, answer);
	}
	
}
