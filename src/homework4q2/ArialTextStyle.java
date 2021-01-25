package homework4q2;

import javax.swing.*;
import java.awt.*;

public class ArialTextStyle implements TextStyle
{
    @Override
    public void changeFont(JTextPane pane)
    {
        Font font = new Font("Arial", Font.PLAIN, 18);
        pane.setFont(font);
    }
}
