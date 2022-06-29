/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package iknow;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Optional;
import static javafx.application.Platform.exit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author quiceno
 */
public class GameController {

    private Stage stage;
    private Scene scene;
    private Parent parent;
    @FXML
    private TextField Player1;
    @FXML
    private TextField Player2;
    @FXML
    private static RadioButton optionA;
    @FXML
    private static RadioButton optionB;
    @FXML
    private static RadioButton optionC;

    private static String NamePlayer1;
    private static String NamePlayer2;
    private static Integer NumPlayer;
    private static Integer NumQuestion;
    private static ActionEvent eventResult;

    private static Hashtable<Integer, String> resultPlayer1 = new Hashtable<>();
    private static Hashtable<Integer, String> resultPlayer2 = new Hashtable<>();

    public void Play(ActionEvent event) throws IOException {
        NamePlayer1 = Player1.getText();
        NamePlayer2 = Player2.getText();
        eventResult = event;
        // create a alert
        Alert a = new Alert(AlertType.WARNING);

        if ("".equals(NamePlayer1) || "".equals(NamePlayer2)) {
            a.setContentText("Por favor ingrese los jugadores");
            a.show();
            return;
        }

        Parent root = FXMLLoader.load(getClass().getResource("Questions.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        ShowQuestions(root);
    }

    private void ShowQuestions(Parent root) {
        Label playerLbl = (Label) root.lookup("#PlayerLbl");
        if (playerLbl != null) {
            playerLbl.setText(NamePlayer1);
            NumPlayer = 1;
        }
        Question1(root);
        stage.show();
    }

    private void Question1(Parent root) {

        Label playerLbl = (Label) root.lookup("#PlayerLbl");
        if (playerLbl != null && NumPlayer.equals(1)) {
            playerLbl.setText(NamePlayer1);
        } else if (playerLbl != null) {
            playerLbl.setText(NamePlayer2);
        }

        Label titleLbl = (Label) root.lookup("#TitleLbl");
        if (titleLbl != null) {
            titleLbl.setText("Question 1");
            NumQuestion = 1;
        }
        //
        TextField question = (TextField) root.lookup("#Question");
        if (question != null) {
            question.setText("Learn");
        }

        optionA = (RadioButton) root.lookup("#OptionA");
        if (optionA != null) {
            optionA.setText("Leer");
        }

        optionB = (RadioButton) root.lookup("#OptionB");
        if (optionB != null) {
            optionB.setText("Aprender");
        }

        optionC = (RadioButton) root.lookup("#OptionC");
        if (optionC != null) {
            optionC.setText("Jugar");
        }
    }

    private void Question2(Parent root) {

        Label playerLbl = (Label) root.lookup("#PlayerLbl");
        if (playerLbl != null && NumPlayer.equals(1)) {
            playerLbl.setText(NamePlayer1);
        } else if (playerLbl != null) {
            playerLbl.setText(NamePlayer2);
        }

        Label titleLbl = (Label) root.lookup("#TitleLbl");
        if (titleLbl != null) {
            titleLbl.setText("Question 2");
            NumQuestion = 2;
        }
        //
        TextField question = (TextField) root.lookup("#Question");
        if (question != null) {
            question.setText("Fly");
        }

        optionA = (RadioButton) root.lookup("#OptionA");
        if (optionA != null) {
            optionA.setText("Volar");
        }

        optionB = (RadioButton) root.lookup("#OptionB");
        if (optionB != null) {
            optionB.setText("Caer");
        }

        optionC = (RadioButton) root.lookup("#OptionC");
        if (optionC != null) {
            optionC.setText("Escribir");
        }
    }

    private void Question3(Parent root) {

        Label playerLbl = (Label) root.lookup("#PlayerLbl");
        if (playerLbl != null && NumPlayer.equals(1)) {
            playerLbl.setText(NamePlayer1);
        } else if (playerLbl != null) {
            playerLbl.setText(NamePlayer2);
        }

        Label titleLbl = (Label) root.lookup("#TitleLbl");
        if (titleLbl != null) {
            titleLbl.setText("Question 3");
            NumQuestion = 3;
        }
        //
        TextField question = (TextField) root.lookup("#Question");
        if (question != null) {
            question.setText("Bring");
        }

        optionA = (RadioButton) root.lookup("#OptionA");
        if (optionA != null) {
            optionA.setText("Comer");
        }

        optionB = (RadioButton) root.lookup("#OptionB");
        if (optionB != null) {
            optionB.setText("Traer");
        }

        optionC = (RadioButton) root.lookup("#OptionC");
        if (optionC != null) {
            optionC.setText("Cantar");
        }
    }

    private void Question4(Parent root) {

        Label playerLbl = (Label) root.lookup("#PlayerLbl");
        if (playerLbl != null && NumPlayer.equals(1)) {
            playerLbl.setText(NamePlayer1);
        } else if (playerLbl != null) {
            playerLbl.setText(NamePlayer2);
        }

        Label titleLbl = (Label) root.lookup("#TitleLbl");
        if (titleLbl != null) {
            titleLbl.setText("Question 4");
            NumQuestion = 4;
        }
        //
        TextField question = (TextField) root.lookup("#Question");
        if (question != null) {
            question.setText("Give");
        }

        optionA = (RadioButton) root.lookup("#OptionA");
        if (optionA != null) {
            optionA.setText("Ir");
        }

        optionB = (RadioButton) root.lookup("#OptionB");
        if (optionB != null) {
            optionB.setText("Recibir");
        }

        optionC = (RadioButton) root.lookup("#OptionC");
        if (optionC != null) {
            optionC.setText("Dar");
        }
    }

    private void Question5(Parent root) {

        Label playerLbl = (Label) root.lookup("#PlayerLbl");
        if (playerLbl != null && NumPlayer.equals(1)) {
            playerLbl.setText(NamePlayer1);
        } else if (playerLbl != null) {
            playerLbl.setText(NamePlayer2);
        }

        Label titleLbl = (Label) root.lookup("#TitleLbl");
        if (titleLbl != null) {
            titleLbl.setText("Question 5");
            NumQuestion = 5;
        }
        //
        TextField question = (TextField) root.lookup("#Question");
        if (question != null) {
            question.setText("Break");
        }

        optionA = (RadioButton) root.lookup("#OptionA");
        if (optionA != null) {
            optionA.setText("Romper");
        }

        optionB = (RadioButton) root.lookup("#OptionB");
        if (optionB != null) {
            optionB.setText("Apostar");
        }

        optionC = (RadioButton) root.lookup("#OptionC");
        if (optionC != null) {
            optionC.setText("Doblar");
        }
    }

    public void SaveQuestion(ActionEvent event) throws IOException {

        if (optionA.isSelected() || optionB.isSelected() || optionC.isSelected()) {
            if (NumPlayer.equals(1)) {
                if (optionA.isSelected()) {
                    resultPlayer1.put(NumQuestion, "A");
                }
                if (optionB.isSelected()) {
                    resultPlayer1.put(NumQuestion, "B");
                }
                if (optionC.isSelected()) {
                    resultPlayer1.put(NumQuestion, "C");
                }
            }
            if (NumPlayer.equals(2)) {
                if (optionA.isSelected()) {
                    resultPlayer2.put(NumQuestion, "A");
                }
                if (optionB.isSelected()) {
                    resultPlayer2.put(NumQuestion, "B");
                }
                if (optionC.isSelected()) {
                    resultPlayer2.put(NumQuestion, "C");
                }
            }
            NumQuestion = NumQuestion + 1;
            NextQuestion(event, NumQuestion);
        } else {
            // create a alert
            Alert a = new Alert(AlertType.WARNING);
            a.setContentText("Debe seleccionar al menos una opción");
            a.show();
        }
    }

    private void NextQuestion(ActionEvent event, Integer numQuestion) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Questions.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        if (numQuestion.equals(2)) {
            Question2(root);
        }
        if (numQuestion.equals(3)) {
            Question3(root);
        }
        if (numQuestion.equals(4)) {
            Question4(root);
        }
        if (numQuestion.equals(5)) {
            Question5(root);
        }
        if (numQuestion.equals(6)) {
            if (numQuestion.equals(6) && NumPlayer.equals(2)) {
                Alert a = new Alert(AlertType.INFORMATION);

                var p1q1 = resultPlayer1.get(1).equals("B") ? "CORRECTO" : "INCORRECTO";
                var p1q2 = resultPlayer1.get(2).equals("A") ? "CORRECTO" : "INCORRECTO";
                var p1q3 = resultPlayer1.get(3).equals("B") ? "CORRECTO" : "INCORRECTO";
                var p1q4 = resultPlayer1.get(4).equals("C") ? "CORRECTO" : "INCORRECTO";
                var p1q5 = resultPlayer1.get(5).equals("A") ? "CORRECTO" : "INCORRECTO";

                var p2q1 = resultPlayer2.get(1).equals("B") ? "CORRECTO" : "INCORRECTO";
                var p2q2 = resultPlayer2.get(2).equals("A") ? "CORRECTO" : "INCORRECTO";
                var p2q3 = resultPlayer2.get(3).equals("B") ? "CORRECTO" : "INCORRECTO";
                var p2q4 = resultPlayer2.get(4).equals("C") ? "CORRECTO" : "INCORRECTO";
                var p2q5 = resultPlayer2.get(5).equals("A") ? "CORRECTO" : "INCORRECTO";

                a.setContentText(
                        """
                        RESULTADOS\r
                        Jugador: """ + NamePlayer1 + "\r\n"
                        + "Pregunta 1: " + resultPlayer1.get(1) + " " + p1q1 + "\r\n"
                        + "Pregunta 2: " + resultPlayer1.get(2) + " " + p1q2 + "\r\n"
                        + "Pregunta 3: " + resultPlayer1.get(3) + " " + p1q3 + "\r\n"
                        + "Pregunta 4: " + resultPlayer1.get(4) + " " + p1q4 + "\r\n"
                        + "Pregunta 5: " + resultPlayer1.get(5) + " " + p1q5 + "\r\n" + "\r\n"
                        + "Jugador: " + NamePlayer2 + "\r\n"
                        + "Pregunta 1: " + resultPlayer2.get(1) + " " + p2q1 + "\r\n"
                        + "Pregunta 2: " + resultPlayer2.get(2) + " " + p2q2 + "\r\n"
                        + "Pregunta 3: " + resultPlayer2.get(3) + " " + p2q3 + "\r\n"
                        + "Pregunta 4: " + resultPlayer2.get(4) + " " + p2q4 + "\r\n"
                        + "Pregunta 5: " + resultPlayer2.get(5) + " " + p2q5 + "\r\n"
                );

                Optional<ButtonType> result = a.showAndWait();
                ButtonType button = result.orElse(ButtonType.CANCEL);

                if (button == ButtonType.OK) {
                    exit();
                } 
                //else {
                  //  System.out.println("canceled");
                //}
                //a.show();
            } else {
                Alert a = new Alert(AlertType.WARNING);
                a.setContentText("Tu turno: " + NamePlayer2);
                a.show();
                NumPlayer = 2;
                NumQuestion = 1;
                Question1(root);
            }
        }
    }

    private void Results(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("test.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);

        //TableView tableResult = (TableView)root.lookup("#TableResult");
        TableColumn<String, String> player1 = new TableColumn<>("Player1");
        player1.setCellValueFactory(new PropertyValueFactory<>(NamePlayer1));

        TableColumn<String, String> player2 = new TableColumn<>("Player2");
        player2.setCellValueFactory(new PropertyValueFactory<>(NamePlayer2));

        stage.show();
    }

}
