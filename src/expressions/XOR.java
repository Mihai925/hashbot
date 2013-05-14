package expressions;

public class XOR extends Expression {

	protected XOR(Expression left, Expression right) {
		super(left, right);
		this.symbol = "^";
	}

	@Override
	public int compute() {
		return left.compute() ^ right.compute();
	}
	

}
