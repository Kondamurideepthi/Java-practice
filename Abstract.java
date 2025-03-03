abstract class Animal
{
    public abstract void cat();
    public abstract void dog();
    public void main()
    {
        System.out.println("Hey I'm in Animal classs");
    }
}
abstract class SubAnimal extends Animal
{
    public void cat()
    {
        System.out.println("cat sounds like meow");
    }

}
class Concrete extends SubAnimal
{
    public void dog()
    {
        System.out.println("Dog Barks");
    }
}
public class Abstract
{
    public static void main(String[] args) {
        Animal obj=new Concrete();
        obj.cat();
        obj.dog();
        obj.main();
    }
}













