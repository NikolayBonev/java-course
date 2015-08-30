package withthreadpool;

import java.util.concurrent.*;

public class FiveThreads{
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(7);
		
		for(int i = 0 ; i < 5 ; i++){
			Threads thread = new Threads("Thread " + i);
			executor.execute(thread);
		}
		
		executor.shutdown();
		while (!executor.isTerminated()) {
		}
	}

}