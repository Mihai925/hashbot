package expressions;

public class Division extends Expression {

	protected Division(Expression left, Expression right) {
		super(left, right);
		this.symbol = "/";
	}

	@Override
	public int compute() {
		return left.compute() / right.compute();
	}
	

}
