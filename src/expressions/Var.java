package expressions;


public class Var extends Expression {

	String name;
	public Var(String name) {
		super(null, null);
		this.name = name;
	}
	

	@Override
	public int compute(int x_value) {
		return x_value;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
