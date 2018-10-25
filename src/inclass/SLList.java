/** An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within. */

package inclass;

public class SLList {
	
	private static class IntNode {
		public int item;
		public IntNode next;
		
		public IntNode(int i, IntNode n ) {
			item = i;
			next = n;
		}
	}
	
	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;
	
	/** creates an empty SLList. */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}
	
	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size += 1;
	}

	/** Adds x to the front of the list */
	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}
	
	/** Returns the first items in the list. */
	public int getFirst() {
		return sentinel.next.item;
	}
	
	/** Adds x to the end of the list */
	public void addLast(int x) {
		IntNode p = sentinel;
		
		/* Move p until it reaches the end of the list. */
		while (p.next != null) {
			p = p.next;
		}
		p.next = new IntNode(x, null);
		size += 1;
	}
	
	
	/** return the size of the list. */
	public int size() {
		return size;

	}
	
	
	public static void main(String[] args) {
		/* Creates a list of one integer, namely 10 */
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
	}
}
