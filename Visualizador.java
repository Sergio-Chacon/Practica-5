public class Visualizador {
    public static void carta(Carta c, Posicion p) {
        int x = p.getX();
        int y = p.getY();

        // Dibuja el fondo de la carta
        SquareDisplay base = new SquareDisplay();
        base.changeColor("white");
        base.changeSize(100);
        base.moveHorizontal(x - 20);
        base.moveVertical(y - 20);
        base.makeVisible();

        // Dibuja círculos para representar el valor
        int valor = c.getValorNumerico();
        for (int i = 0; i < valor && i < 10; i++) {
            CircleDisplay circulo = new CircleDisplay();
            circulo.changeColor("blue");
            circulo.changeSize(10);
            circulo.moveHorizontal(x + (i % 5) * 12 - 20);
            circulo.moveVertical(y + (i / 5) * 12 - 20);
            circulo.makeVisible();
        }

        // Dibuja el palo en la esquina inferior derecha
        Posicion posPalo = new Posicion(x + 25, y + 25);
        switch (c.getPalo()) {
            case Corazones:
                new Heart(posPalo);
                break;
            case Diamantes:
                new Diamond(posPalo);
                break;
            case Treboles:
                new Club(posPalo);
                break;
            case Espadas:
                new Spade(posPalo);
                break;
        }
    }
}
