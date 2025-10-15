package factorial;

public class Factorial {

	public int getFactorialRecursive(int n) {
		if(n == 1 || n == 0) {
			return n;
		}
		else {
			return n * getFactorialRecursive(n - 1);
		}
	}
	
	public int getFactorialIterative(int n) {
		if(n == 1 || n == 0) {
			return n;
		}
		int res = 1;
		for(int i = 2; i <= n; i++) {
			res	= res * i;
		}
		return res;
		
	}
}
