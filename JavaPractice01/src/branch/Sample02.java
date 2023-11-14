package branch;

import java.util.Random;

public class Sample02 {

	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(101);
		
		System.out.println(num);
		
		if(num >= 80) {
			System.out.println("S");
		}else if(80 > num & num >= 70) {
			System.out.println("A");
		}else if(num > 70 & num >= 60) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}

}
