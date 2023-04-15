//
//Abstraction
abstract class r4
{
    public abstract void rc();
}
class rc1 extends r4{
    public void rc()
    {
        System.out.println("5");
    }
}
class rc2
{
    public static void main(String[] args)
    {
        rc1 babe =new rc1();
        babe.rc();
    }
}