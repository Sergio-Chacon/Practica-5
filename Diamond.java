public class Diamond extends SquareDisplay {
    public Diamond(Posicion p) {
        moveHorizontal(p.getX() - 15);
        moveVertical(p.getY() - 15);
        changeColor("magenta");
        changeSize(30);
        makeVisible();
    }
}
