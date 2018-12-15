package inclass;

public class AList<E> {

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
}
