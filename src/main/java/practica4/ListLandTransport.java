package practica4;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport
{
    List<Land> land = new ArrayList<>();

    public void addLand(Land land){
        this.land.add(land);
    }

    public void display() {
        this.land.stream().forEach(land1 -> System.out.println(land1.displayData()));
    }
}
