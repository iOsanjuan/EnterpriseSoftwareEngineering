package controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import model.Book;
import view.ViewManager;

public class BookListViewController implements Initializable {
	
	private static final Logger logger = LogManager.getLogger(Logger.class .getName());
	
	@FXML
    private BorderPane list;

    @FXML
    private ListView<Book> output;
    
    public static Book selected;
    
    private static ObservableList <Book> bookList;
    
    @FXML
    void itemSelected(MouseEvent event) {
    	if(event.getClickCount() == 2) {
    		logger.info("Double Clicked a Book!!!!");
    		ViewManager viewManager = ViewManager.getInstance();
    		this.selected = output.getSelectionModel().getSelectedItem();
    		logger.info("Switch to book detail view!");
    		viewManager.switchView(2);
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		Book book1 = new Book("Harry Potter and The Sorcerer's Stone", "Summary for HP", 1997, "978-1338299144", "07/26/1997");
		Book book2 = new Book("Game of Thrones (A song of Fire and Ice)", "Summary for GoT", 2015, "978-0553593716", "02/14/1018");
		Book book3 = new Book("20,000 Leagues Under the Sea", "Summary for 20,000LuS", 2000, "978-1853260315", "01/01/1996");
		Book book4 = new Book("Journey to the Center of the Earth", "Summary of JCE", 1983, "978-0486440880", "01/23/2012");
		Book book5 = new Book("The Very Hungry Caterpillar", "Summary of TVHC", 2008, "978-0399226908", "05/23/1999");
		
		bookList = FXCollections.observableArrayList(book1, book2, book3, book4, book5);
		
		output.setItems(bookList);
		logger.info("Book list added to the view!");
		
	}
	
	public static Book getBook() {
		return selected;
	}
	

}

