package application;

import control.GameControl;
import javafx.application.Application;
import javafx.stage.Stage;
import scene.SceneSwitch;

public class Main extends Application implements Runnable{
	@Override
	public void start(Stage primaryStage) {
		try {
			SceneSwitch.initialize(primaryStage);
			SceneSwitch.gotoMainMenu();
			primaryStage.setTitle("Dice Master");
			primaryStage.centerOnScreen();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		GameControl.stopGameLogicAndAnimation();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void run() {
		System.out.println("running");
	}
}
