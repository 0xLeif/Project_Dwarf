package client.panel;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import source.Map;
import client.Client;

public class GameScreen extends JPanel {
	private Map map;
	
	public GameScreen() {
		super();
		try {
			map = new Map(1);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error 001");
			System.exit(1);
		}
		setBounds(Client.GAME_SIZE);
		setVisible(true);
	}
	
	public void loadMap(String filename){
		
	}

	@Override
	public void paint(Graphics g) {
		paintMap(g, map);
	}

	private final int startX = 0, startY = 0;

	public void paintMap(Graphics g, Map m) {
		int y = startX;
		int x = startY;
		for (String line : m.getArrayList()) {
			for (int i = 0; i < line.length(); i++) {
				String c = line.charAt(i) + "";
				Color color = Color.white;
				switch (c) {
				case "g":
					color = Color.green;
					break;
				case "C":
					color = Color.yellow;
					break;
				case "m":
					color = Color.red;
					break;
				case "o":
					color = Color.gray;
					break;
				case "X":
					color = Color.black;
					break;
				default:
					color = Color.white;
					break;
				}
				g.setColor(color);
				g.drawString(c, x, y);
				x += g.getFontMetrics().stringWidth(c) + 5;
			}
			x = startX;
			y += g.getFontMetrics().getHeight();
		}
	}

}
