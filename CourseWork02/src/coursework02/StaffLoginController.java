
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StaffLoginController implements Initializable {

    @FXML private TextField txtUsername;
    @FXML private TextField txtPassword;
    @FXML private Button btnLogin;
    static String userName;
    
    @FXML 
    private void loginStudent(ActionEvent evt) throws IOException{
        userName= txtUsername.getText();
        String password=txtPassword.getText();
        
        if(userName.equals("staff") && password.equals("123")){
            Parent root = FXMLLoader.load(getClass().getResource("StudentInformation.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            //Stage stage= (Stage) (((Node) evt.getSource()).getScene().getWindow());
            stage.setTitle("Main Screen");
            stage.setScene(scene);
            stage.show();            
        }
        else{
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Check your username and password");
            message.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
}
