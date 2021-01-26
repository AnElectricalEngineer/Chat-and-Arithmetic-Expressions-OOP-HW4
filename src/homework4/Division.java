package homework4;

/**
 * Represents an arithmetic expression of the form A / B, where A and B are
 * other Arithmetic Expressions. A Division consists of two fields which
 * represent the two number to be divided. A Division can be evaluated to get
 * its numeric value, or can be converted to a string which represents the
 * Division expression.
 *
 * The following field are used in the specification:
 *
 * number1 : Expression  // the numerator
 * number2 : Expression  // the denominator
 */
public class Division extends Expression
{
    // Abstraction Function:
    // A Division represents a division operation of the type number1 /
    // number2.

    // Representation Invariant:
    // number1 != null && number2 != null && number2 != 0

    private final Expression number1_;
    private final Expression number2_;

    /**
     * Creates a new Division.
     * @requires number1 != null && number2 != null && (number1 instanceof
     * Double || number1 instanceof Integer) && (number2 instanceof Double ||
     * number2 instanceof Integer) && !number2.equals(0)
     * @modifies this
     * @effects Creates a new Division with the numerator number1 and the
     * denominator number2.
     */
    public Division(Number number1, Number number2)
    {
        number1_ = new Constant(number1);
        number2_ = new Constant(number2);
        checkRep();
    }

    /**
     * Creates a new Division.
     * @requires number1 != null && number2 != null &&
     * (number2 instanceof Double || number2 instanceof Integer) &&
     * !number2.equals(0)
     * @modifies this
     * @effects Creates a new Division with the numerator number1 and the
     * denominator number2.
     */
    public Division(Expression number1, Number number2)
    {
        number1_ = number1;
        number2_ = new Constant(number2);
        checkRep();
    }

    /**
     * Creates a new Division.
     * @requires number1 != null && number2 != null &&
     * (number1 instanceof Double || number1 instanceof Integer)
     * && number2.eval() != 0
     * @modifies this
     * @effects Creates a new Division with the numerator number1 and the
     * denominator number2.
     */
    public Division(Number number1, Expression number2)
    {
        number1_ = new Constant(number1);
        number2_ = number2;
        checkRep();
    }

    /**
     * Creates a new Division.
     * @requires number1 != null && number2 != null && number2.eval() != 0
     * @modifies this
     * @effects Creates a new Division with the numerator number1 and the
     * denominator number2.
     */
    public Division(Expression number1, Expression number2)
    {
        number1_ = number1;
        number2_ = number2;
        checkRep();
    }

    /**
     * Evaluates this Division expression
     * @requires none
     * @modifies none
     * @effects returns a Double with the value of number1 / number2
     */
    @Override
    public Double eval()
    {
        checkRep();
        return number1_.eval() / number2_.eval();
    }

    /**
     * Returns a string representing this Division expression
     * @requires none
     * @modifies none
     * @effects Returns a string representing this Division expression
     */
    public String toString()
    {
        checkRep();
        return "(" + number1_.toString() + " / " + number2_.toString() + ")";
    }

    /**
     * Checks that the representation invariant is maintained.
     * @effects Checks that the representation invariant is maintained.
     * Aborts the program if rep invariant is broken.
     */
    private void checkRep()
    {
        assert number1_ != null && number2_ != null : "Null number";
        assert number2_.eval() != 0 : "Division by 0";
    }

}
