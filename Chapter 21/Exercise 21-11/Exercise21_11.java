/*
 * Author: Joshua Gray
 * Date: 10/4/21
 * 
 * This program returns the popularity of a given name in any given year between 2001 and 2010;
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise21_11 extends Application {
	private Map<String, Integer>[] mapForBoy = new HashMap[10];
	private Map<String, Integer>[] mapForGirl = new HashMap[10];
  
	private Button btFindRanking = new Button("Find Ranking");
	private ComboBox<Integer> cboYear = new ComboBox<>();
	private ComboBox<String> cboGender = new ComboBox<>();
	private TextField tfName = new TextField();
	private Label lblResult = new Label();
  
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) throws MalformedURLException, IOException {
	  GridPane gridPane = new GridPane();
	  gridPane.add(new Label("Select a year:"), 0, 0);
	  gridPane.add(new Label("Boy or girl?"), 0, 1);
	  gridPane.add(new Label("Enter a name:"), 0, 2);
	  gridPane.add(cboYear, 1, 0);
	  gridPane.add(cboGender, 1, 1);
	  gridPane.add(tfName, 1, 2);
	  gridPane.add(btFindRanking, 1, 3);
	  gridPane.setAlignment(Pos.CENTER);
	  gridPane.setHgap(5);
	  gridPane.setVgap(5);
  
	  BorderPane borderPane = new BorderPane();
	  borderPane.setCenter(gridPane);
	  borderPane.setBottom(lblResult);
	  BorderPane.setAlignment(lblResult, Pos.CENTER);
	 
	  // Create DataInputStreams for URLs
	  DataInputStream yearOne = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2001.txt").openStream());
	  DataInputStream yearTwo = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2002.txt").openStream());
	  DataInputStream yearThree = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2003.txt").openStream());
	  DataInputStream yearFour = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2004.txt").openStream());
	  DataInputStream yearFive = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2005.txt").openStream());
	  DataInputStream yearSix = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2006.txt").openStream());
	  DataInputStream yearSeven = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2007.txt").openStream());
	  DataInputStream yearEight = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2008.txt").openStream());
	  DataInputStream yearNine = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2009.txt").openStream());
	  DataInputStream yearTen = new DataInputStream(new URL("http://liveexample.pearsoncmg.com/data/babynamesranking2010.txt").openStream());
	 
	  // Invoke fillMaps method for each year
	  fillMaps(yearOne, mapForBoy, mapForGirl, 0);
	  fillMaps(yearTwo, mapForBoy, mapForGirl, 1);
	  fillMaps(yearThree, mapForBoy, mapForGirl, 2);
	  fillMaps(yearFour, mapForBoy, mapForGirl, 3);
	  fillMaps(yearFive, mapForBoy, mapForGirl, 4);
	  fillMaps(yearSix, mapForBoy, mapForGirl, 5);
	  fillMaps(yearSeven, mapForBoy, mapForGirl, 6);
	  fillMaps(yearEight, mapForBoy, mapForGirl, 7);
	  fillMaps(yearNine, mapForBoy, mapForGirl, 8);
	  fillMaps(yearTen, mapForBoy, mapForGirl, 9);
	  
	  // Create a scene and place it in the stage
	  Scene scene = new Scene(borderPane, 370, 160);
	  primaryStage.setTitle("Exercise21_11"); // Set the stage title
	  primaryStage.setScene(scene); // Place the scene in the stage
	  primaryStage.show(); // Display the stage

	  for (int year = 2001; year <= 2010; year++) {
		  cboYear.getItems().add(year);
	  }
	  cboYear.setValue(2001);
        
	  cboGender.getItems().addAll("Male", "Female");
	  cboGender.setValue("Male");
	  
	  // Set action handlers
	  tfName.setOnAction(e -> tfName.setText(tfName.getText()));
	  
	  btFindRanking.setOnAction(e -> {
		  findRanking(cboYear.getValue(), cboGender.getValue(), 
				  tfName.getText(), mapForBoy, mapForGirl, lblResult);
	  });
    
  	}

  	/**
  	 * The main method is only needed for the IDE with limited
  	 * JavaFX support. Not needed for running from the command line.
  	 */
  public static void main(String[] args) {
	  launch(args);
  	}
  
  // Fills maps with appropriate values bases on year
  public static void fillMaps(DataInputStream year, Map[] mapForBoy, 
		  Map[] mapForGirl, int index) throws IOException {
	  // Temporary maps for storing values
	  HashMap<String, Integer> tempBoy = new HashMap<String, Integer>();
	  HashMap<String, Integer> tempGirl = new HashMap<String, Integer>();
	  
	// Read values from file
	for (int i = 0; i < 1000; i++) {
		String line = year.readLine();
		String[] words = line.split("[\\s+\\p{P}]");
		int rank = Integer.parseInt(words[0]);
		String boyName = words[2];
		String girlName = words[5];
		
		// Put name and rank in maps
		tempBoy.put(boyName, rank);
		tempGirl.put(girlName, rank);
		
		// Add rank and name to maps
		mapForBoy[index] = tempBoy;
		mapForGirl[index] = tempGirl;
	}
	
  }
  
  // Finds rank of name
  public static void findRanking(int year, String gender, String name, 
		  Map[] mapForBoy, Map [] mapForGirl, Label result) {
	  int rank, index = 0;
	  // Select proper index based on year
	  switch (year) {
	  	case 2001:	index = 0;
	  				break;
	  	case 2002:	index = 1;
	  				break;
	  	case 2003:	index = 2;
	  				break;
	  	case 2004:	index = 3;
	  				break;
	  	case 2005:	index = 4;
	  				break;
	  	case 2006:	index = 5;
	  				break;
	  	case 2007:	index = 6;
	  				break;
	  	case 2008:	index = 7;
	  				break;
	  	case 2009:	index = 8;
	  				break;
	  	case 2010:	index = 9;
	  				break;
	  }
	  // Search for name in map arrays
	  if (gender.equals("Male")) {
		  rank = (int) mapForBoy[index].get(name);
		  gender = "Boy";
	  } else {
		  rank = (int) mapForGirl[index].get(name);
		  gender = "Girl";
	  }
	  
	  // Update label message
	  result.setText(gender + " name " + name + " is ranked #" + 
			  rank + " in year " + year);
  }
}
