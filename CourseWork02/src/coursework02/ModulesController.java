
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ModulesController implements Initializable {

    @FXML private CheckBox check1T;
    @FXML private CheckBox check1F;
    @FXML private CheckBox check2T;
    @FXML private CheckBox check2F;
    @FXML private CheckBox check3T;
    @FXML private CheckBox check3F;
    @FXML private CheckBox check4T;
    @FXML private CheckBox check4F;
    @FXML private CheckBox check5T;
    @FXML private CheckBox check5F;
    @FXML private CheckBox check6T;
    @FXML private CheckBox check6F;
    @FXML private CheckBox check7T;
    @FXML private CheckBox check7F;
    @FXML private CheckBox check8T;
    @FXML private CheckBox check8F;
    @FXML private TextField text1;
    
    @FXML private Button ok;
    @FXML ImageView image;
      
    @FXML
    private void handleCheckBox1T(){
        if(check1T.isSelected()){
            check1F.setSelected(false);   
        }
    }
    
    @FXML
    private void handleCheckBox1F(){
        if(check1F.isSelected()){
            check1T.setSelected(false);   
        }
    }
    
    @FXML
    private void handleCheckBox2T(){
        if(check2T.isSelected()){
            check2F.setSelected(false);
        }
    }
    
     @FXML
    private void handleCheckBox2F(){
        if(check2F.isSelected()){
            check2T.setSelected(false);
        }
    }

    @FXML
    private void handleCheckBox3(){
        if(check3T.isSelected()){
            check3F.setSelected(false);
    
        }
    }
      
    @FXML
    private void handleCheckBox3T(){
        if(check3T.isSelected()){
            check3F.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox3F(){
        if(check3F.isSelected()){
            check3T.setSelected(false);
        }
    }
  
    @FXML
    private void handleCheckBox4T(){
        if(check4T.isSelected()){
            check4F.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox4F(){
        if(check4F.isSelected()){
            check4T.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox5T(){
        if(check5T.isSelected()){
            check5F.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox5F(){
        if(check5F.isSelected()){
            check5T.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox6T(){
        if(check6T.isSelected()){
            check6F.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox6F(){
        if(check6F.isSelected()){
            check6T.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox7T(){
        if(check7T.isSelected()){
            check7F.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox7F(){
        if(check7F.isSelected()){
            check7T.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox8T(){
        if(check8T.isSelected()){
            check8F.setSelected(false);
        }
    }
    
    @FXML
    private void handleCheckBox8F(){
        if(check8F.isSelected()){
            check8T.setSelected(false);
        }
    }

     @FXML 
    private void login(ActionEvent evt) throws IOException{
        
        if(check1T.isSelected()&&check2T.isSelected()&&check3T.isSelected()&&check4T.isSelected()&&check5T.isSelected()&&check6T.isSelected()&&check7T.isSelected()&&check8T.isSelected()){
            
            Parent root = FXMLLoader.load(getClass().getResource("FirstNSecond.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node)evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("1st Semester & 2nd Semester");
            stage.setScene(scene);
            stage.show();            
        }else if(check1F.isSelected() || check2F.isSelected() || check3F.isSelected() || check4F.isSelected() || check5F.isSelected() || check6F.isSelected()||check7F.isSelected()||check8F.isSelected()){
        
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Oppps...!!!");
            message.setContentText("You are not be able to continue M.Sc. Program.");
            message.showAndWait();
            
            Parent root = FXMLLoader.load(getClass().getResource("StudentInformation.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node)evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("Student Information");
            stage.setScene(scene);
            stage.show();   
            
        }else{
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Warning!");
            message.setContentText("Please tick all boxes");
            message.showAndWait();
        } 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
