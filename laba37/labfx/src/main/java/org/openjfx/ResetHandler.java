package org.openjfx;

import javafx.scene.control.Label;

public class ResetHandler {

    // сбросить все значения
    public static void resetAll (Label labelPushup, Label labelJumprope, Label labelSquatting) {
        labelPushup.setText("");
        labelJumprope.setText("");
        labelSquatting.setText("");
    }

    public static int resetTimer () {
        return 0;
    }

    public static float resetCalories () {
        return 0;
    }
}
