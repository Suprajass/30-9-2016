import java.util.*;
import java.io.*;
public class String7 {
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.next();
		Othe o=new Othe();
		int n=o.maxBlock(s1);
		System.out.println(n);
		
	}
}

