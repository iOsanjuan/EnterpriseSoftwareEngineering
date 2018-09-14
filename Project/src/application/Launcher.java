package application;
	
import java.net.URL;

import controller.MenuViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import view.ViewManager;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Launcher extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			URL viewURL = this.getClass().getResource("/view/MenuView.fxml");
			
			FXMLLoader loader = new FXMLLoader(viewURL); 
			loader.setController(new MenuViewController());
	        BorderPane rootBorderPane = loader.load();
	        Scene scene = new Scene(rootBorderPane);
	        
	        ViewManager viewManager = ViewManager.getInstance();
	        viewManager.setBorderPane(rootBorderPane);
			
	        stage.setScene(scene);
			stage.show();
				
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stop() throws Exception {
		super.stop();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}