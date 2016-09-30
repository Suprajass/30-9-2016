import java.util.*;
public class Nex
{
	int a,b,c;
	public boolean evenlySpaced(int a,int b,int c)
	{
		int Arr[] = new int[4];
		Arr[0]=a;
		Arr[1]=b;
		Arr[2]=c;
		Arrays.sort(Arr);
		if((Arr[1]-Arr[0])==(Arr[2]-Arr[1]))
		{
			return true;
		}
		else
		return false;
	}
}
