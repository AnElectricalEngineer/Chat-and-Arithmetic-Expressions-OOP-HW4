package homework4;

/**
 * Represents an arithmetic expression, eg. addition, subtraction,
 * multiplication, division, unary minus. An expression can be evaluated to
 * get its numeric value, or can be converted to a string which represents
 * the expression.
 */
public abstract class Expression
{
    public abstract Double eval();
    public abstract String toString();
}
