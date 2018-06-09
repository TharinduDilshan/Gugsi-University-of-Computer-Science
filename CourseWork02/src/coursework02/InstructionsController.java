
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
import javafx.stage.Stage;

public class InstructionsController implements Initializable {

@FXML private Button next;
@FXML private Button home;
    
 @FXML 
    private void home(ActionEvent evt) throws IOException{
   
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("Home");
            stage.setScene(scene);
            stage.show();            
    }
 
     @FXML
      private void next(ActionEvent evt) throws IOException{
            
            Parent root = FXMLLoader.load(getClass().getResource("Instructions1.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("Lecturer Login");
            stage.setScene(scene);
            stage.show();            
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}
