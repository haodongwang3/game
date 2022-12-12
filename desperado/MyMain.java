package desperado;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.Timer;


public class MyMain extends JPanel implements KeyListener, ActionListener{
	
	/*
	 * Load Images onto screen
	 * press d
	 * sprite moves by x velocity,
	 * sprite image changes after movement 
	 */

	private Timer timer;
	private Player player;

	public MyMain() {
		
		player = new Player(0,0,10,0);
		this.addKeyListener(this);
		timer = new Timer(120,this);
		timer.start();
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		player.myDraw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_D) {
			player.setDirection(4);
			player.move();
			repaint();
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		player.move();
		repaint();
		
	}

}