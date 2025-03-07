
final class CountDown extends Thread {
	
	// Variable is only used in this class so it is made private
	private short count;
	
	// Holds mutex to synchronize with
	private Object mutex;
	
	// Constructor for thread
	CountDown(short count, Object mutex) {
		this.count = count;
		this.mutex = mutex;
	}
	
	public void run() {
		// Entering critical region
		synchronized (mutex) {
			// Loops until count is 0
			while (count > 0) {
				// Printing count
				System.out.print(count + " ");
				// Decrementing count
				count--;
			}
		}		
	}
}
