package practica4;

public class Car extends Land
{
   boolean useGas;

    public Car(String name, int price, boolean hasMotor, boolean useGas)
    {
        super(name, price, hasMotor);
        this.useGas = useGas;
    }

    @Override public String displayData()
    {
        return "name = " + name + ", price = " + price + ", hasMotor = " + hasMotor + ", useGas = " + useGas;
    }
}
