package expressions;

public abstract class Expression {

	String symbol;
	Expression left, right;
	
	protected Expression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public abstract int compute();

	@Override
	public String toString() {
		return left + symbol + right;
	}
	
}
