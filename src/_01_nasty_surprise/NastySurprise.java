package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
	
	
	
		
		
		private void showPictureFromTheInternet(String imageURL ) {
		    try {
		        URL url = new URL(imageURL);
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
		





		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			JButton buttonclicked = (JButton) arg0.getSource();
			if(buttonclicked == button2) {
				showPictureFromTheInternet("https://techcrunch.com/wp-content/uploads/2019/09/monster-dot-com.jpg?w=680");
			}
			if(buttonclicked == button1) {
				showPictureFromTheInternet("https://i0.wp.com/bestlifeonline.com/wp-content/uploads/2019/12/shutterstock_1290320698.jpg?resize=1024%2C683&ssl=1");
			}
		}
		
	}

