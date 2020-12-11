package work_one;

public class cal1000and7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		计算1000以内所有不能被7整除的整数之和

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			if (i % 7 != 0) {

				sum += i;
			}

		}
		System.out.println(sum);

	}

}
