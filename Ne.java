public class Ne
{
	String s,s1;
	int c;
	public String repeatSeparator(String s,String s1,int c)
	{	
		String s2=s;
		if(c==1)
			return s;
		else
		{
			for(int i=c-1;i>=1;i--)
			{
			
				s2=s2+s1;
				s2=s2+s;
			}
		}
		return s2;
	}
}
