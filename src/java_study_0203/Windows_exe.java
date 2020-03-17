package java_study_0203;

import javax.swing.JFrame;

public class Windows_exe {

	public static void main(String[] args) {

		JFrame f = new JFrame() ;
		f.setTitle("윈도우 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,200);
		f.setLocation(200,200);
		f.setVisible(true);
		
	}

}

