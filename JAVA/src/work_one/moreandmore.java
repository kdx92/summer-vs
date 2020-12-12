package work_one;

public class moreandmore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		从控制台输入一个正整数，计算阶乘

		int result = 1;

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		int num = scanner.nextInt();
//		等待用户输入一个正整数

		for (int i = 1; i <= num; i++) {

			result *= i;

		}

		System.out.println(result);

	}

}
