public class Visualizador {

    /**
     * Muestra la representación gráfica de una carta en la posición dada.
     * 
     * @param c La carta que se desea mostrar.
     * @param p La posición en la que se desea mostrar la carta.
     */
    public static void carta(Carta c, Posicion p) {
        // Obtener el valor y el palo de la carta
        String valor = c.getValorCarta();  // El valor de la carta (2, 3, ..., J, Q, K, A)
        Carta.Palo palo = c.getPalo();    // El palo de la carta (Corazones, Diamantes, etc.)

        // Crear una variable para el color
        String color = "black"; // Este es un color por defecto, lo puedes cambiar en función del palo

        // Determinar el color basado en el palo
        switch (palo) {
            case Corazones:
            case Diamantes:
                color = "red";  // Rojo para corazones y diamantes
                break;
            case Treboles:
            case Espadas:
                color = "black";  // Negro para tréboles y espadas
                break;
        }

        // Determinar la forma gráfica de la carta en función del valor
        if (valor.equals("2") || valor.equals("3") || valor.equals("4") || valor.equals("5") || 
            valor.equals("6") || valor.equals("7") || valor.equals("8") || valor.equals("9") || 
            valor.equals("10")) {
            Square square = new Square();  // Usamos un cuadrado para valores numéricos
            square.changeColor(color);
            square.makeVisible();
            square.moveHorizontal(p.getX());
            square.moveVertical(p.getY());
        } else if (valor.equals("J")) {
            Triangle triangle = new Triangle();  // Usamos un triángulo para el "J" (Jota)
            triangle.changeColor(color);
            triangle.makeVisible();
            triangle.moveHorizontal(p.getX());
            triangle.moveVertical(p.getY());
        } else if (valor.equals("Q")) {
            Circle circle = new Circle();  // Usamos un círculo para la "Q" (Reina)
            circle.changeColor(color);
            circle.makeVisible();
            circle.moveHorizontal(p.getX());
            circle.moveVertical(p.getY());
        } else if (valor.equals("K")) {
            Person person = new Person();  // Usamos una figura humana para el "K" (Rey)
            person.changeColor(color);
            person.makeVisible();
            person.moveHorizontal(p.getX());
            person.moveVertical(p.getY());
        } else if (valor.equals("A")) {
            Square square = new Square();  // Usamos un cuadrado para el "A" (As)
            square.changeColor(color);
            square.makeVisible();
            square.moveHorizontal(p.getX());
            square.moveVertical(p.getY());
        }
        // Agregar más casos si es necesario para otras representaciones gráficas.
    }
}
