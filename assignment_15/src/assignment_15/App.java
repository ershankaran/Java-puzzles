package assignment_15;

import java.util.Arrays;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	Given a string, return the length of the longest streak of the same chars in the string. 

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		longestStreak("hayyeu") <b>---></b> 2<br>
		longestStreak("XPNzzzddOOOxx")  <b>---></b> 3 <br>
		longestStreak("")  <b>---></b> 0 <br>
	 */
	
	public static int longestStreak(String str) {
		// int max = 0;
		int[] val = new int[str.length()];
		int cnt = 1;
		for(int i =1;i<str.length();i++){
			
			if(str.charAt(i-1) == str.charAt(i)) {
				cnt++;
			} else {
				cnt = 1;
			}

			// if(cnt > max) max = cnt;
			val[i] = cnt;
		}
		// return max;
		return val.length > 0 ? Arrays.stream(val).max().getAsInt() : 0;
	}

	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

