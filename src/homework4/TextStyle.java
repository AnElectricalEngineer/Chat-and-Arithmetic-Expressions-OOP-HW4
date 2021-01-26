package homework4;

import javax.swing.*;

/**
 * A TextStyle is an Interface used to change the font of the text of a
 * JTextPane, using the Strategy design pattern. All implementing classes
 * must implement the changeFont() method.
 */
public interface TextStyle
{
    void changeFont(JTextPane pane);
}