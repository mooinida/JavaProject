package rushhour;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Obstract extends JPanel{
	private Image img;
	public Obstract(Image img) {
		this.img=img;
		setLayout(null);
		
		
		
		
		
	}
	public void paint(Graphics g) {
	       
        
        g.drawImage(img, 0, 0, null);
    }
	
}
