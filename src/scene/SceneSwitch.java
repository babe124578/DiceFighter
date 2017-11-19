package scene;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import scene.DiceMainMenu;
import userInterface.GameCanvas;

public final class SceneSwitch {

	private static Stage primaryStage;
	private static Canvas mainMenuCanvas = new DiceMainMenu();
	private static Scene mainMenuScene = new Scene(new Pane(mainMenuCanvas));
	public static final int SCENE_WIDTH = 550;
	public static final int SCENE_HEIGHT = 550;

	public static void initialize(Stage stage) {
		primaryStage = stage;
		primaryStage.show();
	}

	public static void gotoMainMenu() {
		primaryStage.setScene(mainMenuScene);
		mainMenuCanvas.requestFocus();
	}

	public static void gotoSceneOf(Canvas canvas) {
		primaryStage.setScene(new Scene(new Pane(canvas)));
		canvas.requestFocus();
	}

	public static void gotoSceneOf(GameCanvas canvas) {
		// TODO Auto-generated method stub
		
	}
}