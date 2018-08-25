import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class ImageLabel extends JLabel{
	private Initialize GIS;
	
	public ImageLabel(Initialize GameIS) {
	    // load the background image
	    try {
	        setIcon(new ImageIcon(gameFrame.class.getResource("/image/CSULBMap3.png")));
	        GIS = GameIS;
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	}

	
	@Override
	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    // paint the background image and scale it to fill the entire space
	    //g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	    
	   
		int fontSize = 50;
	    g.setFont(new Font("TimesRoman", Font.PLAIN, fontSize));	     
	    g.setColor(Color.red);
	    
	    g.drawString(GIS.getHuman().GetName(), GIS.getHuman().GetLocation().getx_cord(), GIS.getHuman().GetLocation().gety_cord());
	    g.drawString(GIS.getAI1().GetName(), GIS.getAI1().GetLocation().getx_cord(), GIS.getAI1().GetLocation().gety_cord()+40);
	    g.drawString(GIS.getAI2().GetName(), GIS.getAI2().GetLocation().getx_cord(), GIS.getAI2().GetLocation().gety_cord()-40);
	}
	
}
