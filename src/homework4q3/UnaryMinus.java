package homework4q3;

public class UnaryMinus extends Expression
{
    private final Expression number1_;

    public UnaryMinus(Number number1)
    {
        number1_ = new Constant(number1);
    }

    public UnaryMinus(Expression number1)
    {
        number1_ = number1;
    }

    @Override
    public Double eval()
    {
        return -number1_.eval();
    }

    public String toString()
    {
        return "(-" + number1_.toString() + ")";
    }
}
