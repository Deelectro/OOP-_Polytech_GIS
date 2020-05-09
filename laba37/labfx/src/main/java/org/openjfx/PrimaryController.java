package org.openjfx;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.util.Duration;

import static org.openjfx.RadioButtonHandler.rbControl;
import static org.openjfx.RadioButtonHandler.rbDisableAll;
import static org.openjfx.ResetHandler.*;

public class PrimaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton rbJumprope;

    @FXML
    private RadioButton rbSquatting;

    @FXML
    private RadioButton rbPushup;

    @FXML
    private Button bStartTrack;

    @FXML
    private Button bStopTrack;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label labelPushup;

    @FXML
    private Label labelSquatting;

    @FXML
    private Label labelJumprope;

    @FXML
    private Button bReset;

    // Формула каллорий в час = затрачиваемое кол-во калорий * Timer
    private static final float PUSHUP_CALORIES = 0.13f; // 475 калорий в час
    private static final float SQUATTING_CALORIES = 0.16f; // 600 калорий в час
    private static final float JUMPROPE_CALORIES = 0.14f; // 500 калорий в час
    private static final int CYCLE_COUNT = 3600; // цикл тренировки максимум 1 час
    private int timerPushup = 0;
    private int timerJumprope = 0;
    private int timerSquatting = 0;
    private float pushupCalories = 0.0f;
    private float squattingCalories = 0.0f;
    private float jumpropeCalories = 0.0f;

    private static final DecimalFormat df = new DecimalFormat("#.###");
    Timeline timeline;

    @FXML
    void initialize() {

        // нажата кнопка "Сброс"
        bReset.setOnAction(actionEvent -> {
            resetAll(labelPushup, labelJumprope, labelSquatting);
            timerPushup = resetTimer();
            timerJumprope = resetTimer();
            timerSquatting = resetTimer();
            pushupCalories = resetCalories();
            jumpropeCalories = resetCalories();
            squattingCalories = resetCalories();
        });

        // нажата кнопка "Начать тренировку"
        bStartTrack.setOnAction(actionEvent -> {
            bStopTrack.setDisable(false);
            bStartTrack.setDisable(true);
            bReset.setDisable(true);
            rbDisableAll(rbPushup, rbSquatting, rbJumprope, true);

            // запуск таймера
            timeline = new Timeline(
                    new KeyFrame(
                            Duration.seconds(1),
                            // каждую секунду повторять
                            actionEvent1 -> {
                                // если тренировка "Отжимания"
                                if (rbPushup.isSelected()) {
                                    timerPushup += 1; // увеличить на 1 секунду
                                    pushupCalories = PUSHUP_CALORIES * timerPushup; // каллорий потрачено
                                    labelPushup.setText("Прошло " + timerPushup + " секунд. " +
                                            "Потрачено " + df.format(pushupCalories) + " калорий"); // вывести статистику
                                }
                                // если тренировка "Приседания"
                                else if (rbSquatting.isSelected()) {
                                    timerSquatting += 1;
                                    squattingCalories = SQUATTING_CALORIES * timerSquatting;
                                    labelSquatting.setText("Прошло " + timerSquatting + " секунд. " +
                                            "Потрачено " + df.format(squattingCalories) + " калорий");
                                }
                                // если тренировка "Скакалка"
                                else {
                                    timerJumprope += 1;
                                    jumpropeCalories = JUMPROPE_CALORIES * timerJumprope;
                                    labelJumprope.setText("Прошло " + timerJumprope + " секунд. " +
                                            "Потрачено " + df.format(jumpropeCalories) + " калорий");
                                }
                            }
                            )
            );
            timeline.setCycleCount(CYCLE_COUNT);
            timeline.play();
        });

        // нажата кнопка "Закончить тренировку"
        bStopTrack.setOnAction(actionEvent -> {
            bStopTrack.setDisable(true);
            bStartTrack.setDisable(false);
            bReset.setDisable(false);
            rbDisableAll(rbPushup, rbSquatting, rbJumprope, false);

            // остановить таймер
            timeline.stop();
        });

        rbPushup.setOnAction(actionEvent -> {
            rbControl(rbPushup, rbJumprope, rbSquatting, bStartTrack);
        });

        rbJumprope.setOnAction(actionEvent -> {
            rbControl(rbJumprope, rbSquatting, rbPushup, bStartTrack);
        });

        rbSquatting.setOnAction(actionEvent -> {
            rbControl(rbSquatting, rbJumprope, rbPushup, bStartTrack);
        });

    }
}