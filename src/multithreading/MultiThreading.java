package multithreading;
import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;

import com.sun.jna.platform.win32.Tlhelp32;

public class MultiThreading implements Runnable {

static	int count = 0;

	@Override
	public void run() {

		if (count % 2 == 0) {
			System.out.println("First...");
			for (int i = 0; i < 10; i = i + 2) {
				System.out.println(i);
			}
			count++;
			
		} else {
			System.out.println("Second...");
			for (int j = 1; j < 10; j = j + 2) {
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new MultiThreading());
		Thread t2 = new Thread(new MultiThreading());
		
		
		t1.start();
		t1.join();
		
		
		
		t2.start();
		
	}

}
