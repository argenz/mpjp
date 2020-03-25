package s102;

public class Multithreading {
	static int counter = 0; //atomic variables
	
    public static void main(String[] args) {
        Runnable runnable = new Runner();
        
      //  int[] array = new int[1_000_000];

        Thread[] threads = { new Thread(runnable), new MyThread() };
        for (Thread t : threads) {
            t.start();
        }

        System.out.println("Main thread done");
    }
}

class Runner implements Runnable {
//	private boolean status = true; 
	
    @Override
    public void run() {
        System.out.println("The Runner runs");
        for (int i  = 0; i < 1000; i++) {
        	//....
        	if ( i == 12)  {
 //       		status = false;
        	}
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread runs");
    }
}