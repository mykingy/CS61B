package hw0;


public class BreakContinue {

	public static void windowPosSum(int[] a, int n) {
		for (int i = 0; i < a.length; i= i + 1) {
			if (a[i] < 0) {
				continue;
			}
			else{
				int number = 0;
				if (n + i < a.length - 1){
					number = n + i;}
				else{
					number = a.length - 1;}


				while (i < number) {
					a[i] = a[i] + a[number];
					number = number - 1;
				}

			}
		}
	}

	public static void main(String[] args) {
		int[] a = {1, 2, -3, 4, 5, 4};
		int n = 3;
		windowPosSum(a, n);

		// Should print 4, 8, -3, 13, 9, 4
		System.out.println(java.util.Arrays.toString(a));
		
		
		int[] b = {1, -1, -1, 10, 5, -1};
		int m = 2;
		windowPosSum(b,m);
		
		System.out.println(java.util.Arrays.toString(b));
		}
	
}
