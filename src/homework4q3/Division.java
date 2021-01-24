package homework4q3;

public class Division extends Expression
{
    private final double number1_;
    private final double number2_;

    public Division(int number1, int number2)
    {
        number1_ = (double)number1;
        number2_ = (double)number2;
    }

    public Division(int number1, double number2)
    {
        number1_ = (double)number1;
        number2_ = number2;
    }

    public Division(double number1, int number2)
    {
        number1_ = number1;
        number2_ = (double)number2;
    }

    public Division(double number1, double number2)
    {
        number1_ = number1;
        number2_ = number2;
    }

    //TODO when writing rep invariant, add num2 cant be 0, maybe add that
    // throws except if so instead
    @Override
    public Number eval()
    {
        return number1_ / number2_;
    }

    public String toString()
    {
        return "(" + number1_ + " / " + number2_ + ")";
    }
}
