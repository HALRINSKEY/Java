package array;

import java.util.Random;

public class Sample02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int da[][] = new int[3][3];
		Random rand = new Random();
		int maxNum = 0;
		int minNum = 9;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				da[i][j] = rand.nextInt(10);
				System.out.print(da[i][j]);
				
				maxNum = Math.max(maxNum, da[i][j]);
				minNum = Math.min(minNum, da[i][j]);
				
			}
			System.out.println();
		}
		
		System.out.println(maxNum);
		System.out.println(minNum);
	}

}
