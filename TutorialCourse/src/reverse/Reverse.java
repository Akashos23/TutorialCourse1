package reverse;

public class Reverse {
	public String reverseRecursive(String s) {
		if(s.length() == 0) {
			return s;
		}
		else {
			char val = s.charAt(s.length() - 1);
			return val + reverseRecursive(s.substring(0, s.length() - 1));
		}
	}
	
	public String reverseIterative(String s) {
		if(s.length() == 0) {
			return s;
		}
		else {
			String val = "";
			for(int i = s.length() - 1; i >= 0; i--) {
				val += s.charAt(i);
			}
			return val;
		}
	}
}
