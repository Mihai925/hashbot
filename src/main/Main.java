package main;

import expressions.ExpressionFactory;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Utils.optimize(ExpressionFactory.randomExpression(5, "x")));

	}

}
