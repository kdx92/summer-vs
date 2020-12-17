package homework;

public class Xiti1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0, a = 1;

		int i = 1;

		while (i <= 20) {

			sum = sum + a;

			i++;

			a = a * i;

		}

		System.out.println("sum=" + sum);

	}

}
