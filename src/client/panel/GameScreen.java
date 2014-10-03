package client.panel;

import java.awt.Graphics;
import javax.swing.JPanel;
import source.Map;
import client.Client;

public class GameScreen extends JPanel{
	
	public GameScreen(){
		super();
		setBounds(Client.GAME_SIZE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
	}
	
	public void paintMap(Graphics g, Map m){
		
	}

}
