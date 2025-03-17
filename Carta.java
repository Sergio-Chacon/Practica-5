public class Carta {
    private String valorCarta;  // Valor de la carta (2, 3, ..., 10, J, Q, K, A)
    private Palo palo;         // Tipo de carta (Palo: Corazones, Diamantes, Treboles, Espadas)

    public enum Palo {
        Corazones, Diamantes, Treboles, Espadas
    }

    // Constructor
    public Carta(String valorCarta, Palo palo) {
        this.valorCarta = valorCarta;
        this.palo = palo;
    }

    // Método para regresar la representación en cadena de la carta
    @Override
    public String toString() {
        return valorCarta + " de " + palo;
    }

    // Método para obtener el valor numérico de la carta
    public int getValorNumerico() {
        switch (valorCarta) {
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default: return Integer.parseInt(valorCarta);  // Para valores numéricos (2-10)
        }
    }

    // Getters
    public String getValorCarta() {
        return valorCarta;
    }

    public Palo getPalo() {
        return palo;
    }
}
