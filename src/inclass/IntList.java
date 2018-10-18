package inclass;

public class IntList {
	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);
		L = new IntList(22, L);
		
		System.out.println(L.size());
		System.out.println(L.iterativesize());
		System.out.println(L.get(1));
	}
	
	
	public int first;
	public IntList rest;
	
	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}
	
	/** Return the size of the list using recursion
	 */
	public int size() {
		if(rest == null) {
			return 1;
		}
		return 1 + rest.size();
	}
	
	/** Return the size of the list using iterator.*/
	public int iterativesize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize = totalSize + 1;
			p = p.rest;
		}
		return totalSize;
	}
	
	/** Return the ith value in this list.*/
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

}
