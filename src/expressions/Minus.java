package expressions;

public class Minus extends Expression {

	protected Minus(Expression left, Expression right) {
		super(left, right);
		this.symbol = "-";
	}

	@Override
	public int compute(int x_value) {
		return left.compute(x_value) - right.compute(x_value);
	}

}
