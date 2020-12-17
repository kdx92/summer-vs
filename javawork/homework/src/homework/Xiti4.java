package homework;

public class Xiti4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, i, j;

		for (i = 1; i <= 1000; i++) {

			for (j = 1, sum = 0; j < i; j++) {

				if (i % j == 0) {

					sum = sum + j;
				}

			}

			if (sum == i) {

				System.out.println("完数：" + i);
			}

		}

	}

}
