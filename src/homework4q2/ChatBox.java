package homework4q2;

import java.util.ArrayList;
import java.util.List;

/**
 * A ChatBox is a model which represents the chat box of a chat system. It holds
 * a list of all the messages that have been sent through the chat system
 * during a given chat session. ChatBoxes can be used as subjects, which
 * notify all of their observers when a new message is sent.
 *
 * The following fields are used in the specification:
 *
 * messages : List<String>   // A List of all the messages sent during the
 * current chat session.
 */
public class ChatBox extends Subject
{
    private final List<String> messages_;

    // Abstraction Function:
    // A ChatBox represents a box of text messages sent during the current
    // chat session with the messages: this.messages.

    // Representation Invariant:
    // For each message m_i in this.messages, m_i != null.


    /**
     * Constructs a new ChatBox
     * @requires none
     * @modifies this
     * @effects Constructs a new ChatBox with an empty list of messages
     */
    public ChatBox()
    {
        messages_ = new ArrayList<String>();
        checkRep();
    }

    /**
     * Adds a new message to the chatbox and updates all the current observers.
     * @requires message != null
     * @modifies this.messages
     * @effects adds message to this.messages and sends the updated chatbox
     * to every observer in super.observers.
     */
    public void sendMessage(String message)
    {
        checkRep();
        messages_.add(message);
        notifyObservers();
        checkRep();
    }

    /**
     * Returns all the current messages held in the chatbox.
     * @requires none
     * @modifies none
     * @effects returns a string containing all the current messages held in
     * the chatbox, each message on a new line.
     */
    public String getMessages()
    {
        checkRep();
        StringBuilder sb = new StringBuilder();
        for(String message : messages_)
        {
            sb.append(message).append("\n");
        }
        checkRep();
        return sb.toString();
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        for(String message : messages_)
        {
            assert message != null;
        }
    }

}
