public class Oth
{
	String s;
	public int countTriple(String s)
	{
		int n=s.length(),count=0;
		for(int i=0;i<n-2;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				if(s.charAt(i)==s.charAt(i+2))
				{
					count++;
				}
			}
		}
		return count;
	}
}
