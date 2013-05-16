package hashbot;

import hasher.Hash;
import expressions.ExpressionFactory;

public class Main {

	/**
	 * @param args
	 */
	static int NHash;
	static int MAXVALUE;
	static final int NTests = 1000;
	public static void main(String[] args) {
		
		NHash = 10;
		MAXVALUE = 1<<10;
		
		while(NHash>0) {
			Hash hash = new Hash(MAXVALUE, ExpUtils.optimize(ExpressionFactory.randomExpression(5)));
			//hash.printExpression();
			boolean ok = true;
			double scoreMean = 0;
			for(int i = 0; ok && i<NTests; i++) {
				hash.addValuesToHash(ScoringUtils.randomArray(10*MAXVALUE));
				double score = ScoringUtils.getScore(hash);
				hash.clear();
				if(score>500)
					ok = false;
				scoreMean+=score;
			}
			
			if(ok) {
				scoreMean /= NTests;
				System.out.print("F(x) = "); 
				hash.printExpression();
				System.out.println("Score = " + scoreMean);
				--NHash;
				System.out.println();
			}
		}
	}

}
