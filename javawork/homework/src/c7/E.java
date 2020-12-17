package c7;

import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		double sum = 0;

		int m = 0;

		while (reader.hasNextDouble()) {

			double x = reader.nextDouble();

			assert x < 100 : "数据不合理";

			m = m + 1;

			sum = sum + x;

		}

		System.out.printf("%d个数的和为%f\n", m, sum);

		System.out.printf("%d个数的平均值是%f\n", m, sum / m);

	}

}
