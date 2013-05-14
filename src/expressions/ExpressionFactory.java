package expressions;

import java.util.Random;

public class ExpressionFactory {
	final static int MAXVAL = 1 << 18;
	final static int EXPTYPES = 7;

	public static Expression randomExpression(int maxDepth, String varName) {
		Random generator = new Random();
		int chance = (1 + generator.nextInt(maxDepth));

		if (chance == maxDepth) {
			int dice = generator.nextInt(6) + 1;
			if (dice == 2 || dice == 6) {
				return new Var("x");
			}
			return new Num(generator.nextInt(MAXVAL));
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
}
