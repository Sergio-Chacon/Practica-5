public class Main { 
    public static void main(String[] args) {
        // Crear una carta
        Carta carta1 = new Carta("2", Carta.Palo.Corazones);
        
        // Crear una posición para la carta
        Posicion posicion1 = new Posicion(20, 40);
        
        // Llamar al método carta para dibujarla en la posición indicada
        Visualizador.carta(carta1, posicion1);
    }
}
