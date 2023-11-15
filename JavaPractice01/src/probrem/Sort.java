package probrem;

import java.util.Random;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int n[] = new int [100];
		
		for(int i = 0; i < 100; i++) {
			n[i] = rand.nextInt(101);
		}
		
		display(n);
		
		System.out.println();
		
		sort(n);
		
		display(n);
		

	}
	
	private static void display(int n[]) {
		for(int i = 0; i < 100; i++) {
			System.out.println(n[i]);
		}
	}
	
	private static void sort(int n[]) {
		int temp;
		for(int i = 0; i < 99; i++) {
			for(int j = 0; j < 99; j++) {
				if(n[j] > n[j + 1]) {
					temp = n[j + 1];
					n[j + 1] = n[j];
					n[j] = temp;	
				}
			}
		}
	}

}
