package com.learning.springFramework;

import com.learning.springFramework.game.GameRunner;
import com.learning.springFramework.game.MarioGame;
import com.learning.springFramework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var superContraGame = new SuperContraGame();
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		
	
	}

}
