package ymo.demo.WatchFileSystemChange;

import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import ymo.demo.WatchFileSystemChange.layers.Dashboard;
import ymo.demo.WatchFileSystemChange.services.Watcher;

public class Main extends Application {
	private Dashboard dashboard = new Dashboard();

	@Override
	public void start(Stage primaryStage) {
		try {
			Watcher.createWatchService();

			BorderPane root = new BorderPane();
			root.setCenter(dashboard);
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

			Watcher.startWatchService();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
