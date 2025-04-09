public class Main {
    public static void main(String[] args) {
        Carta carta1 = new Carta("5", Carta.Palo.Corazones);
        Posicion posicion1 = new Posicion(100, 100);
        Visualizador.carta(carta1, posicion1);

        Carta carta2 = new Carta("K", Carta.Palo.Diamantes);
        Posicion posicion2 = new Posicion(250, 100);
        Visualizador.carta(carta2, posicion2);

        Carta carta3 = new Carta("3", Carta.Palo.Treboles);
        Posicion posicion3 = new Posicion(100, 250);
        Visualizador.carta(carta3, posicion3);

        Carta carta4 = new Carta("A", Carta.Palo.Espadas);
        Posicion posicion4 = new Posicion(250, 250);
        Visualizador.carta(carta4, posicion4);
    }
}
