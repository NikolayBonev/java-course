package withoutthreadpool;

import java.util.Random;

class Threads extends Thread{

	private long delay;
	
	public Threads() {
		Random rand = new Random();
		
		setDelay((long)(rand.nextInt(10)));		
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}
	
	public void run(){
		printThread();
	}
	
	private void printThread(){
		System.out.println("The thread is started!\t" + "Name of thread: " + getName());
		
		try {
			Thread.sleep(delay*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Òhe thread complete!\t" + "Name of thread: " + getName());
	}
	
}