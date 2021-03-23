public class Square {
    private float side;
    public Square(float side) {
       this.setSide(side);
    }
    public void setSide(float side) {
        this.side = side;
    }
    public float getSide() {
        return side;
    }
    public double computeArea(){
        return getSide() * getSide();
    }

}
