package MainPackage;

public class MyInteger

{

	private int value;

	public MyInteger(int value) {
		this.value = value;

	}

	public int GetValue() {
		return this.value;

	}

	public boolean IsEven() {
		return (this.value % 2 == 0);
	}

	public boolean IsOdd() {
		return (this.value % 2 != 0);
	}

	public boolean IsPrime() {
		return IsPrime(value);
	}

	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	public static boolean isOdd(int value) {
		return (value % 2 != 0);
	}

	public static boolean isPrime(int value) {
		for (int f = 2; f < value / 2; f++) {
			if (value % f == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger value) {
		return value.isEven();
	}

	public static boolean isOdd(MyInteger value) {
		return value.isOdd();
	}

	public static boolean isPrime(MyInteger n) {
		return n.IsPrime();
	}

	public boolean equals(int value) {
		return (this.value == value);
	}

	public boolean equals(MyInteger value) {
		return equals(value.getValue());

	}

	public static int parseInt(char[] x) {
		return parseInt(new String(x));
	}

	public static int parseInt(String x) {
		return Integer.parseInt(x);
	}

}
