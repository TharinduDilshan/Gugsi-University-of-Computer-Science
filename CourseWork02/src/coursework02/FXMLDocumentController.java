
package coursework02;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    @FXML private Label lblTitle;
    @FXML private Label coursework;
    @FXML private Label courseworkNResearch;
    @FXML private Label research;
    @FXML private Button staff;
    @FXML private Button ins;
    @FXML private Button quit;
   
   @FXML 
    private void staffLogin(ActionEvent evt) throws IOException{
   
            Parent root = FXMLLoader.load(getClass().getResource("StaffLogin.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("Staff Login");
            stage.setScene(scene);
            stage.show();            
    }
 
     @FXML
      private void ins(ActionEvent evt) throws IOException{
            
            Parent root = FXMLLoader.load(getClass().getResource("Instructions.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("Lecturer Login");
            stage.setScene(scene);
            stage.show();            
    }
      
      @FXML
      private void quit(ActionEvent evt) throws IOException{
        
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.close();
    }
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
