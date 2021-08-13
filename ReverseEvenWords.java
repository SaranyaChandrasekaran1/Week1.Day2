package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
			 		      		String test = "I am a software tester"; 
			//a) split the words and have it in an array
			 		      		String[] words=test.split(" ");
			//b) Traverse through each word (using loop)
			 		      		for(int i=0;i<words.length;i++)
			 		      		{
			 		      			if(i%2==1)
			 		      			{
			 		      				int lenofOddIndex=words[i].length();
			 		      			for(int j=lenofOddIndex-1;j>=0;j--)
			 		      			{
			 		      				System.out.println(words[i].charAt(j));
			 		      			}
			 		      			System.out.print(" ");	
			 		      			
			 		      		}
			 		      			else
			 		      			{
			 		      				System.out.println(words[i]);
			 		      			}
			 		      		}
			 		      		
			 
}
}
