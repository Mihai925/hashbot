package expressions;

public class Times extends Expression {

	protected Times(Expression left, Expression right) {
		super(left, right);
		this.symbol = "*";
	}

	@Override
	public int compute(int x_value) {
		return left.compute(x_value) * right.compute(x_value);
	}
	

}
