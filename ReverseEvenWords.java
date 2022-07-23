package week1Day2;

public class ReverseEvenWords 
{
	    public String reverse (String inputString)
	    {
             char[] charArray = inputString.toCharArray();
             String reversedString ="";
             
             for (int i=charArray.length-1;i>=0;i--)
             {
            	 reversedString +=charArray[i];
             }
             return reversedString;
	    }
	    
		public static void main(String[] args) 
		{
			ReverseEvenWords obj1 = new ReverseEvenWords();
			 String test = "I am a software tester";
			 		 
			 String[] words = test.split(" ");
			 
			 for(int i=0;i<words.length;i++)
			 {
				 if (i%2 != 0) // even words, odd index
				 {
					words[i]= obj1.reverse(words[i]);
				 }
				 System.out.print(words[i] +" ");
			 }
		}
}	            
	


