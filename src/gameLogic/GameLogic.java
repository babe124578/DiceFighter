package gameLogic;

import model.DiceGameModel;
import userInterface.GameCanvas;

public class GameLogic {
	private boolean isGameRunning;
	private GameCanvas canvas;
	private DiceGameModel model;
	
	public GameLogic(DiceGameModel model, GameCanvas canvas) {
		this.model = model;
		this.canvas = canvas;
		this.isGameRunning = false;
	}

	public void startGame() {
		this.isGameRunning = true;
		
	}

	public void stopGame() {
		this.isGameRunning = false;
		
	}

}
