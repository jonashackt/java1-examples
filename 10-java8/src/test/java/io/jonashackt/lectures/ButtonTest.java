package io.jonashackt.lectures;

import org.junit.jupiter.api.Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ButtonTest {

    @Test public void
    should_what_we_already_know() {
        CoolButton coolButton = new CoolButton();

        coolButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                coolButton.buttonWasClicked(true);
            }
        });

        assertEquals(false, coolButton.wasButtonAlreadyClicked());

        // Now image, somebody clickes our button!
        coolButton.someBodyClickedThatButton();

        assertEquals(true, coolButton.wasButtonAlreadyClicked());
    }

    @Test public void
    should_show_some_java8_magic() {
        CoolButton anotherButton = new CoolButton();

        anotherButton.addActionListener(event -> anotherButton.buttonWasClicked(true));

        assertEquals(false, anotherButton.wasButtonAlreadyClicked());

        // Now image, somebody clickes our button!
        anotherButton.someBodyClickedThatButton();

        assertEquals(true, anotherButton.wasButtonAlreadyClicked());
    }
}
