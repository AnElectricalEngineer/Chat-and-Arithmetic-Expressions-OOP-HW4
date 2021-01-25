package homework4q2;

import javax.swing.*;
import java.awt.*;

/**
 * An ArialTextStyle is an object used to change the font of the text of a
 * JTextPane to an alternate font - defined as Arial, Plain, size 18.
 */
public class ArialTextStyle implements TextStyle
{
    /**
     * Changes the font of all text in pane to Arial, Plain, size 18.
     * @requires pane != null
     * @modifies pane
     * @effects Changes the font of all text in pane to Arial, Plain, size 18.
     */
    @Override
    public void changeFont(JTextPane pane)
    {
        Font font = new Font("Arial", Font.PLAIN, 18);
        pane.setFont(font);
    }
}
