
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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class FirstNSecondController implements Initializable {
    
    @FXML private Label lbl1;
    @FXML private Label lbl2;
    @FXML private Label lbl3;
    @FXML private Label lbl4;
    @FXML private Label lbl5;
    @FXML private Label lbl6;
    @FXML private Label lbl7;
    @FXML private Label lbl8;
    @FXML private Label lbl9;
    @FXML private Label lbl10;
    @FXML private Label lbl11;
    @FXML private Label lbl12;
    @FXML private Label lbl13;
    @FXML private Label lbl14;
    @FXML private Label lbl15;
    @FXML private Label lbl16;
    @FXML private Label lbl17;
    @FXML private Label lbl18;
    @FXML private Label lbl19;
    @FXML private Label lbl20;
    @FXML private Label lbl21;
    @FXML private Label lbl22;
    @FXML private Label lbl23;
    @FXML private Label lbl24;
    @FXML private Label lbl25;
    @FXML private Label lbl26;
    @FXML private Label lbl27;
    @FXML private Label lbl28;
    @FXML private Label lbl29;
    @FXML private Label lbl30;
    @FXML private Label lbl31;
    @FXML private Label lbl32;
    @FXML private Label lbl33;
    @FXML private Label lbl34;
    @FXML private Label lbl35;
    @FXML private Label lbl36;
    @FXML private Label lbl37;
    @FXML private Label lbl38;
    
                    //1st Semester
    //Core Modules-1st Semester
@FXML private TextField text1;
@FXML private TextField text5;
@FXML private TextField text7;
@FXML private TextField text8;
@FXML private TextField text9;

    //Optional Modules-1st Semester
@FXML private TextField text2;
@FXML private TextField text3;
@FXML private TextField text4;
@FXML private TextField text6;
@FXML private TextField text10;
@FXML private TextField text11;
@FXML private TextField text12;
@FXML private TextField text13;
    
                     //2nd Semester
    //Core Modules-2nd Semester
@FXML private TextField text14;
@FXML private TextField text22;
@FXML private TextField text23;

     //Optional Modules-2nd Semester
@FXML private TextField text15;
@FXML private TextField text16;
@FXML private TextField text17;
@FXML private TextField text18;
@FXML private TextField text19;
@FXML private TextField text20;
@FXML private TextField text21;
@FXML private TextField text24;
@FXML private TextField text25;
@FXML private TextField text26;
@FXML private TextField text27;
@FXML private TextField text28;
@FXML private TextField text29;

@FXML private CheckBox check1T;
@FXML private CheckBox check1F;  
@FXML private CheckBox check2T;
@FXML private CheckBox check2F;
@FXML private CheckBox check3T;
@FXML private CheckBox check3F;

@FXML private Button btnnext;
                //NEXT SCENE
@FXML private Button addStudent;
@FXML private Button home;
@FXML private Button quit;

@FXML private Label new1;
@FXML private Label new2;
@FXML private Label new3;
@FXML private Label new4;
@FXML private Label new5;
@FXML private Label new6;

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
            check3T.setSelected(false);
            check3F.setSelected(false);
        }
    }
@FXML
    private void handleCheckBox2F(){
        if(check2F.isSelected()){
            check2T.setSelected(false);
            check3T.setSelected(false);
            check3F.setSelected(false);
        }
    }
@FXML
    private void handleCheckBox3T(){
        if(check3T.isSelected()){
            check3F.setSelected(false);
            check2T.setSelected(false);
            check2F.setSelected(false);
        }
    }
@FXML
    private void handleCheckBox3F(){
        if(check3F.isSelected()){
            check3T.setSelected(false);
            check2T.setSelected(false);
            check2F.setSelected(false);           
        }
    }

    ArrayList<Module> studentModule = new ArrayList<Module>();

@FXML 
private void next(ActionEvent evt) throws IOException{         

String txt1 = text1.getText();
String txt2 = text2.getText();
String txt3 = text3.getText();
String txt4 = text4.getText();
String txt5 = text5.getText();
String txt6 = text6.getText();
String txt7 = text7.getText();
String txt8 = text8.getText();
String txt9 = text9.getText();
String txt10 = text10.getText();
String txt11 = text11.getText();
String txt12 = text12.getText();
String txt13 = text13.getText();
String txt14 = text14.getText();
String txt15 = text15.getText();
String txt16 = text16.getText();
String txt17 = text17.getText();
String txt18 = text18.getText();
String txt19 = text19.getText();
String txt20 = text20.getText();
String txt21 = text21.getText();
String txt22 = text22.getText();
String txt23 = text23.getText();
String txt24 = text24.getText();
String txt25 = text25.getText();
String txt26 = text26.getText();
String txt27 = text27.getText();
String txt28 = text28.getText();
String txt29 = text29.getText();

int numOfCredits1 = 0;
int numOfCredits2 = 0;
int numOfCredits3 = 0;
int numOfCredits4 = 0;
int numOfCredits5 = 0;
int numOfCredits6 = 0;
int numOfCredits7 = 0;
int numOfCredits8 = 0;
int numOfCredits9 = 0;
int numOfCredits10 = 0;
int numOfCredits11 = 0;
int numOfCredits12 = 0;
int numOfCredits13 = 0;
int numOfCredits14 = 0;
int numOfCredits15 = 0;
int numOfCredits16 = 0;
int numOfCredits17 = 0;
int numOfCredits18 = 0;
int numOfCredits19 = 0;
int numOfCredits20 = 0;
int numOfCredits21 = 0;
int numOfCredits22 = 0;
int numOfCredits23 = 0;
int numOfCredits24 = 0;
int numOfCredits25 = 0;
int numOfCredits26 = 0;
int numOfCredits27 = 0;
int numOfCredits28 = 0;
int numOfCredits29 = 0;

                    //1st Semester
            //Core Modules-1st Semester
switch(txt1){
        case "A": case "A+":
            txt1 = "4.0";
            numOfCredits1 = 2;
            break;
      
        case "A-":
            txt1 = "3.7";
            numOfCredits1 = 2;
            break;
        
        case "B+":
            txt1 = "3.3";
            numOfCredits1 = 2;
            break;
            
        case "B":
            txt1 = "3.0";
            numOfCredits1 = 2;
            break;
            
        case "B-":
            txt1 = "2.7";
            numOfCredits1 = 2;
            break;
         
        case "C+":
            txt1 = "2.3";
            numOfCredits1 = 2;
            break;
            
        case "C":
            txt1 = "2.0";
            numOfCredits1 = 2;
            break;
            
        case "F":
            txt1 = "0.0";
            numOfCredits1 = 0;
            break;
            
        default:
            text1.setText(String.valueOf("Invalid"));
            break;
}
switch(txt5){
        case "A": case "A+":
            txt5 = "4.0";
            numOfCredits5 = 2;
            break;
      
        case "A-":
            txt5 = "3.7";
            numOfCredits5 = 2;
            break;
        
        case "B+":
            txt5 = "3.3";
            numOfCredits5 = 2;
            break;
            
        case "B":
            txt5 = "3.0";
            numOfCredits5 = 2;
            break;
            
        case "B-":
            txt5 = "2.7";
            numOfCredits5 = 2;
            break;
            
        case "C+":
            txt5 = "2.3";
            numOfCredits5 = 2;
            break;
            
        case "C":
            txt5 = "2.0";
            numOfCredits5 = 2;
            break;
            
        case "F":
            txt5 = "0.0";
            numOfCredits5 = 0;
            break;
            
        default:
            text5.setText(String.valueOf("Invalid"));
            break;
}
switch(txt7){
        case "A": case "A+":
            txt7 = "4.0";
            numOfCredits7 = 2;
            break;
      
        case "A-":
            txt7 = "3.7";
            numOfCredits7 = 2;
            break;
        
        case "B+":
            txt7 = "3.3";
            numOfCredits7 = 2;
            break;
            
        case "B":
            txt7 = "3.0";
            numOfCredits7 = 2;
            break;
            
        case "B-":
            txt7 = "2.7";
            numOfCredits7 = 2;
            break;
            
        case "C+":
            txt7 = "2.3";
            numOfCredits7 = 2;
            break;
            
        case "C":
            txt7 = "2.0";
            numOfCredits7 = 2;
            break;
            
        case "F":
            txt7 = "0.0";
            numOfCredits7 = 0;
            break;
        default:
            text7.setText(String.valueOf("Invalid"));
            break;    
}
switch(txt8){
        case "A": case "A+":
            txt8 = "4.0";
            numOfCredits8 = 2;
            break;
      
        case "A-":
            txt8 = "3.7";
            numOfCredits8 = 2;
            break;
        
        case "B+":
            txt8 = "3.3";
            numOfCredits8 = 2;
            break;
            
        case "B":
            txt8 = "3.0";
            numOfCredits8 = 2;
            break;
            
        case "B-":
            txt8 = "2.7";
            numOfCredits8 = 2;
            break;
            
        case "C+":
            txt8 = "2.3";
            numOfCredits8 = 2;
            break;
            
        case "C":
            txt8 = "2.0";
            numOfCredits8 = 2;
            break;
            
        case "F":
            txt8 = "0.0";
            numOfCredits8 = 0;
            break;
        default:
            text8.setText(String.valueOf("Invalid"));
            break;
}
switch(txt9){
        case "A": case "A+":
            txt9 = "4.0";
            numOfCredits9 = 2;
            break;
      
        case "A-":
            txt9 = "3.7";
            numOfCredits9 = 2;
            break;
        
        case "B+":
            txt9 = "3.3";
            numOfCredits9 = 2;
            break;
            
        case "B":
            txt9 = "3.0";
            numOfCredits9 = 2;
            break;
            
        case "B-":
            txt9 = "2.7";
            numOfCredits9 = 2;
            break;
            
        case "C+":
            txt9 = "2.3";
            numOfCredits9 = 2;
            break;
            
        case "C":
            txt9 = "2.0";
            numOfCredits9 = 2;
            break;
            
        case "F":
            txt9 = "0.0";
            numOfCredits9 = 0;
            break;
            
        default:
            text9.setText(String.valueOf("Invalid"));
            break;
}
                //2nd Semester
        //Core Modules-2nd Semester
switch(txt14){
        case "A": case "A+":
            txt14 = "4.0";
            numOfCredits14 = 2;
            break;
      
        case "A-":
            txt14 = "3.7";
            numOfCredits14 = 2;
            break;
        
        case "B+":
            txt14 = "3.3";
            numOfCredits14 = 2;
            break;
            
        case "B":
            txt14 = "3.0";
            numOfCredits14 = 2;
            break;
            
        case "B-":
            txt14 = "2.7";
            numOfCredits14 = 2;
            break;
         
        case "C+":
            txt14 = "2.3";
            numOfCredits14 = 2;
            break;
            
        case "C":
            txt14 = "2.0";
            numOfCredits14 = 2;
            break;
            
        case "F":
            txt14 = "0.0";
            numOfCredits14 = 0;
            break;
            
        default:
            text14.setText(String.valueOf("Invalid"));
            break;
}
switch(txt22){
        case "A": case "A+":
            txt22 = "4.0";
            numOfCredits22 = 2;
            break;
      
        case "A-":
            txt22 = "3.7";
            numOfCredits22 = 2;
            break;
        
        case "B+":
            txt22 = "3.3";
            numOfCredits22 = 2;
            break;
            
        case "B":
            txt22 = "3.0";
            numOfCredits22 = 2;
            break;
            
        case "B-":
            txt22 = "2.7";
            numOfCredits22 = 2;
            break;
            
        case "C+":
            txt22 = "2.3";
            numOfCredits22 = 2;
            break;
            
        case "C":
            txt22 = "2.0";
            numOfCredits22 = 2;
            break;
            
        case "F":
            txt22 = "0.0";
            numOfCredits22 = 0;
            break;
            
        default:
            text22.setText(String.valueOf("Invalid"));
            break;
}
switch(txt23){
        case "A": case "A+":
            txt23 = "4.0";
            numOfCredits23 = 2;
            break;
      
        case "A-":
            txt23 = "3.7";
            numOfCredits23 = 2;
            break;
        
        case "B+":
            txt23 = "3.3";
            numOfCredits23 = 2;
            break;
            
        case "B":
            txt23 = "3.0";
            numOfCredits23 = 2;
            break;
            
        case "B-":
            txt23 = "2.7";
            numOfCredits23 = 2;
            break;
            
        case "C+":
            txt23 = "2.3";
            numOfCredits23 = 2;
            break;
            
        case "C":
            txt23 = "2.0";
            numOfCredits23 = 2;
            break;
            
        case "F":
            txt23 = "0.0";
            numOfCredits23 = 0;
            break;
            
        default:
            text23.setText(String.valueOf("Invalid"));
            break;
}
                    //1st Semester
            //Optional Modules-1st Semester
switch(txt2){
        case "A": case "A+":
            txt2 = "4.0";
            numOfCredits2 = 2;
            break;
      
        case "A-":
            txt2 = "3.7";
            numOfCredits2 = 2;
            break;
        
        case "B+":
            txt2 = "3.3";
            numOfCredits2 = 2;
            break;
            
        case "B":
            txt2 = "3.0";
            numOfCredits2 = 2;
            break;
            
        case "B-":
            txt2 = "2.7";
            numOfCredits2 = 2;
            break;
         
        case "C+":
            txt2 = "2.3";
            numOfCredits2 = 2;
            break;
            
        case "C":
            txt2 = "2.0";
            numOfCredits2 = 2;
            break;
            
        case "F":
            txt2 = "0.0";
            numOfCredits2 = 0;
            break;
        
        default:
            text2.setText(String.valueOf("Invalid"));
            break;
}

switch(txt3){
        case "A": case "A+":
            txt3 = "4.0";
            numOfCredits3 = 2;
            break;
      
        case "A-":
            txt3 = "3.7";
            numOfCredits3 = 2;
            break;
        
        case "B+":
            txt3 = "3.3";
            numOfCredits3 = 2;
            break;
            
        case "B":
            txt3 = "3.0";
            numOfCredits3 = 2;
            break;
            
        case "B-":
            txt3 = "2.7";
            numOfCredits3 = 2;
            break;
            
        case "C+":
            txt3 = "2.3";
            numOfCredits3 = 2;
            break;
            
        case "C":
            txt3 = "2.0";
            numOfCredits3 = 2;
            break;
            
        case "F":
            txt3 = "0.0";
            numOfCredits3 = 0;
            break;
            
        default:
            text3.setText(String.valueOf("Invalid"));
            break;
}
switch(txt4){
        case "A": case "A+":
            txt4 = "4.0";
            numOfCredits4 = 2;
            break;
      
        case "A-":
            txt4 = "3.7";
            numOfCredits4 = 2;
            break;
        
        case "B+":
            txt4 = "3.3";
            numOfCredits4 = 2;
            break;
            
        case "B":
            txt4 = "3.0";
            numOfCredits4 = 2;
            break;
            
        case "B-":
            txt4 = "2.7";
            numOfCredits4 = 2;
            break;
            
        case "C+":
            txt4 = "2.3";
            numOfCredits4 = 2;
            break;
            
        case "C":
            txt4 = "2.0";
            numOfCredits4 = 2;
            break;
            
        case "F":
            txt4 = "0.0";
            numOfCredits4 = 0;
            break;
            
        default:
            text4.setText(String.valueOf("Invalid"));
            break;
}
switch(txt6){
        case "A": case "A+":
            txt6 = "4.0";
            numOfCredits6 = 2;
            break;
      
        case "A-":
            txt6 = "3.7";
            numOfCredits6 = 2;
            break;
        
        case "B+":
            txt6 = "3.3";
            numOfCredits6 = 2;
            break;
            
        case "B":
            txt6 = "3.0";
            numOfCredits6 = 2;
            break;
            
        case "B-":
            txt6 = "2.7";
            numOfCredits6 = 2;
            break;
            
        case "C+":
            txt6 = "2.3";
            numOfCredits6 = 2;
            break;
            
        case "C":
            txt6 = "2.0";
            numOfCredits6 = 2;
            break;
            
        case "F":
            txt6 = "0.0";
            numOfCredits6 = 0;
            break;
        
        default:
            text6.setText(String.valueOf("Invalid"));
            break;
}
switch(txt10){
        case "A": case "A+":
            txt10 = "4.0";
            numOfCredits10 = 2;
            break;
      
        case "A-":
            txt10 = "3.7";
            numOfCredits10 = 2;
            break;
        
        case "B+":
            txt10 = "3.3";
            numOfCredits10 = 2;
            break;
            
        case "B":
            txt10 = "3.0";
            numOfCredits10 = 2;
            break;
            
        case "B-":
            txt10 = "2.7";
            numOfCredits10 = 2;
            break;
            
        case "C+":
            txt10 = "2.3";
            numOfCredits10 = 2;
            break;
            
        case "C":
            txt10 = "2.0";
            numOfCredits10 = 2;
            break;
            
        case "F":
            txt10 = "0.0";
            numOfCredits10 = 0;
            break;
            
        default:
            text10.setText(String.valueOf("Invalid"));
            break;
}
                //2nd Semester
        //Core Modules-2nd Semester
switch(txt11){
        case "A": case "A+":
            txt11 = "4.0";
            numOfCredits11 = 2;
            break;
      
        case "A-":
            txt11 = "3.7";
            numOfCredits11 = 2;
            break;
        
        case "B+":
            txt11 = "3.3";
            numOfCredits11 = 2;
            break;
            
        case "B":
            txt11 = "3.0";
            numOfCredits11 = 2;
            break;
            
        case "B-":
            txt11 = "2.7";
            numOfCredits11 = 2;
            break;
         
        case "C+":
            txt11 = "2.3";
            numOfCredits11 = 2;
            break;
            
        case "C":
            txt11 = "2.0";
            numOfCredits11 = 2;
            break;
            
        case "F":
            txt11 = "0.0";
            numOfCredits11 = 0;
            break;
            
        default:
            text11.setText(String.valueOf("Invalid"));
            break;
}
switch(txt12){
        case "A": case "A+":
            txt12 = "4.0";
            numOfCredits12 = 2;
            break;
      
        case "A-":
            txt12 = "3.7";
            numOfCredits12 = 2;
            break;
        
        case "B+":
            txt12 = "3.3";
            numOfCredits12 = 2;
            break;
            
        case "B":
            txt12 = "3.0";
            numOfCredits12 = 2;
            break;
            
        case "B-":
            txt22 = "2.7";
            numOfCredits22 = 2;
            break;
            
        case "C+":
            txt12 = "2.3";
            numOfCredits12 = 2;
            break;
            
        case "C":
            txt12 = "2.0";
            numOfCredits12 = 2;
            break;
            
        case "F":
            txt12 = "0.0";
            numOfCredits12 = 0;
            break;
            
        default:
            text12.setText(String.valueOf("Invalid"));
            break;
}
switch(txt13){
        case "A": case "A+":
            txt13 = "4.0";
            numOfCredits13 = 2;
            break;
      
        case "A-":
            txt13 = "3.7";
            numOfCredits13 = 2;
            break;
        
        case "B+":
            txt13 = "3.3";
            numOfCredits13 = 2;
            break;
            
        case "B":
            txt13 = "3.0";
            numOfCredits13 = 2;
            break;
            
        case "B-":
            txt13 = "2.7";
            numOfCredits13 = 2;
            break;
            
        case "C+":
            txt13 = "2.3";
            numOfCredits13 = 2;
            break;
            
        case "C":
            txt13 = "2.0";
            numOfCredits13 = 2;
            break;
            
        case "F":
            txt13 = "0.0";
            numOfCredits13 = 0;
            break;
            
        default:
            text13.setText(String.valueOf("Invalid"));
            break;
} 
switch(txt15){
        case "A": case "A+":
            txt15 = "4.0";
            numOfCredits15 = 2;
            break;
      
        case "A-":
            txt15 = "3.7";
            numOfCredits15 = 2;
            break;
        
        case "B+":
            txt15 = "3.3";
            numOfCredits15 = 2;
            break;
            
        case "B":
            txt15 = "3.0";
            numOfCredits15 = 2;
            break;
            
        case "B-":
            txt15 = "2.7";
            numOfCredits15 = 2;
            break;
            
        case "C+":
            txt15 = "2.3";
            numOfCredits15 = 2;
            break;
            
        case "C":
            txt15 = "2.0";
            numOfCredits15 = 2;
            break;
            
        case "F":
            txt15 = "0.0";
            numOfCredits15 = 0;
            break;
            
        default:
            text15.setText(String.valueOf("Invalid"));
            break;
}
switch(txt16){
        case "A": case "A+":
            txt16 = "4.0";
            numOfCredits16 = 2;
            break;
      
        case "A-":
            txt16 = "3.7";
            numOfCredits16 = 2;
            break;
        
        case "B+":
            txt16 = "3.3";
            numOfCredits16 = 2;
            break;
            
        case "B":
            txt16 = "3.0";
            numOfCredits16 = 2;
            break;
            
        case "B-":
            txt16 = "2.7";
            numOfCredits16 = 2;
            break;
            
        case "C+":
            txt16 = "2.3";
            numOfCredits16 = 2;
            break;
            
        case "C":
            txt16 = "2.0";
            numOfCredits16 = 2;
            break;
            
        case "F":
            txt16 = "0.0";
            numOfCredits16 = 0;
            break;
        
        default:
            text16.setText(String.valueOf("Invalid"));
            break;
}
switch(txt17){
        case "A": case "A+":
            txt17 = "4.0";
            numOfCredits17 = 2;
            break;
      
        case "A-":
            txt17 = "3.7";
            numOfCredits17 = 2;
            break;
        
        case "B+":
            txt17 = "3.3";
            numOfCredits17 = 2;
            break;
            
        case "B":
            txt17 = "3.0";
            numOfCredits17 = 2;
            break;
            
        case "B-":
            txt17 = "2.7";
            numOfCredits17 = 2;
            break;
            
        case "C+":
            txt17 = "2.3";
            numOfCredits17 = 2;
            break;
            
        case "C":
            txt17 = "2.0";
            numOfCredits7 = 2;
            break;
            
        case "F":
            txt17 = "0.0";
            numOfCredits17 = 0;
            break;
        default:
            text17.setText(String.valueOf("Invalid"));
            break;    
}
switch(txt18){
        case "A": case "A+":
            txt18 = "4.0";
            numOfCredits18 = 2;
            break;
      
        case "A-":
            txt18 = "3.7";
            numOfCredits8 = 2;
            break;
        
        case "B+":
            txt18 = "3.3";
            numOfCredits18 = 2;
            break;
            
        case "B":
            txt8 = "3.0";
            numOfCredits18 = 2;
            break;
            
        case "B-":
            txt18 = "2.7";
            numOfCredits18 = 2;
            break;
            
        case "C+":
            txt18 = "2.3";
            numOfCredits18 = 2;
            break;
            
        case "C":
            txt18 = "2.0";
            numOfCredits18 = 2;
            break;
            
        case "F":
            txt18 = "0.0";
            numOfCredits18 = 0;
            break;
        default:
            text18.setText(String.valueOf("Invalid"));
            break;
}
switch(txt19){
        case "A": case "A+":
            txt19 = "4.0";
            numOfCredits19 = 2;
            break;
      
        case "A-":
            txt19 = "3.7";
            numOfCredits19 = 2;
            break;
        
        case "B+":
            txt19 = "3.3";
            numOfCredits19 = 2;
            break;
            
        case "B":
            txt19 = "3.0";
            numOfCredits19 = 2;
            break;
            
        case "B-":
            txt19 = "2.7";
            numOfCredits19 = 2;
            break;
            
        case "C+":
            txt19 = "2.3";
            numOfCredits19 = 2;
            break;
            
        case "C":
            txt19 = "2.0";
            numOfCredits19 = 2;
            break;
            
        case "F":
            txt19 = "0.0";
            numOfCredits19 = 0;
            break;
            
        default:
            text19.setText(String.valueOf("Invalid"));
            break;
}
switch(txt20){
        case "A": case "A+":
            txt20 = "4.0";
            numOfCredits20 = 2;
            break;
      
        case "A-":
            txt20 = "3.7";
            numOfCredits20 = 2;
            break;
        
        case "B+":
            txt20 = "3.3";
            numOfCredits20 = 2;
            break;
            
        case "B":
            txt20 = "3.0";
            numOfCredits20 = 2;
            break;
            
        case "B-":
            txt20 = "2.7";
            numOfCredits20 = 2;
            break;
            
        case "C+":
            txt20 = "2.3";
            numOfCredits20 = 2;
            break;
            
        case "C":
            txt20 = "2.0";
            numOfCredits20 = 2;
            break;
            
        case "F":
            txt20 = "0.0";
            numOfCredits20 = 0;
            break;
            
        default:
            text20.setText(String.valueOf("Invalid"));
            break;
}
                //2nd Semester
        //Core Modules-2nd Semester
switch(txt21){
        case "A": case "A+":
            txt21 = "4.0";
            numOfCredits21 = 2;
            break;
      
        case "A-":
            txt21 = "3.7";
            numOfCredits21 = 2;
            break;
        
        case "B+":
            txt21 = "3.3";
            numOfCredits21 = 2;
            break;
            
        case "B":
            txt21 = "3.0";
            numOfCredits21 = 2;
            break;
            
        case "B-":
            txt21 = "2.7";
            numOfCredits21 = 2;
            break;
         
        case "C+":
            txt21 = "2.3";
            numOfCredits21 = 2;
            break;
            
        case "C":
            txt21 = "2.0";
            numOfCredits21 = 2;
            break;
            
        case "F":
            txt21 = "0.0";
            numOfCredits21 = 0;
            break;
            
        default:
            text21.setText(String.valueOf("Invalid"));
            break;
}
switch(txt24){
        case "A": case "A+":
            txt24 = "4.0";
            numOfCredits24 = 2;
            break;
      
        case "A-":
            txt24 = "3.7";
            numOfCredits24 = 2;
            break;
        
        case "B+":
            txt24 = "3.3";
            numOfCredits24 = 2;
            break;
            
        case "B":
            txt24 = "3.0";
            numOfCredits24 = 2;
            break;
            
        case "B-":
            txt24 = "2.7";
            numOfCredits24 = 2;
            break;
            
        case "C+":
            txt24 = "2.3";
            numOfCredits24 = 2;
            break;
            
        case "C":
            txt24 = "2.0";
            numOfCredits24 = 2;
            break;
            
        case "F":
            txt24 = "0.0";
            numOfCredits24 = 0;
            break;
            
        default:
            text24.setText(String.valueOf("Invalid"));
            break;
}
switch(txt25){
        case "A": case "A+":
            txt25 = "4.0";
            numOfCredits25 = 2;
            break;
      
        case "A-":
            txt25 = "3.7";
            numOfCredits25 = 2;
            break;
        
        case "B+":
            txt25 = "3.3";
            numOfCredits25 = 2;
            break;
            
        case "B":
            txt25 = "3.0";
            numOfCredits25 = 2;
            break;
            
        case "B-":
            txt25 = "2.7";
            numOfCredits25 = 2;
            break;
            
        case "C+":
            txt25 = "2.3";
            numOfCredits25 = 2;
            break;
            
        case "C":
            txt25 = "2.0";
            numOfCredits25 = 2;
            break;
            
        case "F":
            txt25 = "0.0";
            numOfCredits25 = 0;
            break;
            
        default:
            text25.setText(String.valueOf("Invalid"));
            break;
}
switch(txt26){
        case "A": case "A+":
            txt26 = "4.0";
            numOfCredits26 = 2;
            break;
      
        case "A-":
            txt26 = "3.7";
            numOfCredits26 = 2;
            break;
        
        case "B+":
            txt26 = "3.3";
            numOfCredits26 = 2;
            break;
            
        case "B":
            txt26 = "3.0";
            numOfCredits26 = 2;
            break;
            
        case "B-":
            txt26 = "2.7";
            numOfCredits26 = 2;
            break;
            
        case "C+":
            txt26 = "2.3";
            numOfCredits26 = 2;
            break;
            
        case "C":
            txt26 = "2.0";
            numOfCredits26 = 2;
            break;
            
        case "F":
            txt26 = "0.0";
            numOfCredits26 = 0;
            break;
            
        default:
            text26.setText(String.valueOf("Invalid"));
            break;
}
switch(txt27){
        case "A": case "A+":
            txt27 = "4.0";
            numOfCredits27 = 2;
            break;
      
        case "A-":
            txt27 = "3.7";
            numOfCredits27 = 2;
            break;
        
        case "B+":
            txt27 = "3.3";
            numOfCredits27 = 2;
            break;
            
        case "B":
            txt27 = "3.0";
            numOfCredits27 = 2;
            break;
            
        case "B-":
            txt7 = "2.7";
            numOfCredits27 = 2;
            break;
            
        case "C+":
            txt27 = "2.3";
            numOfCredits27 = 2;
            break;
            
        case "C":
            txt27 = "2.0";
            numOfCredits27 = 2;
            break;
            
        case "F":
            txt27 = "0.0";
            numOfCredits27 = 0;
            break;
        default:
            text27.setText(String.valueOf("Invalid"));
            break;    
}
switch(txt28){
        case "A": case "A+":
            txt28 = "4.0";
            numOfCredits28 = 2;
            break;
      
        case "A-":
            txt28 = "3.7";
            numOfCredits28 = 2;
            break;
        
        case "B+":
            txt28 = "3.3";
            numOfCredits28 = 2;
            break;
            
        case "B":
            txt28 = "3.0";
            numOfCredits28 = 2;
            break;
            
        case "B-":
            txt28 = "2.7";
            numOfCredits28 = 2;
            break;
            
        case "C+":
            txt28 = "2.3";
            numOfCredits28 = 2;
            break;
            
        case "C":
            txt28 = "2.0";
            numOfCredits28 = 2;
            break;
            
        case "F":
            txt28 = "0.0";
            numOfCredits28 = 0;
            break;
        default:
            text28.setText(String.valueOf("Invalid"));
            break;
} 
switch(txt29){
        case "A": case "A+":
            txt29 = "4.0";
            numOfCredits29 = 2;
            break;
      
        case "A-":
            txt29 = "3.7";
            numOfCredits29 = 2;
            break;
        
        case "B+":
            txt29 = "3.3";
            numOfCredits29 = 2;
            break;
            
        case "B":
            txt29 = "3.0";
            numOfCredits29 = 2;
            break;
            
        case "B-":
            txt29 = "2.7";
            numOfCredits29 = 2;
            break;
            
        case "C+":
            txt29 = "2.3";
            numOfCredits29 = 2;
            break;
            
        case "C":
            txt29 = "2.0";
            numOfCredits29 = 2;
            break;
            
        case "F":
            txt29 = "0.0";
            numOfCredits29 = 0;
            break;
        default:
            text29.setText(String.valueOf("Invalid"));
            break;
}
//Core Modules
try{
  double tXT1 = Double.parseDouble(txt1);
  double tXT5 = Double.parseDouble(txt5);
  double tXT7 = Double.parseDouble(txt7);
  double tXT8 = Double.parseDouble(txt8);
  double tXT9 = Double.parseDouble(txt9);
  double tXT14 = Double.parseDouble(txt14);
  double tXT22 = Double.parseDouble(txt22);
  double tXT23 = Double.parseDouble(txt23);
 //Optional Modules
  double tXT2 = Double.parseDouble(txt2);
  double tXT3 = Double.parseDouble(txt3);
  double tXT4 = Double.parseDouble(txt4);
  double tXT6 = Double.parseDouble(txt6);
  double tXT10 = Double.parseDouble(txt10);
  double tXT11 = Double.parseDouble(txt11);
  double tXT12 = Double.parseDouble(txt12);
  double tXT13 = Double.parseDouble(txt13);
  double tXT15 = Double.parseDouble(txt15);
  double tXT16 = Double.parseDouble(txt16);
  double tXT17 = Double.parseDouble(txt17);
  double tXT18 = Double.parseDouble(txt18);
  double tXT19 = Double.parseDouble(txt19);
  double tXT20 = Double.parseDouble(txt20);
  double tXT21 = Double.parseDouble(txt21);
  double tXT24 = Double.parseDouble(txt24);
  double tXT25 = Double.parseDouble(txt25);
  double tXT26 = Double.parseDouble(txt26);
  double tXT27 = Double.parseDouble(txt27);
  double tXT28 = Double.parseDouble(txt28);
  double tXT29 = Double.parseDouble(txt29);
  
  if(tXT1 ==0 || tXT5 ==0 || tXT7 ==0 || tXT8 ==0 || tXT9 ==0 || tXT14 ==0 || tXT22 ==0 || tXT23 == 0){
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Oooopz...");
            message.setContentText("This student has to repeat the modules");
            message.showAndWait();
}

double coreMod = ((tXT1*numOfCredits1) + (tXT5*numOfCredits5) + (tXT7*numOfCredits7) + (tXT8*numOfCredits8) + (tXT9*numOfCredits9) + (tXT14*numOfCredits14) + (tXT22*numOfCredits22) + (tXT23*numOfCredits23));
double opModFirst= ((tXT2*numOfCredits2) + (tXT3*numOfCredits3) + (tXT4*numOfCredits4) + (tXT6*numOfCredits6) + (tXT10*numOfCredits10) + (tXT11*numOfCredits11) + (tXT12*numOfCredits12) + (tXT13*numOfCredits13));
double opModSecond = ((tXT15*numOfCredits15) + (tXT16*numOfCredits16) + (tXT17*numOfCredits17) + (tXT18*numOfCredits18) + (tXT19*numOfCredits19) + (tXT20*numOfCredits20) + (tXT21*numOfCredits21) + (tXT24*numOfCredits24) + (tXT25*numOfCredits25) + (tXT27*numOfCredits27) + (tXT28*numOfCredits28) + (tXT29*numOfCredits29));
double a = (numOfCredits1 + numOfCredits5 + numOfCredits7 + numOfCredits8 + numOfCredits9 + numOfCredits14 + numOfCredits22 + numOfCredits23);
double b = (numOfCredits2 + numOfCredits3 + numOfCredits4 + numOfCredits6 + numOfCredits10 + numOfCredits11 + numOfCredits12 + numOfCredits13 + numOfCredits15 + numOfCredits16 + numOfCredits17 + numOfCredits18 + numOfCredits19 + numOfCredits20 + numOfCredits21 + numOfCredits24 + numOfCredits25 + numOfCredits27 + numOfCredits28 + numOfCredits29);
double c = a+b;
double gpa = (coreMod + opModFirst + opModSecond)/c;
if(Double.isNaN(gpa)){
    gpa=0;
}
String degree = null;

if(gpa >= 3.0 && c >=30 && check2F.isSelected() || check3F.isSelected()){
    degree = "MSC in CS (Coursework)";
    //System.out.println("MSC in CS (Coursework)");
    //System.out.println("MSC in CS (Coursework)"+studentModule.get(0).sGPA);
}else if(gpa>=2.75 && gpa<=2.99 && c>=25 && check2F.isSelected() || check3F.isSelected()){
    degree = "Postgraduate Diploma in CS";
   // System.out.println("Postgraduate Diploma in CS");
    // System.out.println("Postgraduate Diploma in CS"+studentModule.get(0).sGPA);
}else if(gpa>=3.0 && c>=30 && check2T.isSelected()){    
   // System.out.println("MSC Degree in CS by Coursework and Research");
    degree = "MSC Degree in CS by Coursework and Research";
    // System.out.println("MSC Degree in CS by Coursework and Research"+studentModule.get(0).sGPA);
}else if(gpa >= 3.0 && c >=30 && check3T.isSelected()){
    degree = "MSC Degree in CS (Research)";
   // System.out.println("MSC Degree in CS (Research)");
   //  System.out.println("rchMSC in CS (Research)"+studentModule.get(0).sGPA);
}else{
   //  System.out.println("Ooops..! This student is not be able to get a MSC Degree");
     degree = "Ooops..! This student is not be able to get a MSC Degree";
} 
Module sMod = new Module();

        sMod.text1 = tXT1;
        sMod.text2 = tXT2;
        sMod.text3 = tXT3;
        sMod.text4 = tXT4;
        sMod.text5 = tXT5;
        sMod.text6 = tXT6;
        sMod.text7 = tXT7;
        sMod.text8 = tXT8;
        sMod.text9 = tXT9;
        sMod.text10 = tXT10;
        sMod.text11 = tXT11;
        sMod.text12 = tXT12;
        sMod.text13 = tXT13;
        sMod.text14 = tXT14;
        sMod.text15 = tXT15;
        sMod.text16 = tXT16;
        sMod.text17 = tXT17;
        sMod.text18 = tXT18;
        sMod.text19 = tXT19;
        sMod.text20 = tXT20;
        sMod.text21 = tXT21;
        sMod.text22 = tXT22;
        sMod.text23 = tXT23;
        sMod.text24 = tXT24;
        sMod.text25 = tXT25;
        sMod.text26 = tXT26;
        sMod.text27 = tXT27;
        sMod.text28 = tXT28;
        sMod.text29 = tXT29;
        
        sMod.numCredits1 = numOfCredits1;
        sMod.numCredits5 = numOfCredits5;
        sMod.numCredits7 = numOfCredits7;
        sMod.numCredits8 = numOfCredits8;
        sMod.numCredits9 = numOfCredits9;
        sMod.numCredits14 = numOfCredits14;
        sMod.numCredits22 = numOfCredits22;
        sMod.numCredits23 = numOfCredits23;
        
        sMod.numCredits2 = numOfCredits2;
        sMod.numCredits3 =  numOfCredits3;
        sMod.numCredits4 = numOfCredits4;
        sMod.numCredits6 = numOfCredits6;
        sMod.numCredits10 = numOfCredits10;
        sMod.numCredits11 = numOfCredits11;
        sMod.numCredits12 = numOfCredits12;
        sMod.numCredits13 = numOfCredits13;
        sMod.numCredits15 = numOfCredits15;
        sMod.numCredits16 = numOfCredits16;
        sMod.numCredits17 = numOfCredits17;
        sMod.numCredits18 = numOfCredits18;
        sMod.numCredits19 = numOfCredits19;
        sMod.numCredits20 = numOfCredits20;
        sMod.numCredits21 = numOfCredits21;
        sMod.numCredits24 = numOfCredits24;
        sMod.numCredits25 = numOfCredits25;
        sMod.numCredits26 = numOfCredits26;
        sMod.numCredits27 = numOfCredits27;
        sMod.numCredits28 = numOfCredits28;
        sMod.numCredits29 = numOfCredits29;
        
        sMod.sDegree = degree;
        sMod.sGPA = gpa;
        
        studentModule.add(sMod);
     
        if((check1T.isSelected()|| check1F.isSelected()) && (check2T.isSelected() || check2F.isSelected() || check3T.isSelected() || check3F.isSelected())){
   
       text1.setVisible(false);
       text2.setVisible(false);
       text3.setVisible(false);
       text4.setVisible(false);
       text5.setVisible(false);
       text6.setVisible(false);
       text7.setVisible(false);
       text8.setVisible(false);
       text9.setVisible(false);
       text10.setVisible(false);
       text11.setVisible(false);
       text12.setVisible(false);
       text13.setVisible(false);
       text14.setVisible(false);
       text15.setVisible(false);
       text16.setVisible(false);
       text17.setVisible(false);
       text18.setVisible(false);
       text19.setVisible(false);
       text20.setVisible(false);
       text21.setVisible(false);
       text22.setVisible(false);
       text23.setVisible(false);
       text24.setVisible(false);
       text25.setVisible(false);
       text26.setVisible(false);
       text27.setVisible(false);
       text28.setVisible(false);
       text29.setVisible(false);
    
       lbl1.setVisible(false);
       lbl2.setVisible(false);
       lbl3.setVisible(false);
       lbl4.setVisible(false);
       lbl5.setVisible(false);
       lbl6.setVisible(false);
       lbl7.setVisible(false);
       lbl8.setVisible(false);
       lbl9.setVisible(false);
       lbl10.setVisible(false);
       lbl11.setVisible(false);
       lbl12.setVisible(false);
       lbl13.setVisible(false);
       lbl14.setVisible(false);
       lbl15.setVisible(false);
       lbl16.setVisible(false);
       lbl17.setVisible(false);
       lbl18.setVisible(false);
       lbl19.setVisible(false);
       lbl20.setVisible(false);
       lbl21.setVisible(false);
       lbl22.setVisible(false);
       lbl23.setVisible(false);
       lbl24.setVisible(false);
       lbl25.setVisible(false);
       lbl26.setVisible(false);
       lbl27.setVisible(false);
       lbl28.setVisible(false);
       lbl29.setVisible(false);
       lbl30.setVisible(false);
       lbl31.setVisible(false);
       lbl32.setVisible(false);
       lbl33.setVisible(false);
       lbl34.setVisible(false);
       lbl35.setVisible(false);
       lbl36.setVisible(false);
       lbl37.setVisible(false);
       lbl38.setVisible(false);
      
       check1T.setVisible(false);
       check1F.setVisible(false);
       check2T.setVisible(false);
       check2F.setVisible(false);
       check3T.setVisible(false);
       check3F.setVisible(false);
   
       btnnext.setVisible(false);
       
       home.setVisible(true);
       addStudent.setVisible(true);
       quit.setVisible(true);
       
       new1.setVisible(true);
       new2.setVisible(true);
       new3.setVisible(true);
       new4.setVisible(true);
       new5.setVisible(true);
       new6.setVisible(true);
       
      new5.setText(String.valueOf(gpa));
      new6.setText(degree);
       
}else{
            Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Plese tick the boxes");
            message.showAndWait();
        }
} catch(Exception e){
         Alert message = new Alert(Alert.AlertType.INFORMATION);
            message.setHeaderText("Error");
            message.setContentText("Please enter your Results...");
            message.showAndWait();
        }
}

 @FXML 
    private void addStudent(ActionEvent evt) throws IOException{
        
            Parent root = FXMLLoader.load(getClass().getResource("StudentInformation.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            stage.setTitle("Staff Login");
            stage.setScene(scene);
            stage.show();            
    }
    
    @FXML
      private void home(ActionEvent evt) throws IOException{
        
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            Stage app_stage = (Stage) ((Node) evt.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setTitle("Student Login");
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
