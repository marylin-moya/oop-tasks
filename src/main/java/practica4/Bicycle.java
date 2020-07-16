package practica4;

public class Bicycle extends Land
{
    boolean exerciseBike;

    public Bicycle(String name, int price, boolean hasMotor,  boolean exerciseBike)
    {
        super(name, price, hasMotor);
        this.exerciseBike = exerciseBike;
    }


    @Override public String displayData()
    {
        return "name = " + name + ", price = " + price + ", hasMotor = " + hasMotor + ", exercise = " + exerciseBike;
    }
}
