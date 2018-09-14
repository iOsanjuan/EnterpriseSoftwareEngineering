package controller;

import java.net.URL;
import java.util.ResourceBundle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import view.ViewManager;

public class MenuViewController implements Initializable {
	
	private static final Logger logger = LogManager.getLogger(Logger.class .getName());
	
	@FXML
	void quitButtonSelected(ActionEvent event) {
		logger.debug("Quitting Program");
		System.exit(0);
	}	
	
	@FXML
	void listButtonClicked(ActionEvent event) {
		
		logger.info("Book List View Pressed");
		
		ViewManager viewManager = ViewManager.getInstance();
		
		logger.info("Switching Views");
		
		viewManager.switchView(1);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
}
