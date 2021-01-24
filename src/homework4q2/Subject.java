package homework4q2;

import java.util.ArrayList;
import java.util.List;

/**
 * A Subject is a general class that observers can listen to. //TODO add explan.
 */
public class Subject
{
    private final List<Observer> observers_ = new ArrayList<Observer>();

    /**
     * Description //TODO add
     * @requires
     * @modifies
     * @effects
     */
    public void attach(Observer observer)
    {
        observers_.add(observer);
    }

    /**
     * Description //TODO add
     * @requires
     * @modifies
     * @effects
     */
    public void detach(Observer observer)
    {
        observers_.remove(observer);
    }

    /**
     * Description //TODO add
     * @requires
     * @modifies
     * @effects
     */
    public void notifyObservers()
    {
        for(Observer observer : observers_)
        {
            //TODO check if really need to send entire subject as this, maybe
            // last line or something is enough.
            observer.update(this);
        }
    }
}
