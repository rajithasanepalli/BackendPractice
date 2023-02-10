package javaBasics;

import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		int a[] = { 58, 24, 13, 15, 63, 9, 8, 81, 1, 78 };
		int n = a.length;
		int b[] = new int[(a.length) / 2];
		int c[] = new int[n - b.length];
		
		for (int i = 0; i <= 9; i++) {
			System.out.print("" + a[i] + "\t");

			if (i < b.length) {
				b[i] = a[i];

			}

			else {
				c[i - b.length] = a[i];
			}

		}
		System.out.println("\n");

		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

	}

}
