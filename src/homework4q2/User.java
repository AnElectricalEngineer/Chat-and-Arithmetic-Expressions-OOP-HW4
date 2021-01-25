package homework4q2;

import java.util.Iterator;

public class User implements Observer
{
    private final String userName_;
    private ChatBox chatBox_;

    public User(String userName)
    {
        userName_ = userName;
        chatBox_ = null;
    }

    public void update(Subject subject)
    {
        chatBox_ = (ChatBox)subject;
    }

    public void setChatBox(ChatBox chatBox)
    {
        chatBox_ = chatBox;
    }

    public void sendMessage(String message)
    {
        chatBox_.sendMessage(this + ": " + message);
    }

    @Override
    public String toString()
    {
        return userName_;
    }
}
