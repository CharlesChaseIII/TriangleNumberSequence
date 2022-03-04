package rev.com.chall;

import java.util.ArrayList;
import java.util.List;

public class NumberSequenceApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SequenceOfTriangles numSeq = new SequenceOfTriangles();
			//List<Integer> newNum = new ArrayList<Integer>();
			
			//numSeq.numberSequence(newNum,30);
			
			//numSeq.findNumWithDivisors(newNum);
			
			//numSeq.numberSequence();
			
			int num = 0;

			int incrementer = 1;
			
			while (numSeq.calcDivisors(num) < 500) {
				
				
				num += incrementer;
				
				incrementer++;
			}

			System.out.println("The first triangle number with"
					+ " 500 divisors is " + num);
			System.out.println(incrementer);
	}

}
