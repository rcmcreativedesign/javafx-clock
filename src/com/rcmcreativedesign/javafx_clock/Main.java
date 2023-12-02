package com.rcmcreativedesign.javafx_clock;
	
import java.text.SimpleDateFormat;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;


public class Main extends Application {
	private final Text txtTime = new Text();
	
	private Rotate rotateSecondHand = new Rotate(0, 0, 0);
	private Rotate rotateMinuteHand = new Rotate(0, 0, 0);
	private Rotate rotateHourHand = new Rotate(0, 0, 0);
	
	private Thread timer = new Thread(() -> {
		SimpleDateFormat dt = new SimpleDateFormat("hh:mm:ss");
	});
	
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
