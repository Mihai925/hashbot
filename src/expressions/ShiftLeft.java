package expressions;

public class ShiftLeft extends Expression {

	protected ShiftLeft(Expression left, Expression right) {
		super(left, right);
		this.symbol = "<<";
	}

	@Override
	public int compute() {
		return left.compute() << right.compute();
	}
	

}
