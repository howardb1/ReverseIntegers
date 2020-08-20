package LeetCodeQ;
import java.util.Scanner;
public class ReverseIntegers {
	
	
public int reverse (int x)	{
	
	int p = (int) Math.pow(2, 31);
	int n = (int) Math.pow(-2, 31);
	
	if (x > p && x < n ) {
		
		return 0;
	}
	
	String str = Integer.toString(x);
	
	StringBuilder sb = new StringBuilder(str);
	
	String newStr = sb.reverse().toString();
	
	int z = Integer.parseInt(newStr);
	
	
	
	
	
	
		/*
		 * for(int i = str.length() - 1; i >= 0; i--) { sb.append(str.charAt(i)); }
		 * 
		 * String newstr = sb.append(str.charAt(i));
		 */
	
	
	return z;
	
}

	
	
	public static void main(String[] args) {
		
		
		System.out.println("Input: ");
		
		
		System.out.println("Output");
		
	}

}
