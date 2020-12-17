package homework;

public class Xiti2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;

		for (j = 2; j <= 100; j++) {

			for (i = 2; i <= j / 2; i++) {

				if (j % i == 0) {

					break;
				}

			}

			if (i > j / 2) {

				System.out.print(" " + j);

			}

		}

	}

}
