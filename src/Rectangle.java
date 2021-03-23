public class Rectangle {
    private float height;
    private float width;

    public Rectangle(float width, float height) {
        this.height = height;
        this.width = width;
    }

    public float computeArea() {
        return this.width * this.height;
    }

}