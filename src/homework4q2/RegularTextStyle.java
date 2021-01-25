package homework4q2;

import javax.swing.*;
import java.awt.*;

public class RegularTextStyle implements TextStyle
{
    @Override
    public void changeFont(JTextPane pane)
    {
        Font font = new Font("Serif", Font.PLAIN, 18);
        pane.setFont(font);
    }
}
