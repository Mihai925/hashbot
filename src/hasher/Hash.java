package hasher;

import expressions.Expression;

public class Hash {

	int size;
	int[] HashTable;
	Expression expression;

	public Hash(int size, Expression expression) {
		this.size = size;
		HashTable = new int[size];
		this.expression = expression;
		clear();
	}

	public void addToHash(int x_value) {

		int key = expression.compute(x_value) % size;
		while(key<0) {
			key+=size;
		}
		++HashTable[key];

	}

	public void addValuesToHash(int[] values) {
		for (int x_value : values)
			addToHash(x_value);
	}

	public int getSize() {
		return size;
	}

	public int[] getHashTable() {
		return HashTable;
	}
	
	public void clear() {
		for(int i=0; i<HashTable.length; i++)
			HashTable[i] = 0;
	}
	
	public void printExpression() {
		System.out.println(expression);
	}

}
