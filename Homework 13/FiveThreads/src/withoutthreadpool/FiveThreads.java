package withoutthreadpool;

public class FiveThreads{
	
	public static void main(String[] args) {
		
		Thread threadNiki = new Threads();
		Thread threadMila = new Threads();
		Thread threadVassi = new Threads();
		Thread threadGeri = new Threads();
		Thread threadMilen = new Threads();
		
		threadNiki.setName("Nikolay");
		threadMila.setName("Mila");
		threadVassi.setName("Vassi");
		threadGeri.setName("Geri");
		threadMilen.setName("Milen");
		
		threadNiki.start();
		threadMila.start();
		threadVassi.start();
		threadGeri.start();
		threadMilen.start();
	}

}
