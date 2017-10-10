package h17jb3.tu6.Streams;
//VÍ DỤ VỀ LỚP FILE

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.io.File;
import java.awt.List;

public class FileDemo {
	public static void main(String args[]) {
		Frame fr = new Frame("File Demo");
		fr.setBounds(10, 10, 300, 200);
		fr.setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1, 2));
		List list_C = new List();
		list_C.add("/home/teo/Downloads/STUDY/");
		File driver_C = new File("/home/teo/Downloads/STUDY/");
		String[] dirs_C = driver_C.list();
		for (int i = 0; i < dirs_C.length; i++) {
			File f = new File("/home/teo/Downloads/STUDY/" + dirs_C[i]);
			if (f.isDirectory())
				list_C.add("<DIR>" + dirs_C[i]);
			else
				list_C.add(" " + dirs_C[i]);
		}
		List list_D = new List();
		list_D.add("/home/teo/Downloads/STUDY/test");
		File driver_D = new File("/home/teo/Downloads/STUDY/test");
		String[] dirs_D = driver_D.list();
		for (int i = 0; i < dirs_D.length; i++) {
			File f = new File("/home/teo/Downloads/STUDY/test" + dirs_D[i]);
			if (f.isDirectory())
				list_D.add("<DIR>" + dirs_D[i]);
			else
				list_D.add(" " + dirs_D[i]);
		}
		p.add(list_C);
		p.add(list_D);
		fr.add(p, BorderLayout.CENTER);
		fr.setVisible(true);
	}
}
