package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {

        @FXML
        private CheckBox cbApp;
        @FXML
        private CheckBox cbMusic;
        @FXML
        private ComboBox cmMusic;
        @FXML
        private Button finish;
        @FXML
        private ToggleGroup radioGroup;
        @FXML
        private RadioButton rbEducation;
        @FXML
        private RadioButton rbGame;
        @FXML
        private RadioButton rbProductivity;
        @FXML
        private Button submit;
        @FXML
        private TextField tbAccountNumber;
        @FXML
        private TextField txtCity;
        @FXML
        private TextField tbDatePurchased;
        @FXML
        private TextField txtName;
        @FXML
        private TextField txtState;
        @FXML
        private TextField txtStreet;
        @FXML
        private TextField txtTitle;
        @FXML
        private TextField txtZip;
        @FXML
        private Label tyapp;
        @FXML
        private Label tymusic;


        public void toggleMusic() {
//      if appButton is checked then chooseOne and type of music will be disabled
                if (cbApp.isSelected()) {
                        cmMusic.setDisable(true);
                        tymusic.setDisable(true);


                } else   // if appButton is unchecked then chooseOne and type of music will be enabled
                {
                        cmMusic.setDisable(false);
                        tymusic.setDisable(false);

                }
                if (cbMusic.isSelected())
                {
                        tyapp.setDisable(true);
                        rbEducation.setDisable(true);
                        rbGame.setDisable(true);
                        rbProductivity.setDisable(true);

                }
                else
                {
                        tyapp.setDisable(false);
                        rbEducation.setDisable(false);
                        rbGame.setDisable(false);
                        rbProductivity.setDisable(false);
                }
        }
}




