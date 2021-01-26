package homework4;

import javax.swing.*;
import java.awt.*;

/**
 * A RegularTextStyle is an object used to change the font of the text of a
 * JTextPane to the regular font - defined as Serif, Plain, size 18.
 */
public class RegularTextStyle implements TextStyle
{
    /**
     * Changes the font of all text in pane to Serif, Plain, size 18.
     * @requires pane != null
     * @modifies pane
     * @effects Changes the font of all text in pane to Serif, Plain, size 18.
     */
    @Override
    public void changeFont(JTextPane pane)
    {
        Font font = new Font("Serif", Font.PLAIN, 18);
        pane.setFont(font);
    }
}
