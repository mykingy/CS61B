package hw0;

public class ArrayMax {
	
	public static void main(String[] args) {
	      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
	      System.out.print(max(numbers));
	   }
	
	
	/** Returns the maximum value from m.
	 */
	
	public static int max(int[] m) {
		
		int maxValue = 0;
		
		if (m.length == 0) {
			maxValue = m[0];
		}
		else {
			for (int i = 0; i < m.length; i = i+1) {
				if (m[i] >= maxValue) {
					maxValue = m[i];
				}
				
			}
		}
		
		 return maxValue;
	}

}
