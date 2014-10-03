package client;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JFrame;

import client.panel.GameScreen;

public class Client extends JFrame{
	public final static String GAME_NAME = "Project_Dwarf";
	public final static Rectangle GAME_SIZE = new Rectangle(0, 0, 800, 600);
	private GameScreen screen;
	
	public Client(){
		super(GAME_NAME);
		setBounds(GAME_SIZE);
		setBackground(Color.DARK_GRAY);
		add(screen = new GameScreen());
		setVisible(true);
	}
	
	

}
