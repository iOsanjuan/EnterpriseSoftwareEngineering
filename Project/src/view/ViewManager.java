package view;

import java.io.IOException;
import java.net.URL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import controller.BookDetailViewController;
import controller.BookListViewController;
import controller.MenuViewController;

import org.apache.logging.log4j.Logger; 
import org.apache.logging.log4j.LogManager;

public class ViewManager {
	
	private static ViewManager instance = null;
	
	private BorderPane menuBorderPane;
	
	private static final Logger logger = LogManager.getLogger(Logger.class .getName());
	
	static Stage stage;
	
	@FXML
	private ListView <String> list;
	
	private ViewManager() {
		menuBorderPane =  null;
	}
	
	public void switchView(int viewType) {
		
		logger.info("Attempting to switch view!");
		
		URL viewURL = null;
		FXMLLoader loader = null;
		
		if(viewType == 0) {
			viewURL = this.getClass().getResource("MenuView.fxml");
			loader = new FXMLLoader(viewURL);
			loader.setController(new MenuViewController());	
			logger.info("MenuView!");
		} else if(viewType == 1) {
			viewURL = this.getClass().getResource("BookListView.fxml");
			loader = new FXMLLoader(viewURL);
			loader.setController(new BookListViewController());
			logger.info("BookListVew!");	
		} else if(viewType == 2) {
			viewURL = this.getClass().getResource("BookDetailView.fxml");
			loader = new FXMLLoader(viewURL);
			loader.setController(new BookDetailViewController());
			logger.info("BookDetailVew!");
		}
		try {
			Parent contentPane = loader.load();
	        menuBorderPane.setCenter(contentPane);
		} catch (Exception e) {
			logger.error("Wow: IOE Exception!" + e);
		}
	}
	
	
	public static synchronized ViewManager getInstance( ) {     
		if (instance == null)
			instance = new ViewManager();
		return instance;
	}
	
	public void setBorderPane(BorderPane menuBorderPane) {
		this.menuBorderPane = menuBorderPane;
	}
		
}