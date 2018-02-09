package Multithreading;

public class Runner {
	public static void main(String[] args) {
		//anonymous Innerclass
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < i; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();
	}
}
