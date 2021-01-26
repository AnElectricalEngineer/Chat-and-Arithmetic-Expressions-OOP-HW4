package homework4q3;

/**
 * This class can be used to test the implementation of Expressions. The
 * first test is identical to the example given in the homework assignment,
 * and the other tests test each of the different expressions.
 */
public class ExpressionTest
{
    public static void main(String[] args)
    {
        System.out.println("Complex Expression Test: ");
        Expression e = new Multiplication(new Addition(Double.valueOf(2.5),
                Double.valueOf(3.5)), new UnaryMinus(Integer.valueOf(5)));
        System.out.println(e.eval());
        System.out.println(e.toString());

        System.out.println("Addition: ");
        Expression e1 = new Addition(Double.valueOf(1), Double.valueOf(3.4));
        System.out.println(e1.eval());
        System.out.println(e1.toString());

        Expression e2 = new Addition(new Addition(Double.valueOf(2),
                Double.valueOf(5.5)),
                Double.valueOf(3.4));
        System.out.println(e2.eval());
        System.out.println(e2.toString());

        System.out.println("Division: ");
        Expression f1 = new Division(Double.valueOf(9), Double.valueOf(3));
        System.out.println(f1.eval());
        System.out.println(f1.toString());

        Expression f2 = new Division(Double.valueOf(9),
                new Addition(Double.valueOf(1), Double.valueOf(2)));
        System.out.println(f2.eval());
        System.out.println(f2.toString());

        System.out.println("Multiplication: ");
        Expression g1 = new Multiplication(Integer.valueOf(7),
                Integer.valueOf(3));
        System.out.println(g1.eval());
        System.out.println(g1.toString());

        Expression g2 = new Multiplication(new Addition(Double.valueOf(4),
                Double.valueOf(5)), Double.valueOf(7));
        System.out.println(g2.eval());
        System.out.println(g2.toString());

        System.out.println("Subtraction: ");
        Expression h1 = new Subtraction(Integer.valueOf(9), Double.valueOf(3));
        System.out.println(h1.eval());
        System.out.println(h1.toString());

        Expression h2 = new Subtraction(Integer.valueOf(17),
                new Division(Double.valueOf(4), Integer.valueOf(2)));
        System.out.println(h2.eval());
        System.out.println(h2.toString());

        System.out.println("Unary Minus: ");
        Expression i1 = new UnaryMinus(Double.valueOf(9));
        System.out.println(i1.eval());
        System.out.println(i1.toString());

        Expression i2 = new UnaryMinus(new Multiplication(Double.valueOf(4),
                Integer.valueOf(7)));
        System.out.println(i2.eval());
        System.out.println(i2.toString());
    }
}
