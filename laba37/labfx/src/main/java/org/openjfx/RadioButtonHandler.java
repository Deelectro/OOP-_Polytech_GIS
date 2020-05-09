package org.openjfx;

import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

// отвечает за доступность переключателей
public class RadioButtonHandler {
    public static void rbDisableAll(RadioButton rb1, RadioButton rb2, RadioButton rb3, boolean disable) {
        if (rb1.isSelected()) {
            rb1.setDisable(disable);
        } else if (rb2.isSelected()) {
            rb2.setDisable(disable);
        } else {
            rb3.setDisable(disable);
        }
    }

    public static void rbDisable(RadioButton rb1, RadioButton rb2, boolean disable) {
        rb1.setDisable(disable);
        rb2.setDisable(disable);
    }

    public static void rbControl(RadioButton rb, RadioButton rb1, RadioButton rb2, Button button) {
        if (rb.isSelected()) {
            rbDisable(rb1, rb2, true);
            button.setDisable(false);
        } else {
            rbDisable(rb1, rb2, false);
            button.setDisable(true);
        }
    }
}
