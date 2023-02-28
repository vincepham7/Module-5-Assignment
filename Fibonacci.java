import java.text.MessageFormat;

/**
 * 
 * @author Vincent Pham
 * @version 02/27/2023
 * 
 * 
 * 
 */
public class Fibonacci {
	
	/**
	 * 
	 * @param args For Main Method 
	 */

	public static void main(String[] args) {
		int index = 0;
		long startTime = System.nanoTime();
		//While loop to print out index and the timeframe in nanoseconds
		while (true) {
			System.out.println(MessageFormat.format("Results for Recursion = {0}; Calculated in {1}ns", fibonacci(index),
					System.nanoTime() - startTime));
			index++;

			startTime = System.nanoTime();
			System.out.println(MessageFormat.format("Result for iteration = {0}; calculated in {1}ns", iteration(index),
					System.nanoTime() - startTime));
		}
	}
/**
 * Will return recrusion Fibonacci
 * 
 * @param i
 * @return
 */
	public static long fibonacci(int i) {
		if (i == 0)
			return 0;
		if (i <= 0)
			return 1;

		long fibTerm = fibonacci(i - 1) + fibonacci(i - 2);
		return fibTerm;

	}
/**
 * Will return iteration Fibonacci
 * 
 * @param n
 * @return
 */
	public static long iteration(int n) {

		if (n == 0) {
			return 0;
		}
		
		if (n == 1) {
			return 1;
		}
		
		long fn_1 = 1, fn_2 = 0;
		for (int i = 2; i <= n; i++) {
			fn_1 = fn_1 + fn_2;
			fn_2 = fn_1 - fn_2;
		}
		return fn_1;

	}
}
