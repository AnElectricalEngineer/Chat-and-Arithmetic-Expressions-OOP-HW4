package homework4q2;

import java.util.ArrayList;
import java.util.List;

/**
 * A Subject is a model which represents an object which updates
 * all of its observers when it is modified. All implementing
 * classes must implement the attach(), detach(), and notifyObservers() methods.
 *
 * The following fields are used in the specification:
 *
 * observers : List<Observers>  // A list of all the objects currently
 * observing this Subject.
 */
public class Subject
{
    private final List<Observer> observers_ = new ArrayList<Observer>();

    // Abstraction Function:
    // A Subject represents an object which can be observed by a number of
    // Observers: this.observers.

    // Representation Invariant:
    // For each observer o_i in this.observers, o_i != null.

    /**
     * Adds a new observer to the list of observers of this subject.
     * @requires observer != null
     * @modifies this.observers
     * @effects adds observer to this.observers
     */
    public void attach(Observer observer)
    {
        observers_.add(observer);
        checkRep();
    }

    /**
     * Removes the specified observer from the list of observers of this
     * subject.
     * @requires observer != null && this.observers.contains(observer) == true.
     * @modifies this.observers.
     * @effects Removes the Observer observer from this.observers, if
     * observer exists in this.observers.
     */
    public void detach(Observer observer)
    {
        checkRep();
        observers_.remove(observer);
        checkRep();
    }

    /**
     * Notifies all the current observers that this subject has been modified.
     * @requires none
     * @modifies none
     * @effects passes the Subject to all observers listed in this.observers.
     */
    public void notifyObservers()
    {
        checkRep();
        for(Observer observer : observers_)
        {
            observer.update(this);
        }
        checkRep();
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        for(Observer observer : observers_)
        {
            assert observer != null;
        }
    }

}
