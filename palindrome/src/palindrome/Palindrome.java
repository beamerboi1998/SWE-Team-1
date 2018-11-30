package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		String in = "aaba";
		System.out.println(palindrome(in));
	}
	
	public static boolean palindrome(String in)
	{
		char[] c = in.toCharArray();
		String reverse = new String();
		for(int i = in.length()-1; i>=0; i--)
		{
			reverse += c[i];
		}
		
		return reverse.equals(in);
	}

}
