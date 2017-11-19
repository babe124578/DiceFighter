package control;

import gameLogic.GameLogic;
import model.DiceGameModel;
import model.GameModel;
import userInterface.GameCanvas;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.canvas.Canvas;
import scene.SceneSwitch;
import javafx.scene.control.Alert.AlertType;

public class GameControl {

	private static DiceGameModel model;
	private static GameCanvas canvas;
	private static GameLogic logic;

	public static void newGame() {
		model = new DiceGameModel();
		canvas = new GameCanvas(model);
		logic = new GameLogic(model, canvas);
		SceneSwitch.gotoSceneOf(canvas);
		logic.startGame();
		canvas.startAnimation();
	}

	public static void stopGameLogicAndAnimation() {
		logic.stopGame();
		canvas.stopAnimation();
	}

	private static void displayResult() {
		new Alert(AlertType.NONE, "You Lost and Win", ButtonType.OK).showAndWait();
		SceneSwitch.gotoMainMenu();
	}

	public static void stopGame() {
		stopGameLogicAndAnimation();
		Platform.runLater(GameControl::displayResult);
	}

	public static void helpMenu() {
		// TODO Auto-generated method stub
		
	}

}
