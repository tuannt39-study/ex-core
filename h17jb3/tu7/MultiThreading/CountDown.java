package h17jb3.tu7.MultiThreading;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//VÍ DỤ: ĐẾM NGƯỢC
//LỚP TIMER 
//• Hai lớp liên quan tới xử lý công việc theo thời gian: – javax.swing.Timer – java.util.Timer 
//• Lớp java.swing.Timer – Đơn giản, dễ dùng trên GUI 
//• Lớp java.util.Timer – Nhiều tính năng hơn java.swing.Timer

@SuppressWarnings("serial")
public class CountDown extends Applet implements ActionListener {
	private TextField timeField;
	private Button startButton;
	private Button stopButton;
	private javax.swing.Timer timer;
	private int count;

	public void init() {
		timeField = new TextField(6);
		timeField.setFont(new Font("sansserif", Font.PLAIN, 18));
		startButton = new Button("Start");
		stopButton = new Button("Stop");
		add(timeField);
		add(startButton);
		add(stopButton);
		startButton.addActionListener(this);
		stopButton.addActionListener(this);
		timer = new javax.swing.Timer(10, this);
		count = 0;
	} // end init()

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == startButton)
			timer.start();
		else if (e.getSource() == stopButton)
			timer.stop();
		else {
			count++;
			int hsecond = count % 100;
			int totalSecond = (count / 100);
			int h = totalSecond / 3600;
			int secondLeft = totalSecond % 3600;
			int m = secondLeft / 60;
			int s = secondLeft % 60;
			timeField.setText(" " + h + ":" + m + ":" + s + ":" + hsecond);
		}
	}
}