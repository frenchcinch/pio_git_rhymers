package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private int[] numbers = new int[SIZE];

	public int total = -1;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == -1;
		}
		
			public boolean isFull() {
				return total == SIZE-1;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return -1;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return -1;
						return numbers[total--];
					}

}
