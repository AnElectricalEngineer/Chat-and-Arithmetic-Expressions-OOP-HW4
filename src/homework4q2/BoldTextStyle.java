package homework4q2;

import javax.swing.*;
import java.awt.*;

/**
 * A BoltTextStyle is an object used to change the font of the text of a
 * JTextPane to the Bold font - defined as Serif, Bold, size 18.
 */
public class BoldTextStyle implements TextStyle
{
    /**
     * Changes the font of all text in pane to Serif, Bold, size 18.
     * @requires pane != null
     * @modifies pane
     * @effects Changes the font of all text in pane to Serif, Bold, size 18.
     */
    @Override
    public void changeFont(JTextPane pane)
    {
        Font font = new Font("Serif", Font.BOLD, 18);
        pane.setFont(font);
    }
}
