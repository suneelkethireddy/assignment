package Answers;
public class SumCombinations {

	public static void main(String[] args) {
		int[] array1 = { 1, 4, 7, 10, 13 };
		int[] array2 = { 10, 20, 30, 40, 50 };
		nearestSum(array1, array2, 32);
	}

	public static void nearestSum(int[] a, int[] b, int x) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int sum = a[i] + b[j];
				if (sum >= (x - 1) && sum <= (x + 1))         //nearest value to X
				{  
					System.out.println(a[i] + "&" + b[j]);
				}
			}

		}
	}
}
// Time complexity is 0(N square)