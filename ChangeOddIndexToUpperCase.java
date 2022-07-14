package week1Day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String inputString = "changeme" ;
		char[] charArray = inputString.toCharArray();
		
		for (int i=0;i<charArray.length;i++)
		{
			if(i%2 !=0)
			{
							System.out.print(Character.toUpperCase(charArray[i]));
			}
			else
				System.out.print(charArray[i]);
		}

	}

}
