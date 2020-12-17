package learn;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 类型一
		String[] UpperLetter = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		String[] LowerLetter = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
				"r", "s", "t", "u", "v", "w", "x", "y", "z" };

		// 计算每一组有多少个
		int UpperLetterNum = UpperLetter.length;
		int LowerLetterNum = LowerLetter.length;

		// 产生随机数字
		int rand1 = (int) (Math.random() * UpperLetterNum);
		int rand2 = (int) (Math.random() * LowerLetterNum);

		// 组合
		String phrase = UpperLetter[rand1] + "" + LowerLetter[rand2];

		// 输出
		System.out.println("random letter: " + phrase);

		// 类型二
		String[] letter = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
				"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

		int LetterNum = letter.length;

		int r1 = (int) (Math.random() * LetterNum);
		int r2 = (int) (Math.random() * LetterNum);
		int r3 = (int) (Math.random() * LetterNum);
		int r4 = (int) (Math.random() * LetterNum);
		int r5 = (int) (Math.random() * LetterNum);
		int r6 = (int) (Math.random() * LetterNum);

		String LetterPhrase = letter[r1] + "" + letter[r2] + "" + letter[r3] + "" + letter[r4] + "" + letter[r5] + ""
				+ letter[r6];

		System.out.println("random password: " + LetterPhrase);
	}

}
