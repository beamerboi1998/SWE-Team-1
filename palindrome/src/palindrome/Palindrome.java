package palindrome;

public class Palindrome {

	public static void main(String[] args) {
	}
	
	public static boolean palindrome(int[] in, int size)
	{
		int[] reverse = new int[size];
		int j = 0;
		for(int i = in.length - 1;  i>=0; i--)
		{
			reverse[j++] = in[i];
		}
		for(int i = 0; i < in.length; i++)
		{
			if(in[i] != reverse[i])
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean palindrome(char[] in, int size)
	{
		char[] reverse = new char[size];
		int j = 0;
		for(int i = in.length - 1;  i>=0; i--)
		{
			reverse[j++] = in[i];
		}
		for(int i = 0; i < in.length; i++)
		{
			if(in[i] != reverse[i])
			{
				return false;
			}
		}
		return true;
	}

}
