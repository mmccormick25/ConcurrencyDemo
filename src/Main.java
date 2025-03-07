final class Main {
	
	// This mutex will be passed to both threads to synchronize them
	private static Object mutex = new Object();
	
	public static void main(String[] args) {
		// Creating threads and passing start value + mutex
		CountUp t1 = new CountUp((short)0, mutex);
		CountDown t2 = new CountDown((short)20, mutex);
		// Starting theads
		t1.start();
		t2.start();
	}
}
