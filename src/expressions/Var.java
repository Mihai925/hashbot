package expressions;

public class Var extends Expression {

	String name;
	int value;
	public Var(String name) {
		super(null, null);
		this.name = name;
		this.value = 0;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int compute() {
		return value;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
