package engine;

import java.util.ArrayList;

import model.world.Champion;
import model.world.Cover;
import java.awt.Point;

public class Game {
	private Player firstPlayer;
	private Player secondPlayer;
	private boolean firstLeaderAbilityUsed;
	private boolean secondLeaderAbilityUsed;
	private Object[][] board;
	private static ArrayList<Champion> availableChampions;
	private PriorityQueue turnOrder;
	private static int BOARDHEIGHT=5;
	private static int BOARDWIDTH=5;
	
	public Game(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		board = new Object[BOARDHEIGHT][BOARDWIDTH];
	}
	private void placeChampions()	{
	    for (int i=0;i<firstPlayer.getTeam().size();i++){
	    	board[0][i+1]=firstPlayer.getTeam().get(i);
	    	//ne set el location beta3 kol champion
	    	firstPlayer.getTeam().get(i).setLocation(new Point(i+1,0));
	    }
	    for (int i=0;i<secondPlayer.getTeam().size();i++){
	    	board[4][i+1]=secondPlayer.getTeam().get(i);
	    	secondPlayer.getTeam().get(i).setLocation(new Point(i+1,4));
	    }
		
	}
	private void placeCovers(){
		for(int i = 0; i< 5; i++){
			int x = (int)(Math.random()*((4-0)+1)) + 0;
			int y = (int)(Math.random()*((4-0)+1)) + 0;
			while((x==0&&y==0)||(x==0 && y==4)||(x==4 && y==4)||(x==4 && y==0)){
				x = (int)(Math.random()*((4-0)+1)) + 0;
				y = (int)(Math.random()*((4-0)+1)) + 0;
			}
			// creating 5 covers
			Cover c = new Cover (x,y);
			//not setlocation methods for cover
			//placing them 
			board[y][x]=c;
		}
	}
	public static void loadAbilities(String filePath){
		
	}
}
