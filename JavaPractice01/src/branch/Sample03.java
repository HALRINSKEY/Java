package branch;

import java.util.Random;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++) {
			int num = rand.nextInt(46) - 10;
		
			System.out.println(num);
		}
		
	}

}
