package mkcodes.java21.lesson2;

public class Division {

	public static void main(String[] args) {
		int valOne = 14;
		int valTwo = 3;
		System.out.println("Value one: " + valOne);
		System.out.println("Value two: " + valTwo);
		System.out.println(valOne + " divided by " + valTwo + ":");
		int result = valOne / valTwo;
		int remainder = valOne % valTwo;
		System.out.println(result + "\tremainder" + remainder);
	}
}
