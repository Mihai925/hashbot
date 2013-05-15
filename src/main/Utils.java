package main;

import java.util.Random;

import expressions.*;

public class Utils {

	public static int x_value;
	private static boolean isTerminal(Expression exp) {
		return isNum(exp) || isVar(exp);
	}
	
	private static boolean isNum(Expression exp) {
		return exp instanceof Num;
	}
	
	private static boolean isVar(Expression exp) {
		return exp instanceof Var;
	}
	
	public static Expression optimize(Expression exp) {
		
		Expression left = exp.getLeft();
		Expression right = exp.getRight();
		Random generator = new Random();
		int _1or2 = generator.nextInt(2) + 1;
		if(!isTerminal(exp)) {
			
			if(!isTerminal(left))
				exp.setLeft(optimize(left));
			if(!isTerminal(right))
				exp.setRight(optimize(right));
			
			_1or2 = generator.nextInt(2)+1;
			if(isNum(left) && isNum(right)) {
				if(_1or2 == 1) exp.setLeft(ExpressionFactory.getVar());
				if(_1or2 == 2) exp.setRight(ExpressionFactory.getVar());
				
			} else if(isVar(left) && isVar(right)) {
				if(_1or2 == 1) exp.setLeft(ExpressionFactory.getNum());
				if(_1or2 == 2) exp.setRight(ExpressionFactory.getNum());
			}
			
		}
		
		return exp;
	}

}
