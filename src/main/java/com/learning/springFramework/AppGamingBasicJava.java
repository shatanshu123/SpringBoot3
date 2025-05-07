package com.learning.springFramework;

import com.learning.springFramework.game.GameRunner;
import com.learning.springFramework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
