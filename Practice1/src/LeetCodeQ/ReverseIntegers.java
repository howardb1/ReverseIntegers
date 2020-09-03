package LeetCodeQ;
import java.util.Scanner;
public class ReverseIntegers {
	

	
	public int reverse (int x)	{
		
		
		int p = (int) Math.pow(2, 31);	//<--------- Declaring the numerical boundaries of the #'s that i only 
		int n = (int) Math.pow(-2, 31);				// want to be used in the program
		
		if (x > p && x < n ) {			//<----------Making a case if those these boundaries are broken 
			
			return 0;					//<----------This case will return a zero if if the the case up above is broken
		}
		
		String str = Integer.toString(x);   //<--------- This line is turn int x into a string of numbers
		

		
		StringBuilder sb = new StringBuilder(str);		//<------- Declaring and initializing the StringBuilder using the string value "str", which as now turned into "sb"
														//<------- so that i can use the reverse method on flip the order 
		
		

		String newStr = sb.reverse().toString();		//<-------Using the reverse method from stringBuilder on renamed string value "sb" string that holds the #'s inna string 
		
		int num;	
		
		try {
			return	num = Integer.parseInt(newStr);				//<-------this line is essentially just turns the reversed string that 
		 												//<------- holds the reversed numbers back into an int value 
		}
			catch (NumberFormatException e) {
				
				return (Integer) null;
			}
			
	} 
	
	
	
	
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	ReverseIntegers ri = new ReverseIntegers();
		
	
	System.out.print("Input: ");
			int num = sc.nextInt();
			ri.reverse(num);
			
		
	System.out.println("Output: " + ri.reverse(num));
		
		
		
		
	}

}
