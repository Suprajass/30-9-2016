import java.io.*;
import java.util.*;
public class String10{
	
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		Nex n=new Nex();
		boolean b1=n.evenlySpaced(a,b,c);
		System.out.println(b1);
	}
}

