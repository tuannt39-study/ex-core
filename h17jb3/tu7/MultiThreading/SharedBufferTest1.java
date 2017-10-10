package h17jb3.tu7.MultiThreading;

//Ví dụ về P - C: Có đồng bộ
//Giải pháp đồng bộ hoá: 
//– Trước khi tiếp tục sinh dữ liệu và đưa vào buffer, Producer phải chờ (wait) Consumer đọc xong dữ liệu từ buffer. 
//– Khi Consumer đọc xong dữ liệu, nó sẽ thông báo (notify) cho Producer biết để tiếp tục sinh dữ liệu. 
//– Nếu Consumer thấy trong buffer không có dữ liệu hoặc dữ liệu đó đã được đọc rồi, nó sẽ chờ (wait) cho tới khi nhận được thông báo có dữ liệu mới. 
//– Khi Producer sản xuất xong dữ liệu, nó thông báo (notify) cho Consumer biết.

class Buffer {
	private int buffer = -1;

	public void set(int value) {
		buffer = value;
	}

	public int get() {
		return buffer;
	}
}

class Producer extends Thread {
	private Buffer sharedBuffer;

	public Producer(Buffer shared) {
		super("Producer");
		sharedBuffer = shared;
	}

	public void run() {
		for (int count = 1; count <= 5; count++) {
			try {
				Thread.sleep((int) (Math.random() * 3000));
				sharedBuffer.set(count);
				System.out.println("Producer writes " + count);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " finished.");
	}
}

class Consumer extends Thread {
	private Buffer sharedBuffer;

	public Consumer(Buffer shared) {
		super("Consumer");
		sharedBuffer = shared;
	}

	public void run() {
		for (int count = 1; count <= 5; count++) {
			try {
				Thread.sleep((int) (Math.random() * 3000));
				System.out.println("Consumer reads " + sharedBuffer.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " finished.");
	}
}

public class SharedBufferTest1 {
	public static void main(String[] args) {
		// create shared object used by threads
		Buffer sharedBuffer = new Buffer();
		// create producer and consumer objects
		Producer producer = new Producer(sharedBuffer);
		Consumer consumer = new Consumer(sharedBuffer);
		producer.start(); // start producer thread
		consumer.start(); // start consumer thread
	}
}