public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        int temp = 0;
        while (x < 10) {
        	temp = x;
        	x = x + 1;
        	sum = sum + temp;
            System.out.print(sum + " ");
        }
    }
}