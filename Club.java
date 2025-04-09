public class Club extends CircleDisplay {
    public Club(Posicion p) {
        moveHorizontal(p.getX() - 15);
        moveVertical(p.getY() - 15);
        changeColor("green");
        changeSize(30);
        makeVisible();
    }
}
