package homework;

public class Xiti3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0, a = 1, i = 1;

		do {

			sum = sum + a;

			i++;

			a = (1.0 / i) * a;

		} while (i <= 20);

		System.out.println("使用do-while循环计算的sum=" + sum);

		for (sum = 0, i = 1, a = 1; i <= 20; i++) {

			a = a * (1.0 / i);

			sum = sum + a;
		}

		System.out.println("使用for循环计算的sum=" + sum);
	}

}
