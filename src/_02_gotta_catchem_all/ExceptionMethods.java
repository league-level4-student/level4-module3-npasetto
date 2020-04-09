package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException{
		if(b==0) {
			throw new IllegalArgumentException();
		}else {
			return a/b;
		}
	}
	public String reverseString(String s) throws IllegalStateException{
		if(s.equals("")) {
			throw new IllegalStateException();
		}else {
			String newString="";
			for(int i=s.length()-1; i>=0; i--) {
				newString+=s.charAt(i);
			}
			return newString;
		}
	}
}
