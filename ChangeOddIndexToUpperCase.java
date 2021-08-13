package week1.day2;

public class ChangeOddIndexToUpperCase 
{

	public static void main(String[] args) {
			  
		 String str = "changeme";
		 int len=str.length();
		
        char[] ch = str.toCharArray();
  
        for (int i = 0; i <=str.length()-1; i++) 
             {   
        	if(i%2==0)
        	{
               char str1= Character.toUpperCase(ch[i]);
               System.out.println(str1);
        	}
             
        	else
        	{
               System.out.println(ch[i]);
             }
             }
        
		 
	}
	}
	
		 
	


