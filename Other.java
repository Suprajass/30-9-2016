public class Other
{
	String s;
	public int sumDigits(String s)
	{
		int len=s.length(),sum=0;
		for(int i=0;i<len;i++)
		{
			char c=s.charAt(i);
			if(Character.isDigit(c))
			{	String s1=""+c;
				sum+=Integer.parseInt(s1);
			}
		}
		return sum;
	}
}
