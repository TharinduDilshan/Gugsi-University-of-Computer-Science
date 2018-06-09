
package coursework02;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StudentInformationController implements Initializable {

    @FXML private TextField txtStudentID;
    @FXML private TextField txtFirstName;
    @FXML private TextField txtLastName;
    @FXML private TextField txtAge;
    @FXML private Button next;
   
   ArrayList<Student> studentInfo = new ArrayList<Student>();
        
    @FXML 
   private void staffLogin(ActionEvent evt) throws IOException{

        try{
        int studentID=Integer.parseInt(txtStudentID.getText());
        for(int i=0;i<studentInfo.size();i++){
            if(studentInfo.get(i).idNum == studentID){
                Alert message = new Alert(Alert.AlertType.INFORMATION);
                message.setHeaderText("Errorrrr");
                message.setContentText("Invalid Input. Please ReEnter a valid Input");
                message.showAndWait();
            }
        }
       
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        int studentAge=Integer.parseInt(txtAge.getText());
        
        Student sID = new Student();
        
        sID.idNum = studentID;
        sID.fiName = firstName;
        sID.laName = lastName;
        sID.stAge= studentAge;
        
        studentInfo.add(sID);
        
        System.out.println(studentInfo.get(0).fiName);
        
            Parent root = FXMLLoader.load(getClass().getResource("PreliminaryModules.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("Preliminary Modules");
            stage.setScene(scene);
            stage.show();   
 
        }catch(Exception e){
         Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Invalid Input. Please ReEnter a valid Input");
            message.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
