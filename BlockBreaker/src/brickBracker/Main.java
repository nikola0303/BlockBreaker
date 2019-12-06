package brickBracker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
				JFrame obj=new JFrame();
				
				Gameplay gamePlay = new Gameplay();
				
				obj.setBounds(10,10,700,600);
				
				obj.setTitle("Breakout ball");
				
				obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				obj.setVisible(true);
				
				obj.setResizable(false);
				
				obj.add(gamePlay);
	}

}
//https://www.youtube.com/watch?v=K9qMm3JbOH0