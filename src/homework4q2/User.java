package homework4q2;

/**
 * A User is a model that represents a single person who intends to use a
 * chat system. Each user can be uniquely identified by his/her username. A
 * User implements the Observer interface and is notified whenever a chat
 * message is sent on the chat system which the user is a part of.
 *
 * The following fields are used in the specification:
 *
 * username : String    // a unique String which identifies the User
 * chatbox : ChatBox    // a reference to the shared chatbox of the system
 */
public class User implements Observer
{
    private final String userName_;
    private ChatBox chatBox_;

    // Abstraction Function:
    // A User represents a single person who can chat on the chat system with
    // the username this.username. Each user has a reference to the global
    // chatbox: this.chatbox.

    // Representation Invariant:
    // username != null

    /**
     * Constructs a new User with the specified username.
     * @requires userName != null
     * @modifies this
     * @effects Constructs a new User with the username userName and a null
     * ChatBox.
     */
    public User(String userName)
    {
        userName_ = userName;
        chatBox_ = null;
        checkRep();
    }

    /**
     * Updates the chatbox to contain the all the messages sent through the
     * chat system including the most up to date messages.
     * @requires subject != null
     * @modifies this.chatbox
     * @effects replaces this.chatbox with an updated chatbox.
     */
    public void update(Subject subject)
    {
        checkRep();
        chatBox_ = (ChatBox)subject;
        checkRep();
    }

    /**
     * Sets the current chatbox to be chatBox.
     * @requires chatBox != null
     * @modifies this.chatbox
     * @effects Sets this.chatbox to chatBox.
     */
    public void setChatBox(ChatBox chatBox)
    {
        checkRep();
        chatBox_ = chatBox;
        checkRep();
    }

    /**
     * Sends a message through the chat system in the form: username: message.
     * @requires message != null
     * @modifies this.chatbox
     * @effects adds a new line of text: message to this.chatbox
     */
    public void sendMessage(String message)
    {
        checkRep();
        chatBox_.sendMessage(this + ": " + message);
        checkRep();
    }

    /**
     * Returns a string representation of this.
     * @return a string representation of this.
     */
    @Override
    public String toString()
    {
        checkRep();
        return userName_;
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        assert userName_ != null;
    }
}
