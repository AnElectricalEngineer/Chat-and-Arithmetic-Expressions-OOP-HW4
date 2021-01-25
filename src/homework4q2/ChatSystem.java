package homework4q2;

import java.util.ArrayList;
import java.util.List;

public class ChatSystem
{
    private ChatBox chatBox_;
    private List<User> users_;

    public ChatSystem()
    {
        chatBox_ = new ChatBox();
        users_ = new ArrayList<User>();
    }

    public void addUser(User user)
    {
        users_.add(user);
        user.setChatBox(chatBox_);
        chatBox_.attach(user);
    }

    public void removeUser(User user)
    {
        users_.remove(user);
        chatBox_.detach(user);
    }

    public String getMessages()
    {
        return chatBox_.getMessages();
    }

}
