package scene;

import control.GameControl;
import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class DiceMainMenu extends Canvas {

	private static final Font TITLE_FONT = new Font("Tahoma", 40);
	private static final Font MENU_FONT = new Font("Tahoma", 15);

	public DiceMainMenu() {
		super(SceneSwitch.SCENE_WIDTH, SceneSwitch.SCENE_HEIGHT);

		GraphicsContext gc = this.getGraphicsContext2D();
		gc.setFill(Color.CRIMSON);
		gc.setFont(TITLE_FONT);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.fillText("Dice Master", SceneSwitch.SCENE_WIDTH / 2, SceneSwitch.SCENE_HEIGHT / 4);

		gc.setFill(Color.LIME);
		gc.setFont(MENU_FONT);
		gc.setTextAlign(TextAlignment.CENTER);
		gc.fillText("Press 'A' key to start", SceneSwitch.SCENE_WIDTH / 2, SceneSwitch.SCENE_HEIGHT * 4 / 5);
		
		
		/**
		 * gc.setFill(Color.BLACK); gc.fillRect(0, 0, SceneSwitch.SCENE_WIDTH,
		 * SceneSwitch.SCENE_HEIGHT); gc.setTextAlign(TextAlignment.CENTER);
		 * gc.setFill(Color.WHITE); gc.setFont(TITLE_FONT); gc.fillText("Typing Game",
		 * SceneSwitch.SCENE_WIDTH / 2, SceneSwitch.SCENE_HEIGHT / 4);
		 * gc.setFont(MENU_FONT); gc.fillText("Press Enter to start",
		 * SceneSwitch.SCENE_WIDTH / 2, SceneSwitch.SCENE_HEIGHT * 3 / 4);
		 */

		this.addKeyEventHandler();
	}

	private void addKeyEventHandler() {
		this.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.A) {
				GameControl.newGame();
			}
			if (event.getCode() == KeyCode.ESCAPE) {
				Platform.exit();
			}
			if (event.getCode() == KeyCode.B) {
				GameControl.helpMenu();
			}
		});

	}
}