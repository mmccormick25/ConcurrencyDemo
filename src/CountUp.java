
final class CountUp extends Thread {
	
	// Variable is only used in this class so it is made private
	private short count;
	
	// Holds mutex to synchronize with
	private Object mutex;
	
	// Constructor for thread
	CountUp(short count, Object mutex) {
		this.count = count;
		this.mutex = mutex;
	}
	
	public void run() {
		// Entering critical region
		synchronized(mutex) {
			// Loops until count is 20
			while (count < 20) {
				// Incrementing count
				count++;
				// Printing out count
				System.out.print(count + " ");
			}
			
			// Printing out new line
			System.out.println();
		}
		
	}
}
