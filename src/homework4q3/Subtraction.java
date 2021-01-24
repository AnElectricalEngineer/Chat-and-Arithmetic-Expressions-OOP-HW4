package homework4q3;

public class Subtraction extends Expression
{
    private final double number1_;
    private final double number2_;

    public Subtraction(int number1, int number2)
    {
        number1_ = (double)number1;
        number2_ = (double)number2;
    }

    public Subtraction(int number1, double number2)
    {
        number1_ = (double)number1;
        number2_ = number2;
    }

    public Subtraction(double number1, int number2)
    {
        number1_ = number1;
        number2_ = (double)number2;
    }

    public Subtraction(double number1, double number2)
    {
        number1_ = number1;
        number2_ = number2;
    }

    @Override
    public Number eval()
    {
        return number1_ - number2_;
    }

    public String toString()
    {
        return "(" + number1_ + " - " + number2_ + ")";
    }
}
