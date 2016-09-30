import java.io.*;
import java.util.*;
public class String11{
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		String s1=in.next();
		int c=in.nextInt();
		Ne n=new Ne();
		String s3=n.repeatSeparator(s,s1,c);
		System.out.println(s3);
	}
}

