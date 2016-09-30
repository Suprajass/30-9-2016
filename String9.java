import java.io.*;
import java.util.*;
public class String9{
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1=in.nextLine();
		Next n=new Next();
		String s2=n.withoutString(s,s1);
		System.out.println(s2);
	}
}

