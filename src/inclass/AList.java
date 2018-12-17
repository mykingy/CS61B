package inclass;

public class AList<E>{

    private E[] items;
    private int size;

    /* Invariants:
    addLast: The next item we want to add, will go into position size;
    getLast: The item we want to return is in position size - 1;
    size: The number of items in the list should be size;

     */

    /** Creates an empty list. */
    public AList() {
        items = (E[])new Object[100];
        size = 0;
    }

    /** Resizes the underlying array to the target capacity.
     *
     */
    private void resize(int capacity){
        E[] a = (E[])new Object[capacity];
        System.arraycopy(items,0, a, 0, size);
        items = a;

    }

    /** Inserts X into the back of the list. */
    public void addLast(E x) {
        if(size >= items.length) {
            resize(size * 2);
        }
        items[size] = x;
        size++;
    }

    /** Returns the item from the back of the list. */
    public E getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public E get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public E removeLast() {
        E x = getLast();
        items[size - 1] = null;
        size --;
        return x;
    }


    /** Inserts item into array arr at the given position.
     * Destructively.
     */
    public static int[] insert(int[] arr, int item, int position){
        int[] result = new int[arr.length + 1];
        position = Math.min(arr.length, position);
        for(int i = 0; i < position; i++){
            result[i] = arr[i];
        }

        result[position] = item;

        for(int i = position; i < arr.length; i++){
            result[i + 1] = arr[i];
        }

        return  result;

    }

    /** Reverse the items in arr.
     * Destructively.
     */
    public static void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int end = arr.length - i - 1;
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
        }
    }

    /** Replaces the number at index i with arr[i] copies of itself.
     * Eg: [3,2,1] --> [3,3,3,2,2,1]
     * Non-destructive.
     */
    public static int[] replicate(int[] arr){
        int total = 0;
        for(int item: arr){
            total += item;
        }

        int[] result = new int[total];
        int i = 0;
        for(int item:arr){
            for(int counter = 0; counter < item; counter++){
                result[i] = arr[item];
                i++;
            }
        }

        return result;
    }
}
