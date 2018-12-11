package inclass;

public class IntList {
	public static void main(String[] args) {
		IntList L = new IntList(2, null);
		L = new IntList(1, L);

		System.out.println(L.size());
		System.out.println(L.iterativesize());
		L.squareAdd(5);
		System.out.println(L.toString());
		L.squareAdd(7);
		System.out.println(L.toString());
	}


	public int first;
	public IntList rest;
	public int size;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
		size = 1;
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

	/** Returns an IntList identical to L, but with
	 * each element incremented by x. L is not allowed
	 * to change. */
	public static IntList incrList(IntList L, int x) {
		IntList m;
		if (L == null) return L;
		else { m = new IntList(L.first + x, incrList(L.rest, x));
		return m;
		}

	}


	/** Returns an IntList identical to L, but with
	 * each element incremented by x. Not allowed to use
	 * the 'new' keyword. */
	public static IntList dincrList(IntList L, int x) {
		if (L == null) return L;
		L.first = L.first + x;
		L.rest = dincrList(L.rest, x);
		return L;
	}

	public void addAdjacent() {
		IntList p = this;
		if (p == null) return;
		IntList s = p;
		while(s.rest != null) {
			if(s.first == s.rest.first) {
				s.first = s.first * 2;
				s.rest = s.rest.rest;
				s = p;
				break;
			}
			else {
				s = s.rest;
			}
		}

	}
	
	/** Square each item in the list when insert one.*/
	
	public void squareAdd(int x) {
		IntList p = this;
		
		while(p.rest!= null) {
			p.rest = new IntList(p.first * p.first,p.rest);
			p = p.rest.rest;
		}
		p.rest = new IntList(p.first * p.first, p.rest);
		p.rest.rest = new IntList(x, null);
	}
	
	public String toString() {
		String str = String.valueOf(first);
		if (rest != null) {
			str = str + " " + rest.toString();
		}
		return str;
	}
}
