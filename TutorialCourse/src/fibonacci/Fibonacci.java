package fibonacci;

public class Fibonacci {

	public long RecursiveFib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			return RecursiveFib(n - 1) + RecursiveFib(n - 2);
		}
	} 

	public long IterativeFib(int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		else {
			long operand1 = 0; 
			long operand2 = 1;

			for(int i = 0; i < n; i++) {
				long res = operand1;
				operand1 = operand1 + operand2;
				operand2 = res; 
			}
			return operand1;
		}
	}
}
