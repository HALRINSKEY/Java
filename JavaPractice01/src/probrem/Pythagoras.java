package probrem;

public class Pythagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a = 0; a < 101; a++) {
			for(int b = 0; b < 101; b++) {
				for(int c = 0; c < 101; c++) {
					int p = a*a + b*b;
					int q = c*c;
					if(p == q) {
						System.out.println(a + "," + b + "," + c);
					}
					
				}
			}
		}

	}

}
