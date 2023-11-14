package branch;

import java.util.Random;

public class Sample01 {
	public static void main(String[] args) {
		Random rand = new Random(); 
		int num = rand.nextInt(10);
		System.out.println(num);
		
		if(num >= 5) {
			System.out.println("5以上");
		}
		
		
	}
}
