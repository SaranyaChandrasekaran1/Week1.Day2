package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		String rev= " ";
		int len=str.length();
		char[] charArray=str.toCharArray();
		for(int i= charArray.length-1;i>=0;i--)
		{
			rev=rev+charArray[i];
			
		}
		if(str.equals(rev))
			
		{
			System.out.println("Given string is a Palindrome");
		}
		else
		{
			System.out.println("Given string is not a Palindrome");
		}
	}

}
