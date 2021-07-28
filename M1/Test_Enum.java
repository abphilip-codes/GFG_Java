package M1;
// A simple enum example where enum is declared
// outside any class (Note enum keyword instead of
// class keyword)

/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/
public class Test_Enum
{
    // Driver method
    enum Color
    {
        RED, GREEN, BLUE;
    }

    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}