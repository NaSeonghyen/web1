package Main;

import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//ù��°
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//�ι�°
		for(int i = 1; i < num; i++) {
			for(int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}