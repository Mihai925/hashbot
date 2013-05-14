package expressions;

import java.util.Random;

public class ExpressionFactory {
	final static int MAXVAL = 1 << 18;
	final static int EXPTYPES = 7;
	static Random generator = new Random();
	
	public static Num getNum() {
		return new Num(generator.nextInt(MAXVAL));
	}
	
	public static Var getVar() {
		return new Var("x");
	}
	
	public static Expression randomExpression(int maxDepth, String varName) {
		
		int chance = (1 + generator.nextInt(maxDepth));

		if (chance == maxDepth) {
			int dice = generator.nextInt(6) + 1;
			if (dice == 2 || dice == 6) {
				return getVar();
			}
			return getNum();
		}

		Expression left = randomExpression(maxDepth - 1, varName);
		Expression right = randomExpression(maxDepth - 1, varName);

		chance = generator.nextInt(EXPTYPES) + 1;

		switch (chance) {
		case 1:
			return new Plus(left, right);
		case 2:
			return new Minus(left, right);
		case 3:
			return new Times(left, right);
		case 4:
			return new Division(left, right);
		case 5:
			return new XOR(left, right);
		case 6:
			return new ShiftLeft(left, right);
		case 7:
			return new ShiftRight(left, right);
		default:
			return null;
		}
	}
	
	public static Expression optimizer(Expression exp) {
		
		
		return exp;
		
	}
}
