/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  MainController class file for the PROJECT_NAME application.
 *   Project:  ComboBox
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

/**
 * The MainController class controls the user interactions in the application.
 */
public class MainController implements Initializable {
    
    @FXML
    public Label myLabel;
    
    @FXML
    public ComboBox<String> combobox;
    
    @FXML
    public ListView<String> listview;
    
    // List of names for the ComboBox
    ObservableList<String> list = FXCollections.observableArrayList("Mark", "Tom", "John", "Jack");

    /**
     * Initializes the controller after its root element has been completely processed.
     * 
     * @param location  The location used to resolve relative paths for the root object.
     * @param resources The resources used to localize the root object.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Set initial items for the ComboBox
        //combobox.setItems(list);
    	//listview.setItems(list);
    	listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
    
    /**
     * Handles the event when the combo box selection is changed.
     * 
     * @param event The event triggered by changing the combo box selection.
     */
    public void comboChanged(ActionEvent event) {
        // Add additional names to the ComboBox when its selection is changed
        combobox.getItems().addAll("Ram", "Ben", "Stefen","Rohit");
        // Display the selected name in the Label
      //myLabel.setText(combobox.getValue());
        
        }
        
   
    
    /**
     * Handles the event when the button is clicked.
     * 
     * @param event The event triggered by clicking the button.
     */
    public void buttenAction(ActionEvent event) {
        // Add additional names to the ComboBox when the button is clicked
        //listview.getItems().addAll("Ram", "Ben", "Stefen","Rohit");
        //myLabel.setText(combobox.getValue());
    	 
    	ObservableList<String> names;
        names=listview.getSelectionModel().getSelectedItems();
        for(String name:names) {
        	System.out.println(name);
        
    	
    }
    }
}
