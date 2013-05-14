package expressions;

public abstract class Expression {

	String symbol;
	Expression left, right;
	
	protected Expression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public void setLeft(Expression left) {
		this.left = left;
	}
	
	public void setRight(Expression right) {
		this.right = right;
	}
	
	public Expression getLeft() {
		return left;
	}
	
	public Expression getRight() {
		return right;
	}
	
	public abstract int compute();

	@Override
	public String toString() {
		return left + symbol + right;
	}
	
}
