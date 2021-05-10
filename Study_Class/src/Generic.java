
public class Generic {

	public static void main(String[] args) {
		System.out.println(printGeneric("하이")); // T -> String
		System.out.println(printGeneric(1)); // T -> Integer
		System.out.println(printGeneric(1.5)); // T -> Double
		System.out.println(printGeneric(true)); // T -> Boolean
	}
	
	public static <T> T printGeneric(T a) {
		return a;
	}
}