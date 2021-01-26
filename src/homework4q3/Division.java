package homework4q3;

public class Division extends Expression
{
    private final Expression number1_;
    private final Expression number2_;

    public Division(Number number1, Number number2)
    {
        number1_ = new Constant(number1);
        number2_ = new Constant(number2);
    }

    public Division(Expression number1, Number number2)
    {
        number1_ = number1;
        number2_ = new Constant(number2);
    }

    public Division(Number number1, Expression number2)
    {
        number1_ = new Constant(number1);
        number2_ = number2;
    }

    public Division(Expression number1, Expression number2)
    {
        number1_ = number1;
        number2_ = number2;
    }

    //TODO when writing rep invariant, add num2 cant be 0, maybe add that
    // throws except if so instead
    @Override
    public Double eval()
    {
        return number1_.eval() / number2_.eval();
    }

    public String toString()
    {
        return "(" + number1_.toString() + " / " + number2_.toString() + ")";
    }
}
