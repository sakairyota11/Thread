package thread;

public class Thread_main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_run th = new Thread_run();
		Thread_run[] a = new Thread_run[2];
		Thread_runnable th2 = new Thread_runnable();
		Thread_runnable[] a2 = new Thread_runnable[2];
		
		for(int i = 0; i < 2; i++) {
			a[i]  = new Thread_run();
			a2[i]  = new Thread_runnable();
			a[i].start();
			a2[i].run();
		}
		
		th.start();
		th2.run();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("main‚©‚ço—Í : "+i);
		}

	}

}
