package rushhour;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Stage extends JFrame{
	private Image background=new ImageIcon(Stage.class.getResource("/img/Stage.png")).getImage();
	public Stage() {
		setTitle("Rush hour - Stage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		JButton s1=new JButton("Level-1");
		JButton s2=new JButton("Level-2");
		JButton s3=new JButton("Level-3");
		
		Font f=new Font("맑은 고딕", Font.BOLD, 30);
		
		
		
		s1.setBackground(Color.red);
		s2.setBackground(Color.red);
		s3.setBackground(Color.red);
		
		s1.setFont(f);
		s2.setFont(f);
		s3.setFont(f);
		
		
		s1.setBounds(525, 400, 140, 70);
		s2.setBounds(525,525, 140, 70);
		s3.setBounds(525, 650, 140, 70);
		
		s1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				effect b=new effect("button");
				b.play();
				Stage1 s1=new Stage1();
				howtoplay h =new howtoplay();
				s1.setVisible(true);
				
				setVisible(false);
				dispose();
				
			}
		});
		s2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				effect b=new effect("button");
				b.play();
				Stage2 s2=new Stage2();
				howtoplay2 h =new howtoplay2();
				s2.setVisible(true);
				
				setVisible(false);
				dispose();
				
			}
		});
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		setResizable(false);
		//setLocationRelativeTo(null);
		setLayout(null);
		setSize(1200,900);
		setVisible(true);
	}
	public void  paint(Graphics g) {
		g.drawImage(background,0,0,null);
	}
	public static void main(String[] args) {
		new Stage();
		

	}

}
