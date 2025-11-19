package p2;

public class P2_main {

	public static void main(String[] args) {
		int[] numbers = {1, -8000, 5};
		int max = numbers[0];
		int minIndex = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] > max) {
				max = numbers [i];
				minIndex = i;
			}
		}
		
		System.out.print("Die größte Zahl ist die " + max + " mit dem Index " + minIndex + ".");
		

	}

}
