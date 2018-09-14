package controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import model.Book;
import view.ViewManager;

public class BookDetailViewController implements Initializable {
	
	@FXML
    private Text titleDisplay;

    @FXML
    private Text summaryDisplay;

    @FXML
    private Text yearDisplay;

    @FXML
    private Text isbnDisplay;

    @FXML
    private Text dateDisplay;

    @FXML
    private TextField titleField;

    @FXML
    private TextField authorfield;

    @FXML
    private TextField genreField;

    @FXML
    private TextField isbnField;

    @FXML
    private TextField isbnField1;

    @FXML
    private Button saveButton;
	
	private static final Logger logger = LogManager.getLogger(Logger.class .getName());
	
	private Book book;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		logger.info("Book Detail View INITIALIZED!!!!");
		
		this.book = BookListViewController.getBook();
		
		this.titleDisplay.setText(this.book.getTitle());
		
		this.summaryDisplay.setText(this.book.getSummary());
		
		this.yearDisplay.setText(this.book.getYear()+"");
		
		this.isbnDisplay.setText(this.book.getISBN());
		
		this.dateDisplay.setText(this.book.getDate());
	}

    @FXML
    void saveClicked(MouseEvent event) {
    	logger.info("Save button clicked!!!!");
    }
	

}

