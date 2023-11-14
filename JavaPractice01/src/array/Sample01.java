package array;

import java.util.Random;

public class Sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int n[] = new int[7];
		for (int i = 0; i < 7; i++) {
			n[i] = rand.nextInt(11);
			System.out.println("n[" + i + "] = " + n[i]);
		}
	}

}
