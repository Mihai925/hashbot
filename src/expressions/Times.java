package expressions;

public class Times extends Expression {

	protected Times(Expression left, Expression right) {
		super(left, right);
		this.symbol = "*";
	}

	@Override
	public int compute() {
		return left.compute() * right.compute();
	}
	

}
