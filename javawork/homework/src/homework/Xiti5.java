package homework;

public class Xiti5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 8, item = m, i = 1;

		long sum = 0;

		for (i = 1, sum = 0, item = m; i <= 10; i++) {

			sum = sum + item;

			item = item * 10 + m;

		}

		System.out.println(sum);
	}

}
