package inclass;

public class Sort {
    /** Sorts strings destructively
     *
     */
    public static void sort(String[] x){
        // find the smallest item; [done]
        // move it to the front; [done]
        // selection Sort the rest (using recursion)

       sort(x, 0);




    }

    /** Helper function. Sorts x starting at position start.
     *
     */
    public static void sort(String[]x, int start){
        if(start == x.length) return;
        int smallestIndex = findSmallest(x, start);
        swap(x, start, smallestIndex);
        sort(x, start + 1);
    }

    /** Helper function. Return the index of smallest String in x.
     */
    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for(int i = start; i < x.length; i++){
            int compare = x[i].compareTo(x[smallestIndex]);
            // if x[i] < x[smallestIndex], compare will be -1;
            if(compare < 0){
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    /** Helper function. Swap item a with b. */
    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }



}
