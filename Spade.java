public class Spade extends TriangleDisplay {
    public Spade(Posicion p) {
        moveHorizontal(p.getX() - 15);
        moveVertical(p.getY() - 15);
        changeColor("black");
        changeSize(30, 30);
        makeVisible();
    }
}
