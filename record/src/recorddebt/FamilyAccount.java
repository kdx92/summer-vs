package recorddebt;

public class FamilyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isFlag = true;

		String details = "收支\\t账户金额\\t收支金额\\t说明\n";

		while (isFlag) {

			System.out.println("--------收支记录--------\n");
			System.out.println("        1.收支明细");
			System.out.println("        2.登记收入");
			System.out.println("        3.登记支出");
			System.out.println("        4.退出\n");
			System.out.print("          请选择1-4输入\n");

//			获取用户的输入
			char selection = Utility.readMenuSelection();

			switch (selection) {
			case '1':
//				System.out.println("1.收支明细");
				System.out.println("--------当前收支明细记录--------");
				System.out.println(details);
				System.out.println("----------------------");
				break;

			case '2':
				System.out.println("2.登记收入");
				break;

			case '3':
				System.out.println("3.登记支出");
				break;

			case '4':
//				System.out.println("4.退出");
				System.out.print("确认是否退出（Y/N）：");
				char isExit = Utility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;

				}
//				break;

//			default:
//				break;
			}

		}

	}

}
