package capter02.c3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame jFrame;
	
	public static void main(String[] args) {
		SwingObserverExample swingObserverExample = new SwingObserverExample();
		swingObserverExample.go();
	}
	
	public void go() {
		jFrame = new JFrame();
		JButton jButton = new JButton("should i do it");
		jButton.addActionListener(new AngeListener());
		jButton.addActionListener(new DevilListener());
	}
	
	class AngeListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Do not do it,you might regret it");
			
		}
	}
	class DevilListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("come on,do it");
			
		}
	}
}
