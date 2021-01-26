package homework4;

/**
 * Represents an arithmetic expression of the form -A, where A is another
 * Arithmetic Expression. A UnaryMinus consists of one field which represents
 * the number that shall be multiplied by -1. A UnaryMinus can be evaluated to
 * get its numeric value, or can be converted to a string which represents
 * the UnaryMinus expression.
 *
 * The following field are used in the specification:
 *
 * number1 : Expression  // the Expression to be multiplied by -1
 */
public class UnaryMinus extends Expression
{
    // Abstraction Function:
    // A UnaryMinus represents an arithmetic operation of the type -1 * number1.

    // Representation Invariant:
    // number1 != null

    private final Expression number1_;

    /**
     * Creates a new UnaryMinus.
     * @requires number1 != null &&
     * (number1 instanceof Double || number1 instanceof Integer)
     * @modifies this
     * @effects Creates a new UnaryMinus with the argument number1.
     */
    public UnaryMinus(Number number1)
    {
        number1_ = new Constant(number1);
        checkRep();
    }

    /**
     * Creates a new UnaryMinus.
     * @requires number1 != null
     * @modifies this
     * @effects Creates a new UnaryMinus with the argument number1.
     */
    public UnaryMinus(Expression number1)
    {
        number1_ = number1;
        checkRep();
    }

    /**
     * Evaluates this UnaryMinus expression
     * @requires none
     * @modifies none
     * @effects returns a Double with the value of -number1.
     */
    @Override
    public Double eval()
    {
        checkRep();
        return -number1_.eval();
    }

    /**
     * Returns a string representing this UnaryMinus expression
     * @requires none
     * @modifies none
     * @effects Returns a string representing this UnaryMinus expression
     */
    public String toString()
    {
        checkRep();
        return "(-" + number1_.toString() + ")";
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        assert number1_ != null : "Null number";
    }
}
