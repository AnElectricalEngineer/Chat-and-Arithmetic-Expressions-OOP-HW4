package homework4;

/**
 * Represents an arithmetic expression of the form A * B, where A and B are
 * other Arithmetic Expressions. A Multiplication consists of two fields which
 * represent the two number to be multiplied. A Multiplication can be evaluated to
 * get its numeric value, or can be converted to a string which represents the
 * Multiplication expression.
 *
 * The following field are used in the specification:
 *
 * number1 : Expression  // the first Expression to be multiplied
 * number2 : Expression  // the second Expression to be multiplied
 */
public class Multiplication extends Expression
{
    // Abstraction Function:
    // A Multiplication represents a multiplication operation of the type
    // number1 * number2.

    // Representation Invariant:
    // number1 != null && number2 != null

    private final Expression number1_;
    private final Expression number2_;

    /**
     * Creates a new Multiplication.
     * @requires number1 != null && number2 != null && (number1 instanceof
     * Double || number1 instanceof Integer) && (number2 instanceof Double ||
     * number2 instanceof Integer)
     * @modifies this
     * @effects Creates a new Multiplication with the left argument number1 and
     * the right argument number2.
     */
    public Multiplication(Number number1, Number number2)
    {
        number1_ = new Constant(number1);
        number2_ = new Constant(number2);
        checkRep();
    }

    /**
     * Creates a new Multiplication.
     * @requires number1 != null && number2 != null &&
     * (number2 instanceof Double || number2 instanceof Integer)
     * @modifies this
     * @effects Creates a new Multiplication with the left argument number1 and
     * the right argument number2.
     */
    public Multiplication(Expression number1, Number number2)
    {
        number1_ = number1;
        number2_ = new Constant(number2);
        checkRep();
    }

    /**
     * Creates a new Multiplication.
     * @requires number1 != null && number2 != null &&
     * (number1 instanceof Double || number1 instanceof Integer)
     * @modifies this
     * @effects Creates a new Multiplication with the left argument number1 and
     * the right argument number2.
     */
    public Multiplication(Number number1, Expression number2)
    {
        number1_ = new Constant(number1);
        number2_ = number2;
        checkRep();
    }

    /**
     * Creates a new Multiplication.
     * @requires number1 != null && number2 != null
     * @modifies this
     * @effects Creates a new Multiplication with the left argument number1 and
     * the right argument number2.
     */
    public Multiplication(Expression number1, Expression number2)
    {
        number1_ = number1;
        number2_ = number2;
        checkRep();
    }

    /**
     * Evaluates this Multiplication expression
     * @requires none
     * @modifies none
     * @effects returns a Double with the value of number1 * number2
     */
    @Override
    public Double eval()
    {
        checkRep();
        return number1_.eval() * number2_.eval();
    }

    /**
     * Returns a string representing this Multiplication expression
     * @requires none
     * @modifies none
     * @effects Returns a string representing this Multiplication expression
     */
    public String toString()
    {
        checkRep();
        return "(" + number1_.toString() + " * " + number2_.toString() + ")";
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        assert number1_ != null && number2_ != null : "Null number";
    }
}
