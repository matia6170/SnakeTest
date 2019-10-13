package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class RenderPanel extends JPanel{

	public static int curColor = 0;
	public Color pink = new Color(14720159);
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.green);
		g.fillRect(0,0,800,700);
		curColor++;
		
		
		Snake snake = Snake.snake;
		
		g.setColor(Color.BLUE);
		
		for(Point point : snake.snakeParts) {
			
			g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		
		
		}
		g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		g.setColor(Color.RED);
		g.fillRect(snake.cherry.x * Snake.SCALE, snake.cherry.y * Snake.SCALE, Snake.SCALE, Snake.SCALE);
		String string = "Created By matia6170 on 10/13/19 | Score: " + snake.score + ", Lenght: " +snake.tailLenght + ", Time: " + snake.time/20;
		
		g.setColor(Color.BLACK);
		g.drawString(string,0, 10);
	}

}
