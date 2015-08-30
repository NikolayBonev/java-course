package Var2;

class ThreadZPrint extends Thread{
	public void run(){
		for(int i = 0 ; i < 1000000 ; i++){
			System.out.print("z");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadPrintNumbers extends Thread{
	public void run(){
		for(int i = 50000 ; i >= 0 ; i--){
			System.out.print(i + " ");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadPrintSleep extends Thread{
	public void run(){
		for(int i = 0 ; i < 10000 ; i++){
			System.out.println("sleep");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreeThreads2 {

	public static void main(String[] args) {
		Thread printZ = new ThreadZPrint();
		Thread printNumbers = new ThreadPrintNumbers();
		Thread printSleep = new ThreadPrintSleep();
		
		printZ.run();

		printNumbers.run();
		
		printSleep.run();
	}

}
