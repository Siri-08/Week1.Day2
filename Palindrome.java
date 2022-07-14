package week1Day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		String InputString = "madam";
		String revString = "";
		for ( int i=InputString.length()-1;i>=0;i--)
		{
			revString = revString+InputString.charAt(i);
		}
		System.out.println(revString);
		if(InputString.equals(revString))
			System.out.println("A Palindrome");
		else
			System.out.println("not a palindrome");
	}

}
