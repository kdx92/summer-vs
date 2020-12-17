package learn;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		

//		int a = 7;

//		boolean flag = true;

//		default a is a prime number

		int count = 0;

		for (int a = 2; a <= 100; a++) {

			boolean flag = true;

			for (int i = 2; i < a; i++) {

//				i from 2 to a-1

				if (a % i == 0) {

//	 		a is not a prime number

					flag = false;

					break;

				}

			}

			if (flag == true) {

				count++;

				System.out.print(a + " ");

				if (count % 8 == 0) {

					System.out.println();
				}

			}

		}

	}

}
