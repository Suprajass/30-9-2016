import java.io.*;
import java.util.*;
public class String8{
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		Oth o=new Oth();
		int n=o.countTriple(s1);
		System.out.println(n);
		
	}
}

