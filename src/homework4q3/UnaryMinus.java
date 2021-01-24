package homework4q3;

public class UnaryMinus extends Expression
{
    private final double number1_;

    public UnaryMinus(int number1)
    {
        number1_ = (double)number1;
    }

    public UnaryMinus(double number1)
    {
        number1_ = number1;
    }

    @Override
    public double eval()
    {
        return -number1_;
    }

    public String toString()
    {
        return "(-" + number1_ + ")";
    }
}
