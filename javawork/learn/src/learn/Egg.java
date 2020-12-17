package learn;

import java.util.ArrayList;

public class Egg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Egg> myList = new ArrayList<Egg>();

//		create List which type is Egg

//		the new ArrayList will create on heap

//堆
		Egg s = new Egg();

		myList.add(s);

//		add element

//		this ArrayList will create a box and leave Egg objection in it

		Egg b = new Egg();

		myList.add(b);

//		add element again

//		this ArrayList will create a box and leave Egg objection in it again

		int theSize = myList.size();

		System.out.println(theSize);

//		return the number of element in myList

		boolean isIn = myList.contains(s);

		System.out.println(isIn);

//		search the specific element	

//		myList contains the s 所引用的 Egg 对象

		int idx = myList.indexOf(b);

		System.out.println(idx);

//		search the specific element's position

//		return 1

		boolean empty = myList.isEmpty();

		System.out.println(empty);

//		is empty

		myList.remove(s);

//		myList is smaller

		theSize = myList.size();

		System.out.println(theSize);

	}

}
