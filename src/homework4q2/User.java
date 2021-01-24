package homework4q2;

import java.util.Iterator;

public class User implements Observer
{
    private final String userName_;
    private final int userID_;

    public User(String userName, int userID)
    {
        userName_ = userName;
        userID_ = userID;
    }

    public void update(Subject subject)
    {
        ChatBox chatBox = (ChatBox)subject;
        //update chatbox
        int i = 1;
        Iterator<String> chatBoxIterator = chatBox.getMessages();
        while(chatBoxIterator.hasNext())
        {
            System.out.println(i +": " + chatBoxIterator.next());
            i++;
        }
    }

    @Override
    public String toString()
    {
        return userName_ + userID_;
    }
}
