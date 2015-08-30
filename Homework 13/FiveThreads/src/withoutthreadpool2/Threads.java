package withoutthreadpool2;

class Threads extends Thread{

	private long delay;
	
	public Threads() {
		delay = 0;
	}
	
	public Threads(long delay){
		setDelay(delay);
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}
	
	public void run(){
		printThread();
	}
	
	synchronized void printThread(){
		System.out.println("The thread is started!\t" + "Name of thread: " + getName());
		
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Òhe thread complete!\t" + "Name of thread: " + getName());
	}
	
}