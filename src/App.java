import net.salesianos.cafeteria.Pedido;
import net.salesianos.torneo.Participante;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Queue<Pedido> pedidos = new LinkedList<>();

        System.out.println("Actividad 1");
        pedidos.add(new Pedido("P001", "Carla", "Café con leche", true));
        pedidos.add(new Pedido("P002", "Rosa", "Bocadillo de pollo", false));
        pedidos.add(new Pedido("P003", "Miriam", "Zumo natural", true));
        pedidos.add(new Pedido("P004", "Fernando", "Tostada integral", false));
        pedidos.add(new Pedido("P005", "Laura", "Café con leche", true));

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

        System.out.println("Actividad 2");

        HashSet<Participante> participantes = new HashSet<>();

        int intentos = 7;

        participantes.add(new Participante("J001", "Shrek", "Junior"));
        participantes.add(new Participante("J002", "Fiona", "Junior"));
        participantes.add(new Participante("J003", "Asno", "Senior"));
        participantes.add(new Participante("J001", "Shrek repetido", "Senior"));
        participantes.add(new Participante("J004", "Encantador", "Senior"));
        participantes.add(new Participante("J005", "Gengi", "Junior"));
        participantes.add(new Participante("J006", "Gato", "Experto"));

        System.out.println("Participantes: ");
        System.out.println(participantes);

        // Intentos
        System.out.println("\nIntentos añadidos: " + intentos);

        // Cantidad real de participantes
        System.out.println("Añadidos reales: " + participantes.size());

        // No se añaden duplicados porque J001 ya existía

        HashMap<String, Integer> categorias = new HashMap<>();

        for (Participante p : participantes) {

            String categoria = p.getCategoria();

            if (categorias.containsKey(categoria)) {
                categorias.put(categoria,
                        categorias.get(categoria) + 1);
            } else {
                categorias.put(categoria, 1);
            }
        }

        System.out.println("\nMapa de categorías: ");
        System.out.println(categorias);

        System.out.println("\nJunior: ");
        System.out.println(categorias.get("Junior"));

        System.out.println("\n¿Existe algún experto?");
        System.out.println(categorias.containsKey("Experto"));

        //Eliminamos experto
        if (categorias.containsKey("Experto")) {
            categorias.remove("Experto");
        }

        System.out.println("\nClaves del mapa: ");
        System.out.println(categorias.keySet());

    }
}
