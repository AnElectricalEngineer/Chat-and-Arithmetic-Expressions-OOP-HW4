package homework4q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatSystemGui
{
    private ChatSystem chatSystem_;
    private User user1 = new User("Student1");
    private User user2 = new User("Student2");
    private User user3 = new User("Student3");

    public ChatSystemGui()
    {
        chatSystem_ = new ChatSystem();
        chatSystem_.addUser(user1);
        chatSystem_.addUser(user2);
        chatSystem_.addUser(user3);
    }

    public JComponent createUserPanel()
    {
        JPanel mainPanel = new JPanel(); //Create the main panel
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        mainPanel.setLayout(new GridLayout(1,3));

        //Create the panels for each user
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.setLayout(new GridLayout(6, 1));
        panel2.setLayout(new GridLayout(6, 1));
        panel3.setLayout(new GridLayout(6, 1));

        //Create the labels for each user's chat box
        JLabel label1 = new JLabel("Chat box for User 1");
        JLabel label2 = new JLabel("Chat box for User 2");
        JLabel label3 = new JLabel("Chat box for User 3");
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);

        //Create the text panes for displaying chat to each user
        JTextPane area1 = new JTextPane();
        area1.setEditable(false);
        JTextPane area2 = new JTextPane();
        area2.setEditable(false);
        JTextPane area3 = new JTextPane();
        area3.setEditable(false);

        //Set the initial text style as regular
        TextStyle initialTextStyle = new RegularTextStyle();
        initialTextStyle.changeFont(area1);
        initialTextStyle.changeFont(area2);
        initialTextStyle.changeFont(area3);

        //Create the scroll panes for each user
        JScrollPane scrollPane1 = new JScrollPane(area1);
        JScrollPane scrollPane2 = new JScrollPane(area2);
        JScrollPane scrollPane3 = new JScrollPane(area3);

        panel1.add(scrollPane1);
        panel2.add(scrollPane2);
        panel3.add(scrollPane3);

        scrollPane1.setPreferredSize(new Dimension(280, 60));
        scrollPane2.setPreferredSize(new Dimension(280, 60));
        scrollPane3.setPreferredSize(new Dimension(280, 60));

        //Create the text field for each user to enter text
        JTextField field1 = new JTextField(50);
        field1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String newMessage = field1.getText();
                user1.sendMessage(newMessage);
                field1.setText(null);
                area1.setText(chatSystem_.getMessages());
                area2.setText(chatSystem_.getMessages());
                area3.setText(chatSystem_.getMessages());
            }
        });

        JTextField field2 = new JTextField(50);
        field2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String newMessage = field2.getText();
                user2.sendMessage(newMessage);
                field2.setText(null);
                area1.setText(chatSystem_.getMessages());
                area2.setText(chatSystem_.getMessages());
                area3.setText(chatSystem_.getMessages());
            }
        });

        JTextField field3 = new JTextField(50);
        field3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String newMessage = field3.getText();
                user3.sendMessage(newMessage);
                field3.setText(null);
                area1.setText(chatSystem_.getMessages());
                area2.setText(chatSystem_.getMessages());
                area3.setText(chatSystem_.getMessages());
            }
        });

        panel1.add(field1);
        panel2.add(field2);
        panel3.add(field3);

        //Create the buttons for changing fonts
        JButton regularFont1 = new JButton("Regular Font");
        regularFont1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle regularTextStyle = new RegularTextStyle();
                regularTextStyle.changeFont(area1);
            }
        });
        panel1.add(regularFont1);

        JButton boldFont1 = new JButton("Bold Font");
        boldFont1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle boldTextStyle = new BoldTextStyle();
                boldTextStyle.changeFont(area1);
            }
        });
        panel1.add(boldFont1);

        JButton alternateFont1 = new JButton("Alternate Font");
        alternateFont1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle alternateTextStyle = new ArialTextStyle();
                alternateTextStyle.changeFont(area1);
            }
        });
        panel1.add(alternateFont1);

        JButton regularFont2 = new JButton("Regular Font");
        regularFont2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle regularTextStyle = new RegularTextStyle();
                regularTextStyle.changeFont(area2);
            }
        });
        panel2.add(regularFont2);

        JButton boldFont2 = new JButton("Bold Font");
        boldFont2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle boldTextStyle = new BoldTextStyle();
                boldTextStyle.changeFont(area2);
            }
        });
        panel2.add(boldFont2);

        JButton alternateFont2 = new JButton("Alternate Font");
        alternateFont2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle alternateTextStyle = new ArialTextStyle();
                alternateTextStyle.changeFont(area2);
            }
        });
        panel2.add(alternateFont2);

        JButton regularFont3 = new JButton("Regular Font");
        regularFont3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle regularTextStyle = new RegularTextStyle();
                regularTextStyle.changeFont(area3);
            }
        });
        panel3.add(regularFont3);

        JButton boldFont3 = new JButton("Bold Font");
        boldFont3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle boldTextStyle = new BoldTextStyle();
                boldTextStyle.changeFont(area3);
            }
        });
        panel3.add(boldFont3);

        JButton alternateFont3 = new JButton("Alternate Font");
        alternateFont3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                TextStyle alternateTextStyle = new ArialTextStyle();
                alternateTextStyle.changeFont(area3);
            }
        });
        panel3.add(alternateFont3);

        //Add user panels to main panel
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

        return mainPanel;
    }

    public void addUser(User user)
    {
        chatSystem_.addUser(user);
    }

    public void removeUser(User user)
    {
        chatSystem_.removeUser(user);
    }

    public static void main(String[] args)
    {
        ChatSystemGui chatSystemGui = new ChatSystemGui();
        JFrame mainFrame = new JFrame("Chat System");
        JComponent contents = chatSystemGui.createUserPanel();
        mainFrame.getContentPane().add(contents);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
