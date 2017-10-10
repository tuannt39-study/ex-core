package h17jb3.tu7.MultiThreading;
//VÍ DỤ VỀ ĐA TUYẾN (TT)
//Hai kỹ thuật đa nhiệm cơ bản: 
//– Đa tiến trình (Process-based multitasking): Nhiều chương trình chạy đồng thời. Mỗi chương trình có một vùng dữ liệu độc lập. 
//– Đa tuyến (Thread-based multitasking): Một chương trình có nhiều tuyến cùng chạy đồng thời. Các tuyến dùng chung vùng dữ liệu của chương trình.
//Tuyến là mạch thi hành độc lập của một tác vụ trong chương trình. • Một chương trình có nhiều tuyến thực hiện cùng lúc gọi là đa tuyến

class PrintThread extends Thread {
	private int sleepTime;

	public PrintThread(String name) {
		super(name);
		sleepTime = (int) (Math.random() * 5000);
		System.out.println(getName() + " have sleep time: " + sleepTime);
	}

	// method run is the code to be executed by new thread
	public void run() {
		try {
			System.out.println(getName() + " starts to sleep");
			Thread.sleep(sleepTime);
		}
		// sleep() may throw an InterruptedException
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " done sleeping");
	}
}

public class ThreadTest {
	public static void main(String[] args) {
		PrintThread thread1 = new PrintThread("thread1");
		PrintThread thread2 = new PrintThread("thread2");
		PrintThread thread3 = new PrintThread("thread3");
		System.out.println("Starting threads");
		thread1.start(); // start and ready to run
		thread2.start(); // start and ready to run
		thread3.start(); // start and ready to run
		System.out.println("Threads started, main ends\n");
	}
}

//MỘT SỐ PHƯƠNG THỨC CỦA THREAD
//void sleep(long millis); // ngủ
//• void yield(); // nhường điều khiển
//• void interrupt(); // ngắt tuyến
//• void join(); // yêu cầu chờ kết thúc
//• void suspend(); // deprecated
//• void resume(); // deprecated
//• void stop(); // deprecated