package withoutthreadpool2;



public class FiveThreads{
	
	public static void main(String[] args) {
		
		Thread threadNiki = new Threads(6000);
		Thread threadMila = new Threads(1000);
		Thread threadVassi = new Threads(3000);
		Thread threadGeri = new Threads(7000);
		Thread threadMilen = new Threads(8000);
		
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
