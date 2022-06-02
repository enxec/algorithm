package lvl_5;

class Test {
	long sum(int[] a) {
		long sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}

public class Qu001 {

	public static void main(String[] args) {
		Test ts = new Test();
	}

}
