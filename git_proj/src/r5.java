//Encapsulation
 public class r5
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
}
class ummah
{
    public static void main(String args[])
    {
        r5 luv=new r5();
        luv.setName("I luv uh babe");
        System.out.println("Hey chandhana "+luv.getName());
    }
}