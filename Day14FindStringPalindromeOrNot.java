package main1;

public class Day14FindStringPalindromeOrNot {
	
	public static boolean isPalindrome(String s) {
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		
		String str="Prasad";
		
		boolean ok=isPalindrome(str);
		System.out.println(ok);
	}

}
