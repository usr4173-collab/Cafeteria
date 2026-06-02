import net.salesianos.cafeteria.Pedido;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Pedido> pedidos = new LinkedList<>();

    
        pedidos.add(new Pedido("P001","Carla","Café con leche",true));
        pedidos.add(new Pedido("P002","Rosa","Bocadillo de pollo",false));
        pedidos.add(new Pedido("P003","Miriam","Zumo natural",true));
        pedidos.add(new Pedido("P004","Fernando","Tostada integral",false));
        pedidos.add(new Pedido("P005","Laura","Café con leche",true));

        System.out.println("PEDIDOS PENDIENTES:");
        System.out.println(pedidos);

        System.out.println("\nPrimer pedido:");
        System.out.println(pedidos.peek());

        Stack<Pedido> preparados = new Stack<>();

        preparados.push(pedidos.poll());
        preparados.push(pedidos.poll());
        preparados.push(pedidos.poll());


        System.out.println("\nÚltimo pedido preparado:");
        System.out.println(preparados.peek());

        System.out.println("\nPedido extraído del historial:");
        System.out.println(preparados.pop());

        System.out.println("\nPedidos pendientes:");
        System.out.println(pedidos.size());

        System.out.println("\n¿La cola está vacía?");
        System.out.println(pedidos.isEmpty());
    }
}
