package assignment_01;

import ignore.TestingUtils;

public class App {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	
	public static String middleThree(String str) {
		int cLen = str.length() / 2;
		// String result = (str.length() >= 3) ? str.substring(cLen-1, cLen+2) : str;
		String result;
		System.out.println(str+"-"+ str.length()+" / 2 = "+cLen);
		if(str.length() >=3 ){
			result = str.substring(cLen-1, cLen+2);
		} else {
			result = str;
		}
		return result;

		/*
			12345-5 / 2 = 2
			PASS: middleThree(12345) -> 234
			apple-5 / 2 = 2
			PASS: middleThree(apple) -> ppl
			tiger-5 / 2 = 2
			PASS: middleThree(tiger) -> ige
			candy-5 / 2 = 2
			PASS: middleThree(candy) -> and
			add-3 / 2 = 1
			PASS: middleThree(add) -> add
			ad-2 / 2 = 1
			PASS: middleThree(ad) -> ad
			a-1 / 2 = 0
			PASS: middleThree(a) -> a
			-0 / 2 = 0
			PASS: middleThree() -> 
			del-3 / 2 = 1
			PASS: middleThree(del) -> del
			denny-5 / 2 = 2
			PASS: middleThree(denny) -> enn
			sfveaadelbb-11 / 2 = 5
			PASS: middleThree(sfveaadelbb) -> aad
		 */
	}
	
	
	
	
	
	
	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[]){
		TestingUtils.runTests();
	}
}
