//Mehtod overriding
public class r3
{
    public void show()
        {
            System.out.println("hiii");
        }
    }
    class B extends r3
    {
        public void show()
        {
            System.out.println("heloooo");
        }

    }

    class Main
    {
        public static void main(String[] args)
        {
            r3 a=new r3();
            B b=new B();
            a.show();
            b.show();
        }
    }

