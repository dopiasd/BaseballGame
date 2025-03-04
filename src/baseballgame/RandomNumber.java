package baseballgame;

import java.util.Random;
import java.util.Arrays;

public class RandomNumber {

	int[] numbers = new int[3];

	public int[] rdnb() {
		Random random = new Random();

		for (int i = 0; i < numbers.length; i++) {
			int num;
			num = random.nextInt(9)+ 1;

			boolean duplicateCheck = false;

			for (int j = 0; j < i; j++) {
				if (numbers[j] == num) {
					duplicateCheck = true;
					break;
				}
			}

			if (!duplicateCheck) {
				numbers[i] = num;
			} else {
				i--;
			}
		}
		
		return numbers;

	}

	public void numberPrint() {

		System.out.println(Arrays.toString(numbers));
	}

}
