public class Heart extends TriangleDisplay {
    public Heart(Posicion p) {
        moveHorizontal(p.getX() - 60);
        moveVertical(p.getY() - 60);
        changeColor("red");
        changeSize(30, 30);
        makeVisible();
    }
}
