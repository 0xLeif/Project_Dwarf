package source;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Map {
	private ArrayList<String> map = new ArrayList<String>();
	
	public Map(int i) throws IOException{
		File mapFile = new File("../Project_Dwarf/src/source/maps/" + i + ".txt");
		FileReader fr = new FileReader(mapFile);
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while((line = br.readLine()) != null){
			map.add(line);
		}
		br.close();
		fr.close();
	}
	
	public ArrayList<String> getArrayList(){
		return map;
	}
	
	public String getLine(int lineAtY){
		return map.get(lineAtY);
	}
	
	public char getChar(int x, int y){
		return map.get(y).charAt(x);
	}
}
