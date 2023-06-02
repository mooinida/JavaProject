package rushhour;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;


public class firstpage extends JFrame{
	private Image background=new ImageIcon(firstpage.class.getResource("/img/Rush.png")).getImage();
	
	public firstpage() {
		setTitle("Rush Hour");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		JButton start=new JButton("시작");
		JButton exit=new JButton("종료");
		
		Font f=new Font("맑은 고딕", Font.BOLD, 30);
		
		
		
		start.setBackground(Color.red);
		exit.setBackground(Color.red);
		
		
		start.setFont(f);
		exit.setFont(f);
		
		
		
		start.setBounds(525, 400, 140, 70);
		
		exit.setBounds(525, 550, 140, 70);
		
		start.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						effect b=new effect("button");
						b.play();
						Stage stage=new Stage();
						stage.setVisible(true);
						setVisible(false);
						dispose();
						
					}
				});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				effect e1=new effect("end");
				e1.play();
				System.exit(0);
				
			}
		});
		
		c.add(exit);
		c.add(start);
		
		
		
		//setLocationRelativeTo(null);
		setLayout(null);
		setSize(1200,900);
		setVisible(true);
		}
	public void  paint(Graphics g) {
		g.drawImage(background,0,0,null);
	}
	public static void main(String[] args) {
		new firstpage();
		
	}

}
