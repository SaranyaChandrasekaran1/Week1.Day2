package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		if(str1.length()==str2.length())
		{
			char[] arrstr1=str1.toCharArray();
			char[] arrstr2=str2.toCharArray();
			Arrays.sort(arrstr1);
			Arrays.sort(arrstr2);
			for(int i=0;i<arrstr2.length;i++)
			{
				if(arrstr1[i]!=arrstr2[i])
{
	
	System.out.println("Given Strings are not an anagram");
	break;
}
				}
				System.out.println("Given strings are anagram");
						
						
				}
			else
			{
				System.out.println("Given Strings are not an anagram");

			}
					
		}
		// TODO Auto-generated method stub

	}


