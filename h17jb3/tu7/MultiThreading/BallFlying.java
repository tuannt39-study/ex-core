package h17jb3.tu7.MultiThreading;

//TẠO TUYẾN TỪ GIAO TIẾP RUNNABLE 
//• Một lớp có thể trở thành một tuyến khi cài đặt giao tiếp Runnable (giao tiếp này chỉ có một phương thức run() duy nhất). 
//• Ví dụ: Tạo applet có quả bóng chạy

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class BallFlying extends Applet implements Runnable {
	Thread animThread = null;
	int ballX = 0, ballY = 50;
	int dx = 1, dy = 2;
	boolean stopRun = false;

	public void start() { // applet starts
		if (animThread == null) {
			animThread = new Thread(this);
			animThread.start();
		}
	}

	public void stop() { // applet stops
		stopRun = true;
	}

	public void run() {
		this.setBackground(Color.CYAN);
		while (!stopRun) {
			moveBall();
			delay(5);
		}
	}

	private void delay(int miliSeconds) {
		try {
			Thread.sleep(miliSeconds);
		} catch (Exception e) {
			System.out.println("Sleeperror !");
		}
	}

	private void moveBall() {
		ballX += dx;
		ballY += dy;
		if (ballY > getSize().height - 30)
			dy = -dy;
		if (ballX > getSize().width - 30)
			dx = -dx;
		if (ballY < 0)
			dy = -dy;
		if (ballX < 0)
			dx = -dx;
		repaint();
	}

	public void paint(Graphics g) {
		g.fillOval(ballX, ballY, 30, 30);
	}
}