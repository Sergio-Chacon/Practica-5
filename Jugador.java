import java.util.ArrayList;
import java.util.List;

public class Jugador {
    public String nombre;
    private List<Carta> cartas;

    // Constructor
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.cartas = new ArrayList<>();
    }

    // Método para asignar cartas al jugador
    public void asignarCartas(List<Carta> nuevasCartas) {
        cartas.addAll(nuevasCartas);
    }

    // Método para deshacerse de cartas
    public void deshacerseDeCartas(List<Carta> cartasADescartar) {
        cartas.removeAll(cartasADescartar);
    }

    // Método para regresar la información del jugador
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Jugador: ").append(nombre).append("\nCartas:\n");
        for (Carta carta : cartas) {
            info.append(carta.toString()).append("\n");
        }
        return info.toString();
    }
}
