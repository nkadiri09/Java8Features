package com.naren.kadiri.practice;

// program to add sum of consecutive array elements and finding the max element 
class ArraySum {

	public static void main(String[] args) {

		int arr[] = { 4, 10, 15, 5, 6 };
		int n = arr.length;
		ArraySum as = new ArraySum();
		as.pairwiseSum(arr, n);
	}

	int sum = 0;

	private void pairwiseSum(int[] arr, int n) {
		int sumArr[] = new int[n];
		for (int i = 0; i + 1 < n; i++) {
			sum = arr[i] + arr[i + 1];
			sumArr[i] = sum;
		}
		System.out.println("printing sum");
		printAll(sumArr);

		findBig(sumArr);
	}

	private void findBig(int[] sumArr) {
		int max = sumArr[1];
		for (int i = 0; i < sumArr.length; i++) {
			if (max < sumArr[i]) {
				max = sumArr[i];
			}
		}
		System.out.println("max elemetn is: " + max);
	}

	private void printAll(int[] arr) {
		for (int i = 0; i + 1 < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}