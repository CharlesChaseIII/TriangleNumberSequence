package rev.com.chall;

import java.util.ArrayList;
import java.util.List;

public class SequenceOfTriangles {

	int num = 0;

	int incrementer = 1;
	

	//List<Integer> triNum = new ArrayList<Integer>();
	
	public void numberSequence() {
		
		// Here I am generating my triNum numbers.
		while (calcDivisors(num) < 500) {
			
				
					num += incrementer;
					
					incrementer++;
				}
		}
	
	
	public int calcDivisors(int num) {
		int numOfFactors = 0;
		
		int sqrt = (int) Math.sqrt(num);
		
		for (int i = 1; i <= sqrt; i++) {
			if (num % i == 0) {
				numOfFactors += 2;
			}
			
		}
		
		if (sqrt * sqrt == num) {
			num--;
		}
		
		return numOfFactors;
	}
}
