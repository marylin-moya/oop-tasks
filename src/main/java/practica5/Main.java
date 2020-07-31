package practica5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //region List Declaration
        List<Detalle> detallesPed1 = new ArrayList<>();
        detallesPed1.add(new Detalle("cod1", "cocina", 2, 1000, 10, 1990));
        detallesPed1.add(new Detalle("cod2", "lavadora", 1, 2500, 0, 2500));
        detallesPed1.add(new Detalle("cod3", "plancha", 5, 300, 50, 1450));

        List<Detalle> detallesPed2 = new ArrayList<>();
        detallesPed2.add(new Detalle("cod4", "mesa", 2, 700, 30, 1370));
        detallesPed2.add(new Detalle("cod5", "muebles", 1, 3500, 0, 3500));
        detallesPed2.add(new Detalle("cod6", "comoda", 3, 800, 100, 2300));

        List<Detalle> detallesPed3 = new ArrayList<>();
        detallesPed3.add(new Detalle("cod7", "camisa", 10, 100, 100, 900));
        detallesPed3.add(new Detalle("cod8", "polera", 20, 80, 0, 1600));
        detallesPed3.add(new Detalle("cod9", "zapatos", 8, 400, 200, 3000));


        List<Pedido> allPedidos = new ArrayList<>();
        allPedidos.add(new Pedido("ped1", "normal", "Juan Perez", "2020-05-05", detallesPed1));
        allPedidos.add(new Pedido("ped2", "programado", "Maria Guzman", "2020-05-03", detallesPed2));
        allPedidos.add(new Pedido("ped3", "normal", "Juan Perez", "2020-05-10", detallesPed3));


        //endregion

        System.out.println("------Select client from Pedido-------");
        allPedidos.stream()    //from
                .map(pedido -> pedido.getCliente())     //select
                .forEach(value -> System.out.println(value));

        System.out.println("------Select client from Pedido where tipoPedido = 'normal'-------");
        allPedidos.stream()                                                    //from
                .filter(pedido -> pedido.getTipoPedido().equals("normal"))  //where
                .map(Pedido::getCliente)                                    //select
                .forEach(value -> System.out.println(value));

        System.out.println("------Select codPedido from Pedido where fecha = '2020-05-05'-------");
        allPedidos.stream()                                        //from
                .filter(pedido -> "2020-05-05".equals(pedido.getFecha()))  //where
                .map(value -> value.getCodPedido())             //select
                .forEach(value -> System.out.println(value));

        System.out.println("------Select producto from Detalle, Pedido where Pedido.codPedido = Detalle.codPedido and Pedido.codPedido = 'ped1'-------");

        allPedidos.stream()
                .filter(pedido -> "ped1".equals(pedido.getCodPedido()))
                .map(pedido -> pedido.getDetalles())
                .flatMap(detalles -> detalles.stream())
                .map(detalle -> detalle.getProducto())
                .forEach(System.out::println);

        System.out.println("------Select detalle.producto from Detalle, detalle where Pedido.codPedido = Detalle.codPedido and cantidad > 8-------");
        allPedidos.stream()
                .map(pedido -> pedido.getDetalles())
                .flatMap(detalles -> detalles.stream())
                .filter(detalle -> detalle.getCantidad()>8)
                .map(detalle -> detalle.getProducto())
                .forEach(System.out::println);
    }

}
