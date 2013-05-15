package expressions;

public class OR extends Expression {

	protected OR(Expression left, Expression right) {
		super(left, right);
		this.symbol = "|";
	}

	@Override
	public int compute(int x_value) {
		return left.compute(x_value) | right.compute(x_value);
	}
	

}
