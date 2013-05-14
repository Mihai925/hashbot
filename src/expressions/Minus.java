package expressions;

public class Minus extends Expression {

	protected Minus(Expression left, Expression right) {
		super(left, right);
		this.symbol = "-";
	}

	@Override
	public int compute() {
		return left.compute() - right.compute();
	}

}
