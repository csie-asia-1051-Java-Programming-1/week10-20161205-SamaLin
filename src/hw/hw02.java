package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int same = 0;
		int data[] = new int[4];
		int ram = 0;
		for (int i = 0; i < 4; i++) {
			data[i] = scn.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (data[j] > data[i]) {
					ram = data[i];
					data[i] = data[j];
					data[j] = ram;
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (data[j] == data[i]) {
					same = same + 1;
				}
			}
		}

		if (same == 1) {
			for (int i = 0; i < 4 - 1; i++) {
				if (data[i] == data[i + 1]) {
					System.out.println(data[i] + data[i + 1]);
				}
			}
		} else if (same == 2) {
			System.out.println(data[0] + data[1]);
		} else if (same == 3 || same == 0) {
			System.out.println("R");
		} else if (same == 6) {
			System.out.println("³q±þ");
		}
//		System.out.println(same);
	}

}
