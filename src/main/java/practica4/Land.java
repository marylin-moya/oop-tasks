package practica4;

public class Land extends Transport
{
    boolean hasMotor;

    public Land(String name, int price, boolean hasMotor)
    {
        super(name, price);
        this.hasMotor = hasMotor;
    }

    public String displayData() {
      return "Land: " + name + " " + price + " " + hasMotor;
    }
}
