package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NastySurprise implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	
	
	public void nastysurprise() {
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		button1.setText("Trick");
		button2.setText("Treat");
		frame.pack();
		frame.add(button1);
		frame.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}
	
	
	
		
		
		private void showPictureFromTheInternet(String imageUrl) {
		    try {
		        URL url = new URL(monster.png);
		        Icon icon = new ImageIcon(url);
		        JLabel imageLabel = new JLabel(icon);
		        JFrame frame = new JFrame();
		        frame.add(imageLabel);
		        frame.setVisible(true);
		        frame.pack();
		    } catch (MalformedURLException e) {
		        e.printStackTrace();
		    }
		}
		
		public void actionPerformed () {
			
			if
			
			
		}





		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

