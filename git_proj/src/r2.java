//Method overloading
public class r2
{
    public int run(int a,int b)
    {
        return a*b;
    }
    public float run(float a,float b,float c)
    {
        return a*b*c;
    }
}

class Prog
{
    public static void main(String[] args)
    {
        r2 a=new r2();
        System.out.println(a.run(10,20));
        System.out.println(a.run(10.5f,20.6f,6.7f));
    }
}

