package expressions;

public class ShiftRight extends Expression {

	protected ShiftRight(Expression left, Expression right) {
		super(left, right);
		this.symbol = ">>";
	}

	@Override
	public int compute() {
		return left.compute() >> right.compute();
	}
	

}
