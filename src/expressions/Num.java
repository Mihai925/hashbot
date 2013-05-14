package expressions;

public class Num extends Expression {

	int value;
	protected Num(int value) {
		super(null, null);
		this.value = value;
	}
	
	@Override
	public int compute() {
		return value;
	}
	
	@Override
	public String toString() {
		return value + "";
	}

}
