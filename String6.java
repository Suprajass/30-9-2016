import java.io.*;
import java.util.*;
public class String6 {
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		Other o=new Other();
		int n=o.sumDigits(s);
		System.out.println(n);
		
	}
}

