class Print{
	synchronized void printNumbers(){
		for(int i = 1 ; i <= 50000 ; i++){
			
			System.out.print(i + " ");
			
			if(i == 25000){
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	synchronized void printText(){
		for(int i = 0 ; i < 20 ; i++){
			System.out.println("Running...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		notify();
	}
}


public class PrintNumsFromZeroTo {

	public static void main(String[] args) {
		
		Print pr = new Print();
		
		new Thread() {
			public void run() {
				pr.printNumbers();
			}
		}.start();
		
		new Thread() {
			public void run() {
				pr.printText();
			}
		}.start();

	}

}
