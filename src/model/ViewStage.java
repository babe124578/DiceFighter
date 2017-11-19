package model;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewStage {
	private Canvas[][] pathIndex;
	private DiceGameModel model;
	private static final int CANVAS_SIZE = 50;

	public ViewStage(Stage primaryStage, DiceGameModel model) {
		try {
			this.model = model;
			GridPane root = new GridPane();
			pathIndex = new Canvas[DiceGameModel.PATH_SIZE][DiceGameModel.PATH_SIZE];
			for (int i = 0; i < DiceGameModel.PATH_SIZE; i++) {
				for (int j = 0; j < DiceGameModel.PATH_SIZE; j++) {
					pathIndex[i][j] = new Canvas(CANVAS_SIZE, CANVAS_SIZE);
					root.add(pathIndex[i][j], j, i);
					// addCanvasEvents(pathIndex[i][j], i, j);
				}
				root.setPrefSize(CANVAS_SIZE * 3, CANVAS_SIZE * 3);
			}
			Scene scene = new Scene(root);
			primaryStage.setTitle("OX Game");
			primaryStage.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void DrawPath() {
		for (int i = 0; i < DiceGameModel.PATH_SIZE; i++) {
			for (int j = 0; j < DiceGameModel.PATH_SIZE; j++) {
				GraphicsContext gc = pathIndex[i][j].getGraphicsContext2D();
				if (DiceGameModel.table[i][j] == 0) {
					gc.setFill(Color.DEEPSKYBLUE);
					gc.fillRect(0, 0, CANVAS_SIZE, CANVAS_SIZE);
				} else if (DiceGameModel.table[i][j] == 1) {
					gc.setFill(Color.MAGENTA);
					gc.fillRect(0, 0, CANVAS_SIZE, CANVAS_SIZE);
				}
			}
		}
	}

	// private void addCanvasEvents(Canvas canvas, int i, int j) {/

	// }
}
