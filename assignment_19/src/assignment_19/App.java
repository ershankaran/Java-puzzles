package assignment_19;

import ignore.TestingUtils;

public class App {


	/**
	 * 
	
	Given a string that contains a single pair of brackets, compute recursively a new string made of 
	only of the brackets and their contents, so "xyz[abc]123" yields "[abc]".

	<br>
	<br>

	 * <b>EXPECTATIONS:</b><br>
		insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
		insideBrackets("x[hello]") <b>---></b> [hello] <br>
		insideBrackets("[xy]1") <b>---></b> [xy] <br>
	 */
	
	public static String insideBrackets(String str) {

		if(str.length() <=1) return "";
	
		// complete the body of this method

		return ""+ ( (str.charAt(0) == '[' && str.substring(1).indexOf(']') != -1 ) ? str.substring(0, str.substring(0).indexOf(']')+1) :"") +  insideBrackets(str.substring(1));
	}



	
	
	
	
	
	
	
	

	
	//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
		
	}
}

