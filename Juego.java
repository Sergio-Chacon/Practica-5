import java.util.List;

public class Juego {
    public static void main(String[] args) {
        // Crea un mazo y lo barajea
        Mazo mazo = new Mazo();
        mazo.barajar();

        // Crea los jugadores
        Jugador jugador1 = new Jugador("Sergio");
        Jugador jugador2 = new Jugador("Sofia");

        // Reparte las cartas a los jugadores
        List<Carta> cartasJugador1 = mazo.repartirCartas(5);
        List<Carta> cartasJugador2 = mazo.repartirCartas(5);

        jugador1.asignarCartas(cartasJugador1);
        jugador2.asignarCartas(cartasJugador2);

        // Muestra informacion de los jugadores
        System.out.println(jugador1);
        System.out.println(jugador2);

        // Muestra el estado del mazo
        mazo.mostrarEstadoMazo();

        // Gestiona la pila de cartas no repartidas
        Carta cartaNoRepartida = new Carta("J", Carta.Palo.Corazones);  
        mazo.agregarCartaNoRepartida(cartaNoRepartida);
        System.out.println("Carta agregada a la pila no repartidas: " + cartaNoRepartida);

        // Muestra el estado del mazo despues de agregar una carta no repartida
        mazo.mostrarEstadoMazo();

        // Quita una carta de la pila no repartidas
        Carta cartaQuitada = mazo.quitarCartaNoRepartida();
        if (cartaQuitada != null) {
            System.out.println("Carta quitada de la pila no repartidas: " + cartaQuitada);
        }

        // Muestra el estado final del mazo
        mazo.mostrarEstadoMazo();
    }
}
