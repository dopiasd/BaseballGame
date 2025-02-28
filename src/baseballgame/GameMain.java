package baseballgame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GameMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RandomNumber numbers = new RandomNumber();
		
		numbers.rdnb();

		numbers.numberPrint();
		

		while (true) {
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			
			int S = 0;
			int B = 0;
			int OUT = 0;
			
			while (true) {
				
				System.out.print("1번째 번호를 입력해주세요(1-9까지의 숫자) :");
				try {
					num1 = sc.nextInt();

					if (num1 > 0 && num1 < 10) {
						break;

					} else {
						System.out.println("1부터 9까지의 숫자만 입력해주세요.");
					}
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요.");

					sc.nextLine();

				}

			}

			while (true) {
				System.out.print("2번째 번호를 입력해주세요(1-9까지의 숫자) :");
				try {
					num2 = sc.nextInt();

					if (num1 > 0 && num1 < 10) {
						break;

					} else {
						System.out.println("1부터 9까지의 숫자만 입력해주세요.");
					}
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요.");

					sc.nextLine();

				}

			}

			while (true) {
				System.out.print("3번째 번호를 입력해주세요(1-9까지의 숫자) :");
				try {
					num3 = sc.nextInt();

					if (num1 > 0 && num1 < 10) {
						break;

					} else {
						System.out.println("1부터 9까지의 숫자만 입력해주세요.");
					}
				} catch (InputMismatchException e) {
					System.out.println("숫자만 입력해주세요.");

					sc.nextLine();

				}
			}

			for (int i = 0; i >= 3; i++) {
				
			}
		}
	}

}
