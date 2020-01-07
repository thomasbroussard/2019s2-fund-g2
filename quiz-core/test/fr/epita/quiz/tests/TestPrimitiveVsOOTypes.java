package fr.epita.quiz.tests;

public class TestPrimitiveVsOOTypes {
	static Double balance;
	static double balancePrimitive;

	public static void main(String[] args) {

		System.out.println(balance);
		System.out.println(balancePrimitive);

		balance = 0d;
		balancePrimitive = 0;
		System.out.println("after set");
		System.out.println(balance);
		System.out.println(balancePrimitive);

	}

}
