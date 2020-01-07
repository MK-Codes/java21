package mkcodes.java21.lesson2;

public class Investment {

	public static void main(String[] args) {

		int investment = 14_000;
		double afterOneYear = investment * 1.4;
		double afterTwoYears = afterOneYear - 1_500;
		double afterThreeYears = afterTwoYears * 1.12;
		System.out.println("Initial investment: £" + investment);
		System.out.println("After one year: £" + afterOneYear);
		System.out.println("After two years: £" + afterTwoYears);
		System.out.println("After three years: £" + afterThreeYears);
	}

}
