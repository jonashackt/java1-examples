package io.jonashackt.lectures;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CoolButton {

    private boolean wasButtonClicked = false;

    private ActionListener actionListener = null;

    public void addActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void someBodyClickedThatButton() {
        ActionEvent actionEvent = new ActionEvent(this, 12, "Cool Button clicked, man!");

        actionListener.actionPerformed(actionEvent);
    }

    public boolean wasButtonAlreadyClicked() {
        return wasButtonClicked;
    }

    public void buttonWasClicked(boolean wasButtonClicked) {
        this.wasButtonClicked = wasButtonClicked;
    }
}
