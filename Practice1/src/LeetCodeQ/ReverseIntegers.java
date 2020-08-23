package LeetCodeQ;
import java.util.Scanner;
public class ReverseIntegers {
	
	
	
	
	public static int reverse (int x)	{
	
	int p = (int) Math.pow(2, 31);
	int n = (int) Math.pow(-2, 31);
	
	if (x > p && x < n ) {
		
		return 0;
	}
	
	String str = Integer.toString(x);
	
	StringBuilder sb = new StringBuilder(str);
	
	

	String newStr = sb.reverse().toString();
	
	for (int i = 0; i <= str.length(); i++) {
		if (str.charAt(i) == '-') {
			return i;
		}
	}
	
	
	
	int z = Integer.parseInt(newStr);
	
	
	
	
	
	
	return z;
	
}


	
	
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Input: ");
		int num = sc.nextInt();
		int revNum = reverse(num);
		
		
	System.out.println("Output: " + revNum);
		
		
		
		
	}

}
