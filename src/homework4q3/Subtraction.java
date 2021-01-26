package homework4q3;

public class Subtraction extends Expression
{
    private final Expression number1_;
    private final Expression number2_;

    public Subtraction(Number number1, Number number2)
    {
        number1_ = new Constant(number1);
        number2_ = new Constant(number2);
    }

    public Subtraction(Expression number1, Number number2)
    {
        number1_ = number1;
        number2_ = new Constant(number2);
    }

    public Subtraction(Number number1, Expression number2)
    {
        number1_ = new Constant(number1);
        number2_ = number2;
    }

    public Subtraction(Expression number1, Expression number2)
    {
        number1_ = number1;
        number2_ = number2;
    }

    @Override
    public Double eval()
    {
        return number1_.eval() - number2_.eval();
    }

    public String toString()
    {
        return "(" + number1_.toString() + " - " + number2_.toString() + ")";
    }
}
