package expressions;

public class Plus extends Expression {

	protected Plus(Expression left, Expression right) {
		super(left, right);
		this.symbol = "+";
	}

	@Override
	public int compute() {
		return left.compute() + right.compute();
	}
	

}
