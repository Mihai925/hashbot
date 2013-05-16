package expressions;

public abstract class Expression {

	String symbol;
	Expression left, right;
	protected int x_value;
	protected Expression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
	
	public int getValue() {
		return x_value;
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
	
	public abstract int compute(int x_value);

	@Override
	public String toString() {
		return "(" + left + symbol + right + ")";
	}
	
}
