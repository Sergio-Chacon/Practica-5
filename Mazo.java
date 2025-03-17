import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
    private List<Carta> cartas;
    private List<Carta> pilaNoRepartidas;

    // Constructor
    public Mazo() {
        cartas = new ArrayList<>();
        pilaNoRepartidas = new ArrayList<>();
        inicializarMazo();
    }

    // Método para inicializar el mazo con todas las cartas
    private void inicializarMazo() {
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // Recorre todos los palos del enum Palo
        for (Carta.Palo palo : Carta.Palo.values()) {
            for (String valor : valores) {
                cartas.add(new Carta(valor, palo));  // Crea una carta y la añade al mazo
            }
        }
    }

    // Método para barajar el mazo
    public void barajar() {
        Collections.shuffle(cartas);  // Baraja las cartas aleatoriamente
    }

    // Método para repartir cartas a los jugadores
    public List<Carta> repartirCartas(int numCartas) {
        if (numCartas < 0) {
            throw new IllegalArgumentException("El número de cartas a repartir no puede ser negativo.");
        }

        List<Carta> cartasRepartidas = new ArrayList<>();

        for (int i = 0; i < numCartas; i++) {
            if (!cartas.isEmpty()) {
                Carta carta = cartas.remove(0);  // Toma la primera carta del mazo
                cartasRepartidas.add(carta);  // Añade la carta a la lista de cartas repartidas
            } else {
                System.out.println("No hay suficientes cartas en el mazo.");
                break;
            }
        }

        return cartasRepartidas;
    }

    // Método para gestionar la pila de cartas no repartidas
    public void agregarCartaNoRepartida(Carta carta) {
        if (carta != null) {
            pilaNoRepartidas.add(carta);  // Añade una carta a la pila no repartida
        }
    }

    public Carta quitarCartaNoRepartida() {
        if (!pilaNoRepartidas.isEmpty()) {
            return pilaNoRepartidas.remove(0);  // Retira y devuelve la primera carta de la pila
        } else {
            System.out.println("No hay cartas en la pila no repartidas.");
            return null;
        }
    }

    // Método para mostrar el estado actual del mazo
    public void mostrarEstadoMazo() {
        System.out.println("Cartas en el mazo: " + cartas.size());
        System.out.println("Cartas no repartidas: " + pilaNoRepartidas.size());
    }

    // Restablecer el mazo a su configuración inicial
    public void restablecerMazo() {
        cartas.clear();
        pilaNoRepartidas.clear();
        inicializarMazo();
    }
}
