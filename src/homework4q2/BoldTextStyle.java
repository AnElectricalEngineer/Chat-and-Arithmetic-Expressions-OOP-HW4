package homework4q2;

import javax.swing.*;
import java.awt.*;

public class BoldTextStyle implements TextStyle
{
    @Override
    public void changeFont(JTextPane pane)
    {
        Font font = new Font("Serif", Font.BOLD, 18);
        pane.setFont(font);
    }
}
