package homework4;

/**
 * Represents the most basic arithmetic expression: a constant expression. A
 * constant expression consists of a single field representing its numeric
 * value. A constant expression can be evaluated to get its numeric value, or
 * can be converted to a string which represents the constant expression.
 *
 * The following field are used in the specification:
 *
 * number : Number  // the numeric value of the constant expression
 */
public class Constant extends Expression
{
    // Abstraction Function:
    // A Constant represents a simple arithmetic expression with one field,
    // whose numeric value is number.

    // Representation Invariant:
    // number is a subtype of Double or Integer and number != null.

    private final Number number_;

    /**
     * Creates a new Constant.
     * @requires number != null && (number instanceof Double || number
     * instanceof Integer)
     * @modifies this
     * @effects Creates a new Constant with the numeric value of number.
     */
    public Constant(Number number)
    {
        number_ = number;
        checkRep();
    }

    /**
     * Evaluates this Constant
     * @requires none
     * @modifies none
     * @effects Returns a double whose value corresponds to the numeric value
     * of this
     */
    @Override
    public Double eval()
    {
        checkRep();
        // To care of both cases: Integer and Double
        return number_.doubleValue();
    }

    /**
     * Returns a string representing this Constant
     * @requires none
     * @modifies none
     * @effects Returns a string representing this Constant
     */
    @Override
    public String toString()
    {
        checkRep();
        return number_.toString();
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        assert number_ != null : "Null number";
        assert (number_ instanceof Double || number_ instanceof Integer) :
                "Illegal number type";
    }
}
