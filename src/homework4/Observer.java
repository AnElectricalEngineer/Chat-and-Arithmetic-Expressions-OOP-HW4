package homework4;

/**
 * An Observer is a model which represents an object which must
 * receive updates when a Subject object is modified. All implementing
 * classes must implement the update() method.
 */
public interface Observer
{
    void update(Subject subject);
}
