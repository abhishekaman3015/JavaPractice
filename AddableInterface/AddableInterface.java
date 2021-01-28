interface Addable{
    public int add(int a, int b);
    static void test(){
        System.out.println("Test static method in functional interface, using lambda expression");
    }
}
public class AddableInterface
{
    public static void main(String[] args)
    {
        Addable a1=(a,b)->a+b;
        System.out.println(a1.add(40,60));

        Addable.test();
    }
}