package homework4q3;

/**
 * Represents the most basic arithmetic expression: a constant expression. A
 * constant expression consists a single field representing its numeric value.
 * A constant expression can be evaluated to get its numeric value, or can be
 * converted to a string which represents the constant expression.
 *
 * The following field are used in the specification:
 *
 * number : Number  // the numeric value of the constant expression
 */
public class Constant extends Expression
{
    // Abstraction Function:

    // Representation Invariant:

    private final Number number_;

    public Constant(Number number)
    {
        number_ = number;
    }

    @Override
    public Double eval()
    {
        // To care of both cases: Integer and Double
        return number_.doubleValue();
    }

    @Override
    public String toString()
    {
        return number_.toString();
    }
}
