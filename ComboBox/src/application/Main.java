/********************************************************************************************
 *   COPYRIGHT (C) 2022 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Main class file for the ComboBox application.
 *   Project:  ComboBox
 *   Platform: Cloud Service Provider Independent
 *   Compiler: JavaSE-11
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *             Version: 2021-09 (4.21.0)
 *             Build id: 20210910-1417
 ********************************************************************************************/

package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * The Main class serves as the entry point for the application.
 */
public class Main extends Application {

    /**
     * Start method to initialize and display the primary stage of the application.
     * 
     * @param primaryStage The primary stage of the application.
     */
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
            Scene scene = new Scene(root, 400, 400);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Main method, entry point of the application.
     * 
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
