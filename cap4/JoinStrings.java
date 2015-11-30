public class JoinStrings{
	public static void main(String args[]){
		String firstString = "Many ";
		String secondString = "hands ";
		String thirdString = "make ligth work ";
		
		String mystring;
		
		mystring = firstString + secondString + thirdString;
		System.out.println(mystring);
		
		int numHands = 99;
		mystring = numHands + " aui " + secondString + thirdString;
		System.out.println(mystring);
		mystring = " ----- " + 5 + 5;
		System.out.println(mystring);
		// Combining integers and a string
		mystring = 5 + 5 + " is ten";
		System.out.println(mystring);
	}
}