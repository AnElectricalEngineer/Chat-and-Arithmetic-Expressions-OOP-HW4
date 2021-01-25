package homework4q2;

import java.util.ArrayList;
import java.util.List;

/**
 * A ChatSystem is a model which represents an entire chat system. A
 * ChatSystem is composed of multiple Users, who can send messages, and a
 * ChatBox, which contains all the sent messages. When a User sends a
 * message, all the current Users see the message in their ChatBox.
 *
 * The following fields are used in the specification:
 *
 * chatbox : ChatBox   // A ChatBox holding all of the messages sent by all
 * users during the current chat session.
 * users : List<Users>  // A list of all of the Users who are currently using
 * the ChatSystem.
 */
public class ChatSystem
{
    private ChatBox chatBox_;
    private List<User> users_;

    // Abstraction Function:
    // A ChatSystem represents a chat system comprised of a list of users:
    // this.users and a global chat box: this.chatbox.

    // Representation Invariant:
    // this.chatbox != null and for each user u_i in this.users, u_i != null.


    /**
     * Constructs a new ChatSystem
     * @requires none
     * @modifies this
     * @effects Constructs a new ChatSystem with an empty list of users and
     * an empty chatbox.
     */
    public ChatSystem()
    {
        chatBox_ = new ChatBox();
        users_ = new ArrayList<User>();
        checkRep();
    }

    /**
     * Adds a new user to the chat system.
     * @requires user != null
     * @modifies this.users and this.chatbox.
     * @effects Adds the User user to this.users, and attaches user as an
     * observer to this.chatbox.
     */
    public void addUser(User user)
    {
        checkRep();
        users_.add(user);
        user.setChatBox(chatBox_);
        chatBox_.attach(user);
        checkRep();
    }

    /**
     * Removes a user from the chat system.
     * @requires user != null && this.users.contains(user) == true
     * @modifies this.users and this.chatbox.
     * @effects Removes the User user from this.users, and detaches user from
     * this.chatbox, if user exists in this.users.
     */
    public void removeUser(User user)
    {
        checkRep();
        users_.remove(user);
        chatBox_.detach(user);
        checkRep();
    }

    /**
     * Returns a string containing all the lines of text sent during this
     * chat session.
     * @requires none
     * @modifies none
     * @effects Returns a string containing newline terminated lines of text
     * which represent all the text messages sent during the current chat
     * session.
     */
    public String getMessages()
    {
        checkRep();
        return chatBox_.getMessages();
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        assert chatBox_ != null;
        for(User user : users_)
        {
            assert user != null;
        }
    }

}
