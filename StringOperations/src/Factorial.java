
public class Factorial {
// displays the use of recursion;
	public static long fact(long number) {
		if (number <= 1)
			return 1;
		else
			return number*fact(number -1);
	}
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}
