package com.naren.kadiri.test;

public class HighestSum {

	public static void main(String[] args) {

		int a[] = new int[] { 10, 78, 20, 56, 99, 25 };

		HighestSum hs = new HighestSum();

		hs.getHsum(a);

	}

	private void getHsum(int[] a) {

		int[] twoSum = new int[] { sumOfTwo(a[0], a[1]), sumOfTwo(a[2], a[3]), sumOfTwo(a[4], a[5]) };

		for (int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}

		int max;

		max = twoSum[0];

		for (int i = 0; i < twoSum.length; i++) {
			if (max < twoSum[i]) {
				max = twoSum[i];
			}
		}

		System.out.println("max element is: " + max);

	}

	private int sumOfTwo(int i, int j) {
		return i + j;
	}

}
